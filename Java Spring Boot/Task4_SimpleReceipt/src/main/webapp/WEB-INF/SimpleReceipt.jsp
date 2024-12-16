<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Receipt</title>
</head>
<body>
<h1> Customer name: <c:out value="${cname}"></c:out></h1>
<h1>Item name: <c:out value="${itemName}"></c:out> </h1>
<h1> Price: <c:out value="${price}"> </c:out>$</h1>
<h1>description: <c:out value="${description}"></c:out></h1>
<h1>vendor: <c:out value="vendor"></c:out></h1>

</body>
</html>