<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <style>
            body {
                    background-image: url("/HotelBooking/src/main/webapp/img.jpg");
                 }
             div { 
             		
                    position: fixed;
                    top: 50%;
                    left: 50%;
                    margin-top: -100px;
                    margin-left: -200px;
                 }
              .my_text
            			{
                			font-family:    Calibri;
                			font-size:      16px;
            			}
          </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body><div class="my_text">
<form action="./userregister" method="post">

	<Table >
	<tr>
	<th colspan="2">Register Here</th>
	
	</tr>
	
	
	<tr><td colspan="2">Name :</td><td><input type="text" name="name"></td></tr>
	<tr><td colspan="2">Contact :</td><td><input type="text" name="contact"></td></tr>
	<tr><td colspan="2">Email :</td><td><input type="email" name="email"></tr>
	<tr><td colspan="2">Password :</td><td><input type="password" name="password"></tr>
	<tr><td colspan="2"><input type="submit" name="action" value="Register"><input type="reset" value="Reset"></tr></tr>
	
	<tr></tr>
	</Table>
</form>
<a href="UserLogin.jsp">User Login</a>

<a href="AdminLogin.jsp">Admin Login</a>
</div>
</body>
</html>