<%@page import="com.pcq.ssm.dto.Page"%>
<%@page import="com.pcq.ssm.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
		.page a {
			display: inline-block;
			padding: 3px 5px;
			border: 1px solid #000;
			margin: 0 5px;
			text-decoration: none;
		}
		
		.page a:hover {
			border-color: red;
		}
		
		.page a.cur, .page a.cur:hover {
			border-color:#ccc;
			color: #ccc;
			cursor: default;
		}
	
	
	</style>
</head>
<body>


<table>
	<thead>
		<tr>
			<th>用户ID</th>
			<th>名字</th>
			<th>年龄</th>
			<th>生日</th>
			<th>did</th>
		</tr>
	</thead>
	<tbody>
		
		<%
			Page p = (Page)request.getAttribute("page");
			if( null != p && null != p.getList() ){
				List<Employee> employees = (List<Employee>)p.getList();
				for(Employee employee : employees){
		%>
		
		<tr>
			<td><%=employee.getEid() %></td>
			<td><%=employee.getName() %></td>
			<td><%=employee.getAge()%></td>
			<td><%=employee.getBirth() %></td>
			<td><%=employee.getDid() %></td>
			<td>
				<a>编辑</a>
				<a href=<%="/myMavenSsmProject/remove/"+p.getCurrent()+"/"+employee.getEid()%>/>删除</a>
			</td>
		</tr>
		
		
		<% }
				
		} %>
	</tbody>
</table>
<div class="page">
		<%
			for(int i = 1; i <= p.getTotolPage(); i++){
			
		%>
			
			<a <%=i == p.getCurrent() ? "class=\"cur\"" : "" %> href="<%=i == p.getCurrent() ? "javascript:void(0);" : ("/myMavenSsmProject/?current=" + i)   %>"><%=i %></a>
		
	
		<%} %>
	</div>
</body>

</html>