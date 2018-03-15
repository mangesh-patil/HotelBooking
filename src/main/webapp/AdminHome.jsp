<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<%

	try{
	 session=request.getSession();

	
	if(session.getAttribute("adminid")==null)
	{
		response.sendRedirect("AdminLogin.jsp");
	}
	else
	{
		session.setAttribute("adminid",session.getAttribute("adminid"));
		session=request.getSession();
		String s=(String)session.getAttribute("adminid");
%>

Success


<form action="./adminlogout" method="post">
<input type="submit" name="action" value="Logout">
</form>
<%
	}
	}
catch(Exception e){
	e.printStackTrace();
	
}
%>
</body>
</html>