<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save Travels</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

    <h1 class="text-center mb-4">Save Travels</h1>

    <table class="table table-hover table-bordered align-middle">
        <thead class="table-dark">
            <tr>
                <th>Expense</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Action</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="temp" items="${data}">
                <tr>
                    <td> <a href="/show/${temp.id}">${temp.name}</a> </td>
                    <td>${temp.vendor}</td>
                    <td>${temp.amount}</td>
                    <td>
                        <a href="/editPage/${temp.id}" class="btn btn-warning btn-sm">Edit</a>
                    </td>
                    <td>
                        <button class="btn btn-danger btn-sm" onclick="location.href='/delete/${temp.id}'">Delete</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <h1 class="text-center mt-5">Add an Expense</h1>
    <form:form action="/create" method="post" modelAttribute="exp" class="p-4 bg-light shadow rounded">
        <div class="mb-3">
            <form:label path="name" class="form-label">Name:</form:label>
            <form:input path="name" class="form-control" placeholder="Enter expense name"/>
            <form:errors path="name" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="vendor" class="form-label">Vendor:</form:label>
            <form:input path="vendor" class="form-control" placeholder="Enter vendor name"/>
            <form:errors path="vendor" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="amount" class="form-label">Amount:</form:label>
            <form:input path="amount" class="form-control" placeholder="Enter amount"/>
            <form:errors path="amount" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="description" class="form-label">Description:</form:label>
            <form:textarea path="description" class="form-control" rows="3" placeholder="Enter description"></form:textarea>
            <form:errors path="description" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form:form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
