<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Office</title>
</head>
<body>
	<h2>Add new Office</h2>
	${Message}
	<table>
		<form method="post">
			
			<tr>
				<td>Title: </td>
				<td><input type="text" name="title" id="title" /></td>
			</tr>
			<tr>
				<td>Office Size:</td>
				<td><input type="text" name="size" id="size" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" id="price" /></td>
			</tr>
			<tr>
				<td>Category:</td>
				<td><input type="text" name="category" id="category" /></td>
			</tr>
			<tr>
				<td>Floor:</td>
				<td><input type="text" name="floor" id="floor" /></td>
			</tr>
			<tr>
				<td>Description: </td>
				<td><input type="text" name="description" id="description" /></td>
			</tr>
			
			<tr>
				<td>City: </td>
				<td>
					<select name = "city">
					<c:forEach  var="s" items="${citylist}">
						<option>${s.cityTitle}</option>
					</c:forEach>	
					</select>
				</td>
			</tr>
			<tr>
				<td>Area: </td>
				<td>
				<select name="area">
					<c:forEach  var="s" items="${arealist}">
						<option>${s.areaTitle}</option>
					</c:forEach>	
					</select>
				
				</td>
			</tr>
			
			<tr>
				<td>For: </td>
				<td>
				<select name="offer">
					<c:forEach  var="s" items="${offerlist}">
						<option>${s.offerType}</option>
					</c:forEach>	
					</select>
				
				</td>
			</tr>
			
			<tr>
				<td>Address: </td>
				<td><input type="text" name="address" id="address" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit"  value="Add"/></td>
			</tr>
			
			<!-- city area city offer type -->
		</form>
	</table>

</body>
</html>