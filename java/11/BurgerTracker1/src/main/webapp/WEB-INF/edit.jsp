<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/15/2025
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>


<!DOCTYPE html>
<html lang="en" xmlns:form="http://www.w3.org/1999/html" >
<head>
    <meta charset="UTF-8">
    <title>Edit</title>
</head>
<body>

<h1>Edit a Burger</h1>
<form:form action="/burgers/update/${burger.id}" method="post" modelAttribute="burger">
    <p>
        <form:label path="burgername">Burger Name:</form:label>
        <form:input path="burgername" value="${burger.burgername}"/>
        <form:errors path="burgername" cssClass="error"/>
    </p>
    <p>
        <form:label path="restaurantname">Restaurant Name</form:label>
        <form:input path="restaurantname" value="${burger.restaurantname}" />
        <form:errors path="restaurantname" cssclass="error"/>
    </p>
    <p>
        <form:label path="rating">rating</form:label>
        <form:input path="rating" value="${burger.rating}" />
        <form:errors path="rating" cssclass="error"/>
    </p>
    <p>
        <form:label path="notes">notes</form:label>
        <form:input path="notes" value="${burger.notes}." />
        <form:errors path="notes" cssclass="error"/>
    </p>
    <input type="submit" value="update Burger"/>
</form:form>
</body>
</html>