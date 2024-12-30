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



<h1>Add a Book to your shelf</h1>
<form:form action="/savenewbook" method="post" modelAttribute="book">

<form:label path="title"> Add title:</form:label>
<form:errors path="title"/>
<form:input path="title"/>

<form:label path="author">author name:</form:label>
<form:errors path="author"/>
<form:input path="author"/>


<form:label path="note">note</form:label>
<form:errors path="note"/>
<form:input path="note"/>

<form:hidden path="user" value="${loggedUser.id}"/>



<button>Submut</button>

</form:form>

<a href="/books">All Book</a>
</body>
</html>