<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/15/2025
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1">
    <tr>
        <th>title</th>
        <th>description</th>
        <th>language</th>
        <th>pages</th>
    </tr>
    <c:forEach var="b" items="${books}">
        <tr>
            <td><a href="/books/${b.id}">${b.title}</a></td>
            <td>${b.description}</td>
            <td>${b.language}</td>
            <td>${b.pages}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
