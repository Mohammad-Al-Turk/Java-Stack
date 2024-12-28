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
<title>Ninjas</title>
</head>
<body>


<form:form action="/create/ninja"  method="post" modelAttribute="ninja">

<form:select path="dojo">

<c:forEach var="temp" items="${data}">

<form:option value="${temp.id}">${temp.name}</form:option>

</c:forEach>
</form:select>


<form:label path="fname">First Name:</form:label>
<form:errors path="fname"/>
<form:input path="fname"/>

<form:label path="lname">Last Name:</form:label>
<form:errors path="lname"/>
<form:input path="lname"/>


<form:label path="age">age:</form:label>
<form:errors path="age"/>
<form:input path="age"/>

<button>Create</button>
</form:form>

<a href="/dojopage">Add new Dojo</a>


</body>
</html>