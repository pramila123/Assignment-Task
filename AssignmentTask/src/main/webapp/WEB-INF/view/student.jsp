<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Form</h1>
	<form action="student" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Contact_no</td>
				<td><input type="text" name="contact_number"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="Male">Male
					<input type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td>Created_AT</td>
				<td><input type="date" name="created_at"></td>
			</tr>
			<tr>
				<td>Updated_AT Date</td>
				<td><input type="date" name="updated_at"></td>
			</tr>
			<tr>

				<td><input type="submit" value="submit"></td>
			</tr>
		</table>



	</form>


</body>
</html>