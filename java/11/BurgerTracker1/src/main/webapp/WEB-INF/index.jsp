

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>


<!DOCTYPE html>
<html lang="en" xmlns:form="http://www.w3.org/1999/html" >
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>

        <h1>Burger Tracker</h1>
        <h2>All Burgers</h2>
        <table border="1">
            <tr>
                <th>Burger</th>
                <th>Restaurant</th>
                <th>Rating</th>
                <th>Notes</th>
                <th>Edit</th>
            </tr>
            <c:forEach var="b" items="${burgers}">
            <tr>
                <td><a href="/burgers/show/${b.id}">${b.burgername}</a></td>
                <td>${b.restaurantname}</td>
                <td>${b.rating}</td>
                <td>${b.notes}</td>
                <td><a href="/burgers/edit/${b.id}">Edit</a></td>
                <td><a href="/burgers/delete/${b.id}">delete</a></td>
            </tr>
            </c:forEach>
        </table>
        <h2>Add a Burger</h2>
        <form:form action="/burgers" method="post" modelAttribute="burger">
        <p>
            <form:label path="burgername">Burger Name:</form:label>
            <form:input path="burgername"/>
            <form:errors path="burgername" cssClass="error"/>
        </p>
        <p>
            <form:label path="restaurantname">Restaurant Name</form:label>
            <form:input path="restaurantname"/>
            <form:errors path="restaurantname" cssclass="error"/>
        </p>
        <p>
            <form:label path="rating">rating</form:label>
            <form:input path="rating"/>
            <form:errors path="rating" cssclass="error"/>
        </p>
        <p>
            <form:label path="notes">notes</form:label>
            <form:input path="notes"/>
            <form:errors path="notes" cssclass="error"/>
        </p>
        <input type="submit" value="Add Burger"/>
    </form:form>
</body>
</html>