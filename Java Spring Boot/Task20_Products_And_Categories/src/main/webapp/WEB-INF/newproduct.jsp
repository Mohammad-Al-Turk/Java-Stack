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
<title>New Product</title>
</head>
<body>


<h1>New Product</h1>


<form:form action="/productprocess"  method="post" modelAttribute="product" >


<form:label path="pname">Produce Name: </form:label>
<form:errors path="pname"/>
<form:input path="pname"/>


<form:label path="description">Description: </form:label>
<form:errors path="description"/>
<form:input path="description"/>

<form:label path="price">Price: </form:label>
<form:errors path="price"/>
<form:input path="price"/>

<button>Submit</button>

</form:form>


<a href="/">Home</a>
</body>
</html>