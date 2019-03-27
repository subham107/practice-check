<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cognizant.user.bean.*"  %>
     <%@ page import="com.cognizant.userDao.*"  %>
     <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.contain{

font-family: Cooper Black;
margin-left: 35%;
}
input{
width: 30%;
display: block;
height: 17%;
margin-bottom: 3%;
border-radius: 20%;
}
button{
background-color:#F38B2F;
color: white;
width:25%;
height: 20%;}
button:hover{
opacity:0.5;
cursor:pointer;}

</style>
</head>

<body>
<div class="contain">
<form action ="Myservlet1" method="get">
<p style="margin-top: 10%;" >Enter Name Of The Product<input type="text"  name="pname"></p><br>
Enter Product ID<input type="text" name="pid"><br>
Enter Category<input type="text"  name="cat"><br>
Enter Description<input type="text"  name="desc"><br>
Enter Brand<input type="text"  name="brand"><br>
Enter Price<input type="text"  name="price"><br>
<button type="submit" >ADD</button>
</div>
</form>
</body>
</html>