<%@page import="Com.Ism.Logindao.LoginDao"%>
<%@page import="Com.Ism.loginVO.LoginVo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<% 


String id=request.getParameter("id");
int uid=Integer.parseInt(id);
LoginVo l=LoginDao.getEmployeeById(uid);
%>

	<form action="updateservlet" method="get">
		<table>
		
			<tr>
				<td>FirstName:-</td>
				<td><input type="text" name="fn"></td>
			</tr>
			
			<tr>
				<td>LastName:-</td>
				<td><input type="text" name="ln"></td>
			</tr>
			
			<tr>
				<td>Password:-</td>
				<td><input type="pwd" name="pwd"></td>
			</tr>
			
			
			
			<!-- <tr>
				<td>Gender:-</td>
				<td>
					<input type="radio" name="male">Male
					<input type="radio" name="female">Female
				</td>
			</tr>
			
			<tr>
				<td>Hobbies:-</td>
				<td>
					<input type="checkbox" value="Cricket" >Cricket
					<input type="checkbox" value="TT" >TT
				</td>
			</tr>
			
			<tr>
				<td>Nationality:-</td>
				<td>
					<select>
						<option>Indian</option>
						<option>Pakistan</option>
					</select>
				</td>
			</tr> -->
			
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
			
		</table>
	
		
	</form>
</body>
</html>