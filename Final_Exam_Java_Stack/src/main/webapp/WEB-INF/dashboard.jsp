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
    <title>Dashboard</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1>Welcome, ${loggedUser.userName}</h1>
        <a href="/logout" class="btn btn-danger">Logout</a>
    </div>

    <table class="table table-striped table-hover">
        <thead class="table-dark">
        <tr>
            <th>Team Name</th>
            <th>Skill Level (1-5)</th>
            <th>Game Day</th>
            <th>Created By</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="temp" items="${allTeams}">
            <tr>
                <td><a href="/detailspage/${temp.id}" class="text-decoration-none">${temp.teamName}</a></td>
                <td>${temp.skillLevel}</td>
                <td>${temp.gameDay}</td>
                <td>${temp.user.userName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="text-end mt-4">
        <form action="/createteampage" method="get">
            <button type="submit" class="btn btn-primary">Create New Team</button>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
