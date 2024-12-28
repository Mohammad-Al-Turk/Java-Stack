
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
<title>New Dorm</title>
</head>
<body>

<h1>New Dorm</h1>

<form:form action="/createdorm" method="post" modelAttribute="dorm">
<form:label path="name">Dorm Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>

<button>Add</button>
</form:form>


<a href="/student">new student</a>
<a href="/dorms">all dorms</a>

</body>
</html>