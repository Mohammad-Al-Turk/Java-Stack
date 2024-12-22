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


<label>id: <c:out value="${id}"></c:out> </label>
<label>title: <c:out value="${title}"></c:out> </label>
<label>description: <c:out value="${description}"></c:out> </label>
<label>language: <c:out value="${language}"></c:out> </label>
<label>pages: <c:out value="${pages}"></c:out> </label>


</body>
</html>