<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> New Guest</h1>
	<form action="saveguest" method="post">
		Full Name: <input type="text" name="fullName"/><br><br>
		Contact NO: <input type="text" name="contactNum"/><br><br>
		HouseNum: <input type="text" name="houseNum"/><br><br>
		DateTime: <input type="text" name="dateTime"/><br><br>
		Purpose: <input type="text" name="purpose"/><br><br>
		VehicleRegNo: <input type="text" name="vehicleRegNo"/><br><br>
		pic: <input type="file" name="pic"/><br><br>
		NumberOfVisitors: <input type="text" name="NumberOfVisitors"/><br><br>
		
		<input type="submit" value="Save Guest"/>
		
	</form>
</body>
</html>