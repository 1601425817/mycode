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
    <h1>删除表单</h1>
	<form action="delete" method="post">
		<label for="account">待删除员工的生日</label><input type="text" id="birth" name="birth"><br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>