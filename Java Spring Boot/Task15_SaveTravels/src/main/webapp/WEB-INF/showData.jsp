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
<html>
<head>sad
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Show Data</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="text-center mb-4">
        <a href="/" class="btn btn-primary">&larr; Go Back</a>
    </div>
    <div class="card shadow">
        <div class="card-header bg-primary text-white text-center">
            <h2>Expense Details</h2>
        </div>
        <div class="card-body">
            <p class="fw-bold">Expense Name:</p>
            <p class="text-muted">${data.name}</p>
            <hr>
            <p class="fw-bold">Expense Description:</p>
            <p class="text-muted">${data.description}</p>
            <hr>
            <p class="fw-bold">Vendor:</p>
            <p class="text-muted">${data.vendor}</p>
            <hr>
            <p class="fw-bold">Amount:</p>
            <p class="text-muted">${data.amount}</p>
        </div>
    </div>
</div>

<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
