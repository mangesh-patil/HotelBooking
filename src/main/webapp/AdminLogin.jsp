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
<title>Admin Login</title>
</head>
<body><div class="my_text">
<form method="post" action="./adminlogin">
<table>
<tr><th>Admin login</th></tr>
<tr><td colspan="2">Username :</td><td><input type="text" name="adminid"></td></tr>
<tr><td colspan="2">Password :</td><td><input type="password" name="adminpass"></td></tr>
<tr><td colspan="2"><input type="submit" name="action" value="Login"></td></tr>
</table>
</form>
</div>
</body>
</html>