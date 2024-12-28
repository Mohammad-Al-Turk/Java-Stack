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



<h1>${result.name}</h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</tr>


<c:forEach var="temp" items="${result.ninjas}">
<tr>
<td>${temp.fname}</td>
<td>${temp.lname}</td>
<td>${temp.age}</td>
</tr>
</c:forEach>

</table>


<a href="/ninjapage">Add new Ninja</a> | <a href="/dojopage">Add new Dojo</a>



</body>
</html>