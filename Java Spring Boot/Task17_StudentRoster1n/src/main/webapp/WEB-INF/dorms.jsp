
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
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Dorms</h1>


<table>
<tr>
<th>Dorm</th>
<th>Action</th>
</tr>

<c:forEach var="temp" items="${data}">
<tr>
<td>${temp.name}</td>
<td><a href="/dorms/${temp.id}">See Students</a></td>
</tr>
</c:forEach>

</table>

<a href="/dorm">new dorm</a>
<a href="student">new student</a>
</body>
</html>