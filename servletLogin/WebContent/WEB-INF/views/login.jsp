<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    	if(request.getAttribute("msg")!=null){
    %>
    <%=request.getAttribute("msg")%>
    <%}%>
	<form action="login" method="post">
		<label for="account">邮箱</label><input type="text" id="email" name="email"><br/>
		<label for="password">密码</label><input type="password" id="password" name="password"><br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>