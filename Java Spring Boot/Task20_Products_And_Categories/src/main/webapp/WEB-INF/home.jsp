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

<h1>Home Page</h1>


<table>
<tr>
<th>Products</th>
<th>Categories</th>
</tr>


<tr>
<td>
<c:forEach var="tempp" items="${product}">
<ul>
  <li> <a href="/product/${tempp.id}">${tempp.pname}</a></li>
</ul>
</c:forEach>
</td>




<td>
<c:forEach var="tempc" items="${category}">
<ul>
  <li> <a href="/category/${tempc.id}">${tempc.cname}</a></li>
</ul>
 </c:forEach>
<td>

</tr>


</table>





<a href="/category">New Category | </a>
<a href="/product">New product</a>



</body>
</html>