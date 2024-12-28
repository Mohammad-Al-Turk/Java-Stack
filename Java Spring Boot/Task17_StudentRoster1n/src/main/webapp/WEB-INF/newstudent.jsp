
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

<h1>New Student</h1>

<form:form action="/createstudent" method="post" modelAttribute="student">
<form:label path="name">Student Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>


<form:label path="dorm">select dorm</form:label>
<form:select path="dorm">

<c:forEach var="temp" items="${data}">
<form:option value="${temp.id}">${temp.name}</form:option>
</c:forEach>
</form:select>

<button>Add</button>

</form:form>

<a href="/dorm">new dorm</a>
<a href="/dorms">all dorms</a>


</body>
</html>