<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<label>id: <c:out value="${books.id}"></c:out> </label>
<label>title: <c:out value="${books.title}"></c:out> </label>
<label>description: <c:out value="${books.description}"></c:out> </label>
<label>language: <c:out value="${books.language}"></c:out> </label>
<label>pages: <c:out value="${books.numberOfPages}"></c:out> </label>


</body>
</html>