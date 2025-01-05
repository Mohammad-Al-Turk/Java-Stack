<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create New Team</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1>Create New Team</h1>
        <a href="/dashboard" class="btn btn-secondary">Back to Dashboard</a>
    </div>

    <div class="card shadow-sm">
        <div class="card-body">
            <form:form action="/createteamprocess" method="post" modelAttribute="team">

                <div class="mb-3">
                    <form:label path="teamName" class="form-label">Team Name:</form:label>
                    <form:input path="teamName" class="form-control"/>
                    <form:errors path="teamName" class="text-danger"/>
                </div>

                <div class="mb-3">
                    <form:label path="skillLevel" class="form-label">Skill Level (1-5):</form:label>
                    <form:input path="skillLevel" class="form-control"/>
                    <form:errors path="skillLevel" class="text-danger"/>
                </div>

                <div class="mb-3">
                    <form:label path="gameDay" class="form-label">Game Day:</form:label>
                    <form:input path="gameDay" class="form-control"/>
                    <form:errors path="gameDay" class="text-danger"/>
                </div>

                <form:hidden path="user" value="${loggedUser.id}"/>

                <div class="d-flex justify-content-end">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>

            </form:form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
