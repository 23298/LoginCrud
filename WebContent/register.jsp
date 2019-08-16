<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginServlet" method="get">
		<table>
		
			<tr>
				<td>FirstName:-</td>
				<td><input type="text" name="fn" value="${abc}">${error}</td>
			</tr>
			
			<tr>
				<td>LastName:-</td>
				<td><input type="text" name="ln" value="${aaa}">${ln}</td>
			</tr>
			
			<tr>
				<td>Password:-</td>
				<td><input type="pwd" name="pwd" value="${ppp}"> ${pwd}</td>
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
		<a href="Showservlet">SHOWDATA</a>
		
	</form>
</body>
</html>