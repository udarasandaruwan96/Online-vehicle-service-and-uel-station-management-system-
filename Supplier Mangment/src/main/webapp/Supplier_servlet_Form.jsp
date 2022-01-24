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
			style="background-color: green">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand">  Supplier Management </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Existing List </a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${supplier != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${supplier == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${supplier != null}">
            			Edit Supplier
            		</c:if>
						<c:if test="${supplier == null}">
            			Add New Supplier
            		</c:if>
					</h2>
				</caption>

				<c:if test="${supplier != null}">
					<input type="hidden" name="id" value="<c:out value='${supplier.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Supplier Item_name</label> <input type="text"
						value="<c:out value='${supplier.item_name}' />" class="form-control"
						name="item_name" required="required">
				</fieldset>

	            <fieldset class="form-group">
					<label>Supplier Item_material</label> <input type="text"
						value="<c:out value='${supplier.item_material}' />" class="form-control"
						name="item_material" required="required">
				</fieldset>

				 <fieldset class="form-group">
					<label>Supplier Item_country</label> <input type="text"
						value="<c:out value='${supplier.item_country}' />" class="form-control"
						name="item_country" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Supplier Supplier_name</label> <input type="text"
						value="<c:out value='${supplier.supplier_name}' />" class="form-control"
						name="supplier_name" required="required">
			   </fieldset>
				
				 <fieldset class="form-group">
					<label>Supplier Supplier_email</label> <input type="text"
						value="<c:out value='${supplier.supplier_email}' />" class="form-control"
						name="supplier_email" required="required">
				</fieldset>
				
				 <fieldset class="form-group">
					<label>Supplier Supplier_phone</label> <input type="text"
						value="<c:out value='${supplier.supplier_phone}' />" class="form-control"
						name="supplier_phone" required="required">
				</fieldset>
				
				 <fieldset class="form-group">
					<label>Supplier Supplier_address</label> <input type="text"
						value="<c:out value='${supplier.supplier_address}' />" class="form-control"
						name="supplier_address" required="required">
				</fieldset>
				

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
	
	
</body>
</html>