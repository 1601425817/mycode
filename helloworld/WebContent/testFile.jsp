<%@ page language="java" contentType="textml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html
<html>
	<head>
		<meta http-equiv="Content-Type" content="text\html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String username;
			String password;
		%>
		<% 
			session.setAttribute("abc","username");
			session.setAttribute("123","password");
		%>
		<tr method="POST">
			<td>用户</td>
			<td><input type = "text" name = "username" value = "" /></td>
		</tr>
		</br>
		<tr>
			<td>密码</td>
			<td><input type = "password" name = "password" value = "" /></td>
		</tr>
		</br>
		<tr>
			<td><input type = "submit" value = "登录" /></td>
			<td><input type = "reset" value = "取消" /></td>
		</tr>
		<%
			String request_username = request.getParameter("username");
		    out.print("13");
			String request_password = request.getParameter("password");
		%>
		
		<%
			if (true){
				%>
					登陆成功
				<%
			}
			else {     
              	%>  
             	 	登录失败：用户名或密码不正确
              	<%    
          }   
		%>
	</body>
<ml>