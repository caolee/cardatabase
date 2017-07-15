<%--
  Created by IntelliJ IDEA.
  User: GeekLe
  Date: 2017/6/14
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<br><br><br>
<div ><h2>新用户注册界面</h2></div><br>

    <form action="regist" method="post">
        &nbsp;&nbsp;用户名：<input type="text" name="user.id"/><br><br>
        &nbsp;&nbsp;密码：&nbsp;<input type="password" name="user.password"><br><br>
        &nbsp;&nbsp;确认：&nbsp;<input type="password" name="reg.confirmpwd"><br><br>
        <div >${UnameMsg }${pwdMsg }${confirmMsg }${SuccessMsg }</div>
        <br>
        <div ><input type="submit" value="注册">&nbsp;&nbsp;&nbsp;<a href="ulogin.jsp">登录</a></div>
    </form>

</body>
</html>
