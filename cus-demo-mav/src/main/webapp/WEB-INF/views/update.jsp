<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="de"%>
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
		<h3 Class="text-primary">Update Customer</h3>
		<de:form action="update-customer" method="post"
			modelAttribute="customer" class="col-4">
			<div class="mb-2">
				<de:label path="CustId" class="fw-bold">Customer ID</de:label>
				<de:input path="CustId" class="form-control border-dark"
					readonly="true" />
				<de:errors path="CustId" cssStyle="color:red" />
			</div>
			<div class="mb-2">
				<de:label path="CustName" class="fw-bold">Customer Name</de:label>
				<de:input path="CustName" class="form-control border-dark" />
				<de:errors path="CustName" cssStyle="color:red" />
			</div>
			<div class="mb-2">
				<de:label path="email" class="fw-bold">Customer Email</de:label>
				<de:input path="email" class="form-control border-dark" />
				<de:errors path="email" cssStyle="color:red" />
			</div>
			<div class="mb-2">
				<de:label path="mobile" class="fw-bold">Customer Mobile_NO</de:label>
				<de:input path="mobile" class="form-control border-dark" />
				<de:errors path="mobile" cssStyle="color:red" />
			</div>
			<div class="mb-2">
				<de:label path="subscriptionFee" class="fw-bold">Customer Sub_Fee</de:label>
				<de:input path="subscriptionFee" class="form-control border-dark" />
				<de:errors path="subscriptionFee" cssStyle="color:red" />
			</div>
			<div class="mb-2">
				<de:label path="doj" class="fw-bold">Date of Order</de:label>
				<de:input type="date" path="doj" class="form-control border-dark" />
				<de:errors path="doj" cssStyle="color:red" />
			</div>
			<div class="d-flex">
				<button class="btn btn-primary w-100">Update Customer</button>
			</div>
		</de:form>
	</div>
</body>
</html>