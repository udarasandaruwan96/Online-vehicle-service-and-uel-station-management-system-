<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Machanic Profile</title>

<meta charset="ISO-8859-1">
   <title>Login</title>
   
   
   <meta name="viewport" content="width=device-width, initial-scale=1">


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

   
   
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
		
		
		
body {
  background-color: lightblue;
}



body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header{
  overflow: hidden;
  background-color: #333;
}

.header a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: #04AA6D;
  color: white;
}





b:link, b:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

b:hover, b:active {
  background-color: red;
}







.fa {
  padding: 10px;
  font-size: 20px;
  width: 20px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
}

.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}

.fa-twitter {
  background: #55ACEE;
  color: white;
}

		
		
	</style>
	
	
	
	 

</head>

<body>

     
     	
 <!Header>
    <br>
    <div class="header">
       
        <a class="active" href="#home">OnlineVehicle Services and Fuel station Management System</a>
        <a href="http://localhost:8099/SupplierDemo/Online_VSFM_Main.jsp">Home</a>
        <a href="#abouts">Abouts</a>
        <a href="http://localhost:8099/Machanic_Mangment/Login.jsp">Logout</a>
     </div>

    <div style="padding-left:16px">
         <h2><marquee>Welcome! Machanic Engineers </marquee></h2>
         <p>Some content..</p>
         <h3>Customer details</h3>
         
   <table class="table table-bordered">
	
	
		<th>Customer ID</th>
		<th>Customer Name</th>
		<th>Customer Email</th>
		<th>Customer Phone Number</th>
		<th>Customer Vehicle Number</th>
		<th>Customer Time</th>
		<th>Customer Date</th>
	
	
	</table>
	
         
         
         
         
         
    </div>


    <br><br><br><br><br><br>
   
   
<center>
	
<br/> 

 
      <h3 id="header"> Welcome!  Machanic Engineers </h3>
      <h2>Your Details</h2>
	
<table>
	<c:forEach var="mac" items="${macDetails}">
	
	<c:set var="id" value="${mac.id}"/>
	<c:set var="name" value="${mac.name}"/>
	<c:set var="email" value="${mac.email}"/>
	<c:set var="phone" value="${mac.phone}"/>
	<c:set var="username" value="${mac.userName}"/>
	<c:set var="password" value="${mac.password}"/>
	
	<tr>
		<td>Machanic ID</td>
		<td>${mac.id}</td>
	</tr>
	<tr>
		<td>Machanic Name</td>
		<td>${mac.name}</td>
	</tr>
	<tr>
		<td>Machanic Email</td>
		<td>${mac.email}</td>
	</tr>
	<tr>
		<td>Machanic Phone</td>
		<td>${mac.phone}</td>
	</tr>
	<tr>
		<td>Machanic User Name</td>
		<td>${mac.userName}</td>
	</tr>

	</c:forEach>
	</table>
	
	
	
	
	<c:url value="Machanic_Update.jsp" var="macupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	
	
	
	
	
	
	<br>
	<c:url value="Machanic_Delete.jsp" var="macdelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="uername" value="${username}" />
		<c:param name="password" value="${password}" />
	</c:url>
	<a href="${macdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	
		<a href="${macupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	<br>
     
     
     
	
     
</center>

<br>
<p id="demo"></p><br>
<hr border="1px" color="black">




      
<!--Footer-->  
<footer id="footer">
    <div id="fl"><p style="color:black">Quick Acess</p>
    <ul style="list-style-type:none">
        <a href="#"><li style="text-decoration:none; color:white">Home</li></a>
        <a href="#"><li style="text-decoration:none; color:white">About Us</li></a>
        <a href="#"><li style="text-decoration:none; color:white">Our Services</li></a>
        <a href="#"><li style="text-decoration:none; color:white">Contact Us</li></a>
        </ul>
    </div>
	
	
   
	
        
		<center>
        <p>Follow us on</p>
        <a href="#" class="fa fa-facebook"></a>
        <a href="#" class="fa fa-twitter"></a>
        </center>
	
       
		
        <div id="fc2" style="float:right;text-align: center">
            <p>Hotline : 94115755755. </p>
            <p>OVFM No.32,<br> 2nd street,<br>Colombo 7.</p><br>
        </div>
   
	
	
	
    
    <div id="fr">
        <p>Contact Us</p>
        <input type="text" placeholder="Your Email" class="mails"><br>
        <textarea id="milbody" placeholder = "Message" name="namemail" rows="3" cols="50" class="mails"></textarea><br>
        <button style="float:left;width:90px">Send</button>
        
    </div>
	
	<br>
    <center>
		OnlineVehicle Services and Fuel station Management System © 2021 <br>  2021 All rights reserved.
    </center>
		
</footer>
    
	 
</body>
</html>