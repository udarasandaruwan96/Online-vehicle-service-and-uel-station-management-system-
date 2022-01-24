<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Item</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
</head>


<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Supplier
					Management  </a>
			</div>
			
	  <li class="menu"><a href="<li class="menu"><a href="http://localhost:8099/SupplierDemo/Online_VSFM_Main.jsp">Home</a></li>"></a></li><br>	
      <li class="menu"><a href="http://localhost:8099/SupplierDemo/login.jsp">LogOut</a></li><br><br>
      
        
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Existing List</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Items</h3>
			<h3><marquee>List of Items</marquee></h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Item</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
					   <th>Id</th>
	                   <th>Item_Name</th>
	                   <th>Item_Material</th> 
	                   <th>Item_Country</th>
	                   <th>Suplier_Name</th>
	                   <th>Suplier_Email</th>
	                   <th>Suplier_Phone_Number</th>
	                   <th>Suplier_Address</th>
	                   <th>Edite_OR_Delete_Details</th>
	                   
						
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="supplier" items="${listSupplier}">

						<tr>
							<td><c:out value="${supplier.id}" /></td>
							<td><c:out value="${supplier.item_name}" /></td>
							<td><c:out value="${supplier.item_material}" /></td>
							<td><c:out value="${supplier.item_country}" /></td>
							<td><c:out value="${supplier.supplier_name}" /></td>
							<td><c:out value="${supplier.supplier_email}" /></td>
							<td><c:out value="${supplier.supplier_phone}" /></td>
							<td><c:out value="${supplier.supplier_address}" /></td>	
							<td><a href="edit?id=<c:out value='${supplier.id}' />">Edit</a>		
							&nbsp;&nbsp;&nbsp;&nbsp;<a	
							href="delete?id=<c:out value='${supplier.id}' />">Delete</a></td>
							
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>