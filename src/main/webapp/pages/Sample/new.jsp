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
<h1>sample gae page</h1>

<div>
    
    <form method="post" action="./">

        <table>
            <tr>
                <td>UserName :</td>
                <td><input type="text" style="width: 185px;" maxlength="30"
                           name="name" id="name" /></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><input type="text" style="width: 185px;" maxlength="30"
                           name="email" id="email" /></td>
            </tr>
        </table>
        <input type="submit" class="save" title="Save" value="Save" />
    </form>
</div>

<div id="log"></div>


</body>
</html>
