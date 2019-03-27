<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cognizant.userDao.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.cognizant.user.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.image{

border-radius:50%;
height: 10cm;
width:6cm;
}
.design{
margin-left:20%;
display: inherit;}

input[button]{
position: inherit;
margin-top: 5%;
margin left:20%;
}
.contain{
text-align:center;
font-family: monospace;
font-size: x-large;
}
</style>
<title>Insert title here</title>
</head>
<body style="background-color: #DBE0E1; font-family: Arial Black;">
<div class="design">
<img src="foxy.jpg" alt="logo" class="image">
<a href="register.html"><input type="button" value="Edit Profile"></a> 
</div>

<%
UserDao ud=new UserDao();
List<User> list=new ArrayList<User>();
list=ud.getUser();
out.println("<div class='contain'>");
for(User u:list)
{
	if((u.getUsername().equals(session.getAttribute("key1")))&&(u.getPassword().equals(session.getAttribute("key2"))))
	{out.println("<h1>Name : "+u.getName()+"</h1>");
	out.println("<p>Designation : "+u.getDesig()+"</p>");
	out.println("<p>Mobile : "+u.getMobile()+"</p>");
	out.println("<p>Mail : "+u.getMail()+"</p>");
	}
}
out.println("</div>");
%>
</body>
</html>