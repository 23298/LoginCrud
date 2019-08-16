<%@page import="Com.Ism.loginVO.LoginVo"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Com.Ism.Logindao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import=""  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="1px">
<tr>
<th>Id</th>
<th>First_Name</th>
<th>Last_Name</th>
<th>Password</th>
<th>Delete</th>
<th>Update</th>
</tr>

 <% ArrayList<LoginVo> list1 =(ArrayList)session.getAttribute("list"); 

 for(LoginVo l : list1)
{
%>
<tr>
<td><%=l.getId() %>
<td><%=l.getfName()%></td>
<td><%=l.getlName()%></td>
<td><%=l.getPwd()%></td>
<td><a href="updateservlet?Id=<%=l.getId()%>">EDIT</a></td>
<td><a href="deleteservlet?Id=<%=l.getId()%>">DELETE</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>