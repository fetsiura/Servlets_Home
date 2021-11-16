<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 16.11.2021
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${empty param.author ? "PUSTO" : "Wybrany author"} ${param.author}
</body>
</html>
