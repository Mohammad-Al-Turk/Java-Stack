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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit a Burger</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

    <div class="container mt-5">
        <div class="card">
            <div class="card-header bg-primary text-white">
                <h2>Edit Burger</h2>
            </div>
            <div class="card-body">

                <!-- Edit form -->
                <form:form action="/editdata/${data.id}" method="post" modelAttribute="burger">
                    <div class="mb-3">
                        <form:label path="bname" class="form-label">Burger Name</form:label>
                        <form:input path="bname" class="form-control" value="${data.bname}" />
                        <form:errors path="bname" class="text-danger" />
                    </div>

                    <div class="mb-3">
                        <form:label path="rname" class="form-label">Restaurant Name</form:label>
                        <form:input path="rname" class="form-control" value="${data.rname}" />
                        <form:errors path="rname" class="text-danger" />
                    </div>

                    <div class="mb-3">
                        <form:label path="rate" class="form-label">Rating (0-5)</form:label>
                        <form:input value="${data.rate}" path="rate" class="form-control" type="number" min="0" max="5" />
                        <form:errors path="rate" class="text-danger" />
                    </div>

                    <div class="mb-3">
                        <form:label path="note" class="form-label">Notes</form:label>
                        <form:input path="note" class="form-control" value="${data.note}" />
                        <form:errors path="note" class="text-danger" />
                    </div>

                    <button type="submit" class="btn btn-primary w-100">Update Burger</button>
                </form:form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
