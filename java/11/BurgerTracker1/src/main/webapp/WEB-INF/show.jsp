<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/15/2025
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
    <h1>Burger Details</h1>
    <div>
        <div>
            <h2>burger name</h2>
            <h2>${burger.burgername}</h2>
        </div>
        <div>
            <h2>burger resturant</h2>
            <h2>${burger.restaurantname}</h2>
        </div>
        <div>
            <h2>burger rating</h2>
            <h2>${burger.rating}</h2>
        </div>
        <div>
            <h2>burger note</h2>
            <h2>${burger.notes}</h2>
        </div>
        <div>
            <h2>burger createdAt</h2>
            <h2>${burger.createdAt}</h2>
        </div>
    </div>
</body>
</html>
