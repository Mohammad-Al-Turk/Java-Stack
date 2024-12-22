<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<h1>All Books</h1>
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">Title</th>
	      <th scope="col">Language</th>
	      <th scope="col">Number of pages</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items="${books}" var="b">
		 <tr>
	      <th scope="row">${b.id}</th>
	      <td>${b.title}</td>
	      <td>${b.language}</td>
	      <td>${b.numberOfPages}</td>
	    </tr>  
	  </c:forEach>

	  </tbody>
	</table>
	
	<h1>Add Book</h1>
	
	
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>