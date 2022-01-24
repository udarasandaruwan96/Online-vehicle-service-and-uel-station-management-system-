<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Online vehicle Service and Fuel Station Managements System</title>

<meta name="viewport" content="width=device-width, initial-scale=1">



<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



<style>


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
       
        <a class="active" href="#home">Online vehicle Service and Fuel Station Managements System</a>
        <a href="#Manager">Manager</a>
        <a href="http://localhost:8099/SupplierDemo/Supplier_Home_Page.jsp">Supplier</a>
        <a href="http://localhost:8099/Machanic_Mangment/Machanic_Home_Page.jsp">Machanic</a>
        <a href="#cus">Customer</a>
        <a href="#add">Admin</a>
     </div>

    <div style="padding-left:16px">
        <h2><marquee> Welcome! Online vehicle Service and Fuel Station Managements System </marquee></h2>
        <p>Some content..</p>
    </div>


    <br><br><br><br><br><br>
   
   
<center>
	
<div id="main">
<br/> 

   <div class="buttn">

      <h3 id="header"> Welcome! Online vehicle Service and Fuel Station Managements System </h3>

      <button id="button1"  onclick="loadData('button1')"><b><a href="#new Item"> Available New Item</a></b></button>
      <button id="button1"  onclick="loadData('button1')"><b><a href="#staff">Staff</a></b></button>
      <button id="button1"  onclick="loadData('button1')"><b><a href="#about">About</a></b></button>
      <button id="button1"  onclick="loadData('button1')"><b><a href="#cust">Customer available Sheet</a></b></button>
      

   </div>

</div>   

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
