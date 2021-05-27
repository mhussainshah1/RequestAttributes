<%--
  Created by IntelliJ IDEA.
  User: 615260
  Date: 5/27/2021
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Name Page</title>
</head>
<body>
<h1>Name Master 2000 </h1>

<hr>

<p>${error}</p> <%--expression language--%>

<p>Hey ${person.firstName} ${person.lastName} , nice to meet you.</p>

<p>You are ${person.age} years old.</p>

</body>
</html>
