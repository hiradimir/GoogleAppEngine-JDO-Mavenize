<%--
  Created by IntelliJ IDEA.
  User: yutaka
  Date: 2015/01/08
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <link href="<%=request.getContextPath() %>/css/application.css" rel="stylesheet"/>
    <script src="<%=request.getContextPath() %>/js/jquery-2.1.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/logger.js"></script>
    <script src="<%=request.getContextPath() %>/js/hoge.js"></script>

    <title></title>
</head>
<body>
<h1>Sample added</h1>

<div>

    <table>
        <tr>
            <td>UserName :</td>
            <td>${sample.name}</td>
        </tr>
        <tr>
            <td>Email :</td>
            <td>${sample.email}</td>
        </tr>
    </table>
</div>

<div id="log"></div>


</body>
</html>
