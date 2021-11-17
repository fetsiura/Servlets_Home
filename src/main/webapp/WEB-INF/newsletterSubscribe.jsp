<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 17.11.2021
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<<head>
    <style>
        h5 {text-align: center;}
        .center {
            margin: 0;
            position: absolute;
            top: 50%;
            left: 50%;
            -ms-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
        }
    </style>
</head>
<body>
<form action="/newsletter" method="post">
    <br>
    <label>
        <h5>Write you name: <input type="text" name="name"></h5>

        <h5>Write you email:<input type="email" name="email"></h5>

        <div class="container">
            <div class="center">
                <h5>  <button type="submit">SUBSCRIBE</button> </h5>
            </div>
        </div>
    </label>
</form>
</body>
</html>