<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="validateUser" method="post">
		<table width="50%" align="centre" bgcolor="lightblue">
			<tr>
				<th>Username</th>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<th>Password
					<td><input type="password" name="pword"></td>
				</th>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><input type="reset" value="Cancel"></td>
				
			</tr>
		</table>
	</form>

</body>
</html>