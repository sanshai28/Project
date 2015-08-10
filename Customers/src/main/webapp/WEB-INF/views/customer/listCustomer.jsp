<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>List Of Customers</title>
<link rel="stylesheet"
	href='<c:url value="/web-resources/css/pure-0.4.2.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>



<style>
th {
	text-align: left
}
</style>
</head>

<body>

<div style="width: 95%; margin: 0 auto;">

<div id="customerDialog" style="display: none;">
			<%@ include file="customerForm.jsp"%>
		</div>

		<h1> Customers</h1>

		<button  onclick="addCustomer()">
			Add Customer
		</button>
		
		<br>
		<table  >
		<thead>
		<tr>
					<th width="12%">Number</th>
					<th width="12%">Code</th>
					<th width="12%">Name</th>
					<th width="12%">Phone Number</th>
					<th width="12%">Department</th>
					
				</tr>
				</thead>
				<tbody>
				
				<c:forEach items="${customerList}" var="customer" varStatus="loopCounter">
				<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${customer.customerCode}" /></td>
						<td><c:out value="${customer.customerName}" /></td>
						<td><c:out value="${customer.phoneNo}" /></td>
						<td><c:out value="${customer.department}" /></td>
			
						
						
						<td><nobr>
								<button 
									onclick="editCustomer(${customer.customerId});">

										Edit
								</button>
							
								<a 
									onclick="return confirm('Are you sure you want to delete this Customer?');"
									href="delete/${customer.customerId}"> Delete
								</a>

				</nobr></td>
				
				
				</tr>
				</c:forEach>
			
				</tbody>
		
		
		</table>
		
</div>
<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
	
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listcustomer.js"/>'></script>
</body>
</html>