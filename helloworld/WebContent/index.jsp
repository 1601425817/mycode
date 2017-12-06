<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
<meta charset="utf-8">
</head>
<body>
	<% 
		Cookie cookie = new Cookie("name","123");
	 	response.addCookie(cookie);
	 	
	%>

	<form action="#" id="myform">
		<label for="id">用户名</label><input type="text" id="idq">
		<label for="password">密码</label><input type="text" id="password">
		<button form="myform" id="sub">提交</button>
	</form>
	您的IP是:<%=request.getRemoteAddr()%>
	<script>
		function judge(arg0,arg1){
			if(arg0==arg1)
			{
				alert("登录成功");
			}
		}
		$("#sub").click(function(e){
			e.preventDefault();
			var myvalue = $("#idq").val();
			judge(myvalue,<%=cookie.getValue()%>);		
		});
	</script>
</body>
</html>