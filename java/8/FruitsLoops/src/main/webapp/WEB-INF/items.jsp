<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/15/2025
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Items</title>
</head>
<body>
<ul>
         <c:forEach var="f" items="${items}">
             <li class="${items.name.startsWith('G') ? 'orange' : ''}">
                     ${items.name} - $${items.price}
             </li>
         </c:forEach>
    </ul>
</body>
</html>
