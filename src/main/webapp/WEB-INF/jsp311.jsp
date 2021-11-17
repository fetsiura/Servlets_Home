<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 16.11.2021
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="val" value="${tookLanguage}"> </c:set>
${empty cookie.language ? "CZEŚĆ" : val}
<%--${tookLanguage}--%>

<form action="/servlet312" method="post">

    <select name="takeLanguage" >

        <c:forEach items="${lang}" var="option" >

            <option value="${option.key}">${option.key}</option>


        </c:forEach>
    </select>
<br>
    <button type="submit" >TAKE</button>
</form>
</body>
</html>
