<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3 class="text-info">Customer Management System</h3>
		<hr>
		<a class="btn btn-info" href="add">Add Customer</a>
		<table class="table table-striped">
			<thead class="border border-info border-0 border-bottom border-3">
				<tr>
					<th>Customer Id</th>
					<th>Customer Name</th>
					<th>Customer Email</th>
					<th>Mobile_Number</th>
					<th>Subscription Fee</th>
					<th>Date of order</th>
					<th class="text-center">Actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="customers" items="${customers}">
					<tr>
						<td>${customers.custId}</td>
						<td>${customers.custName}</td>
						<td>${customers.email}</td>
						<td>${customers.mobile}</td>
						<td>${customers.subscriptionFee}</td>
						<td>${customers.doj}</td>
						<td class="d-flex"><a
							href="update?custId=${customers.custId }"
							class="btn btn-outline-primary w-50 mx-2">Edit</a> <a
							onclick="return confirm('Do you wish to delete customer ${customers.custName}')"
							href="delete?custId=${customers.custId }"
							class="btn btn-outline-danger w-50 mx-2">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>