<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("name", "彭璨麒");
	   pageContext.setAttribute("birth","1997-4-17",pageContext.REQUEST_SCOPE);
	   application.setAttribute("age", 20);
	   session.setAttribute("sex", "m");
	   Cookie cookie = new Cookie("manager","softwareEngineering");
	   response.addCookie(cookie);
	   response.sendRedirect("include.jsp");
	%>
	<%
		Cookie cookie1[] = request.getCookies();
		for (Cookie cookie2 : cookie1) {
	%>
			<%=cookie2.getValue()%>	
	<%
		}
	%>
</body>
</html>