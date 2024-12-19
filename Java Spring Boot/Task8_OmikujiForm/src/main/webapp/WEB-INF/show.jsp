<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center text-success mb-4">Here is Your Omikuji!</h1>

        <div class="card shadow-sm p-4">
            <div class="card-body">
                <h3 class="mb-3">My name is: <span class="text-primary"><c:out value="${name}" /></span></h3>
                <h3 class="mb-3">I am <span class="text-primary"><c:out value="${age}" /></span> years old</h3>
                <h3 class="mb-3">From: <span class="text-primary"><c:out value="${city}" /></span></h3>
                <h3 class="mb-3">My phone number: <span class="text-primary"><c:out value="${number}" /></span></h3>
                <p class="fs-4">I will say: <span class="text-success"><c:out value="${nice}" /></span></p>
            </div>
        </div>
        <div class="text-center mt-4">
            <a href="http://localhost:8080/" class="btn btn-primary">Go Back</a>
        </div>
    </div>

</body>
</html>
