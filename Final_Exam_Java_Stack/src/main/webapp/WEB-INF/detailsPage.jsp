<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Team Details</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1>Team Details</h1>
        <a href="/dashboard" class="btn btn-secondary">Back to Dashboard</a>
    </div>

    <div class="card shadow-sm">
        <div class="card-body">
            <h3 class="card-title">Team Name: <span class="text-primary">${byIdTeam.teamName}</span></h3>
            <p class="card-text"><strong>Added By:</strong> ${byIdTeam.user.userName}</p>
            <p class="card-text"><strong>Skill Level:</strong> ${byIdTeam.skillLevel}</p>
            <p class="card-text"><strong>Game Day:</strong> ${byIdTeam.gameDay}</p>
            <div class="d-flex justify-content-end mt-4">
                <a href="/editpage/${byIdTeam.id}" class="btn btn-warning me-2">Edit</a>
                <a href="/delete/${byIdTeam.id}" class="btn btn-danger">Delete</a>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
