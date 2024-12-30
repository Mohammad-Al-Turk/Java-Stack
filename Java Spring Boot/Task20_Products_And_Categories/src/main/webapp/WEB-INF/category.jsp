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

<h1>${category.cname}</h1>
<p>----------------------------------------</p>

<h3>Product:</h3>
<c:forEach var="cat" items="${category.products}">
<p>- ${cat.pname}</p><br>
</c:forEach>





<form:form action="/categories/${category.id}/addProduct" method="post" modelAttribute="product">

<form:select path="id" >
<c:forEach var="prod" items="${allproduct}">
<form:option value="${prod.id}">${prod.pname}</form:option>
</c:forEach>
</form:select>
<button type="submit">Add</button>
</form:form>

<a href="/">home</a>
</body>
</html>