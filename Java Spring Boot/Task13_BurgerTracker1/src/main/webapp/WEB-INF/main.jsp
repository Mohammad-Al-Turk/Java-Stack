<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Burger Tracker 1</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container my-5">
    <h1 class="text-center text-primary mb-4">Burger Tracker</h1>

    <!-- Table Section -->
    <div class="table-responsive">
        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>Burger Name</th>
                    <th>Restaurant Name</th>
                    <th>Rating (0-5)</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="temp" items="${data}">
                    <tr>
                        <td>${temp.bname}</td>
                        <td>${temp.rname}</td>
                        <td>${temp.rate}</td>
                        <td><a href="editpage/${temp.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Form Section -->
    <div class="card mt-5">
        <div class="card-header bg-primary text-white">
            <h2>Add a Burger</h2>
        </div>
        <div class="card-body">
            <form:form action="/create" method="post" modelAttribute="burger">
                <div class="mb-3">
                    <form:label path="bname" class="form-label">Burger Name</form:label>
                    <form:input path="bname" class="form-control" />
                    <form:errors path="bname" class="text-danger" />
                </div>

                <div class="mb-3">
                    <form:label path="rname" class="form-label">Restaurant Name</form:label>
                    <form:input path="rname" class="form-control" />
                    <form:errors path="rname" class="text-danger" />
                </div>

                <div class="mb-3">
                    <form:label path="rate" class="form-label">Rating (0-5)</form:label>
                    <form:input path="rate" class="form-control" type="number" min="0" max="5" />
                    <form:errors path="rate" class="text-danger" />
                </div>

                <div class="mb-3">
                    <form:label path="note" class="form-label">Notes</form:label>
                    <form:input path="note" class="form-control" />
                    <form:errors path="note" class="text-danger" />
                </div>

                <button type="submit" class="btn btn-primary w-100">Submit</button>
            </form:form>
        </div>
    </div>
</div>

<!-- Bootstrap JS (optional, for interactive components) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
