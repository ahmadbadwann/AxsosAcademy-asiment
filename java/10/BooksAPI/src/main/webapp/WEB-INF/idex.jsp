<jsp:useBean id="book" scope="request" type="org.springframework.core.io.DescriptiveResource"/>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/15/2025
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dtails</title>
</head>
<body>
<h1>${book.title}</h1>
<h2>Description: ${book.description}</h2>
<h2>Language: ${book.language}</h2>
<h2>Pages: ${book.pages}</h2>
</body>
</html>
