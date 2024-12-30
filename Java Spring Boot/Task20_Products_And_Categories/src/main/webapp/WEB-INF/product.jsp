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

<h1>${data.pname}</h1>
<p>----------------------------------------</p>

<h3>Category:</h3>
<c:forEach var="cat" items="${data.categories}">
<p>${cat.cname}</p><br>
</c:forEach>


<form:form action="/Products/${data.id}/addcategory"  method="post" modelAttribute="category">

<form:select path="id" >
<c:forEach var="cate" items="${allcategory}">
<form:option value="${cate.id}">${cate.cname}</form:option>
</c:forEach>
</form:select>

<button>Add</button>

</form:form>

<a href="/">home</a>
</body>
</html>