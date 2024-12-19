<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h1 class="text-center text-primary mb-4">Send an Omikuji!</h1>

        <form action="/send" method="post" class="border p-4 shadow rounded bg-light">
            
            <div class="mb-3">
                <label for="nameInput" class="form-label">Enter your name:</label>
                <input type="text" class="form-control" id="nameInput" placeholder="Enter your name" name="name">
            </div>
            
            <div class="mb-3">
                <label for="numberSelect" class="form-label">Enter your age:</label>
                <select id="numberSelect" class="form-select" name="age">
                    <option>10</option>
                    <option>20</option>
                    <option>30</option>
                    <option>40</option>
                </select>
            </div>


            <div class="mb-3">
                <label for="cityInput" class="form-label">Enter your city:</label>
                <input type="text" class="form-control" id="cityInput" placeholder="Enter your city" name="city">
            </div>

            <div class="mb-3">
                <label for="phoneInput" class="form-label">Enter your phone number:</label>
                <input type="number" class="form-control" id="phoneInput" placeholder="Enter your phone number" name="number">
            </div>

            <div class="mb-3">
                <label for="niceMessage" class="form-label">Say something nice to someone:</label>
                <textarea class="form-control" id="niceMessage" rows="3" placeholder="Type a nice message" name="nice"></textarea>
            </div>

            <div class="text-center">
                <h3 class="mb-3">Send and show friend</h3>
                <button type="submit" class="btn btn-primary px-4">Send</button>
            </div>
        </form>
    </div>
</body>
</html>
