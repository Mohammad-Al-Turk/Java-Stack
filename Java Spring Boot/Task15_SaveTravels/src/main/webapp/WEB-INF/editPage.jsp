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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>edit Expense</title>
</head>
<body>

    <h1 class="text-center mt-5">edit Expense</h1>
    <form:form action="/editdata/${data.id}" method="put" modelAttribute="exp" class="mt-3">
        <div class="mb-3">
            <form:label path="name" class="form-label"  >Name: </form:label>
            <form:input path="name" class="form-control" value="${data.name}" />
            <form:errors path="name" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="vendor" class="form-label">Vendor: </form:label>
            <form:input path="vendor" class="form-control" value="${data.vendor}" />
            <form:errors path="vendor" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="amount" class="form-label">Amount: </form:label>
            <form:input path="amount" class="form-control" value="${data.amount}" />
            <form:errors path="amount" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="description" class="form-label">Description: </form:label>
            <form:textarea path="description" class="form-control" rows="3" value="${data.description}"></form:textarea>
            <form:errors path="description" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form:form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>