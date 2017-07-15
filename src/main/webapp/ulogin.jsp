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
    <title>用户登录</title>
</head>
<body>
<br><br><br>
<div ><h2>欢迎使用长途汽车管理系统</h2></div><br>


    <legend >用户登录</legend><br>
    <form action="ulogin" method="post">
        &nbsp;&nbsp;ID：&nbsp;<input type="text" name="user.id"/><br><br>
        &nbsp;&nbsp;密码：<input type="password" name="user.password"><br><br>
        <div >${UnameErrMsg }${PwdErrMsg }</div>
        <br>
        <div ><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;<a href="regist.jsp">去注册</a></div>
        <br><br>
        <div ><a href="/login/login.jsp">管理员用户登录</a></div>
    </form>


</body>
</html>
