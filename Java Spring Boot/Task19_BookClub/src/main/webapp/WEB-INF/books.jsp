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
<title>Books</title>
</head>
<body>

<h1> welcome, ${loggedUser.userName}</h1>

<table>
<tr>
<th>Id</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted By</th>
<th>Action</th>
</tr>

<c:forEach var="temp" items="${data}">
<tr>
<td>${temp.id}</td>
<td><a href="/book/${temp.id}">${temp.title}</a></td>
<td>${temp.author}</td>
<td>${temp.user.userName}</td>
<td>
    <a href="/book/delete/${temp.id}">Delete</a>
</td>
</tr>

</c:forEach>
</table>

<a href="/book/new">add book</a>
<a href="/logout">Logout</a>
</body>
</html>