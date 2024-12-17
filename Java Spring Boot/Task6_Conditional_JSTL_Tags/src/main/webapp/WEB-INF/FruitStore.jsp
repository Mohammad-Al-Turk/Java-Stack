<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="main">
	<h1>Fruit Store</h1>
	<table class="table table-sm">
 	<tr>
 	<th>Name</th>
 	<th>Price</th>
 	</tr>
 	<c:forEach var="temp" items="${allFruits}"> 
 	
 	<tr>
 	<td> <c:out value="${temp.name}"></c:out> </td>
 	<td> <c:out value="${temp.price}"></c:out> </td>
 	</tr>
 	
 	</c:forEach>

 	
</table>
</div>

</body>
</html>