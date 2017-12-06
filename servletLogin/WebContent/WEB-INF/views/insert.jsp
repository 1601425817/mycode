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
	<form action="insert" method="post">
		<label for="account">eid</label><input type="text" id="eid" name="eid"><br/>
		<label for="name">名字</label><input type="text" id="name" name="name"><br/>
		<label for="age">年龄</label><input type="text" id="age" name="age"><br/>
		<label for="birth">生日</label><input type="text" id="birth" name="birth"><br/>
		<label for="did">did</label><input type="text" id="did" name="did"><br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>