<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<title>Shopping Site - ${title}</title>
<script>
	window.menu = ' ${title}';

	window.contextRoot = '${contextRoot}';
</script>


<style>
.fa {
  padding: 20px;
  font-size: 30px;
  width: 30px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
  border-radius: 50%;
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


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- Bootstrap readable theme-->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Bootstrap DataTable-->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- load only when user clicks list product -->
			<c:if
				test="${userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@include file="listProducts.jsp"%>
			</c:if>

			<!-- load only when user clicks show product -->
			<c:if test="${userClickShowProduct == true }">
				<%@include file="singleProduct.jsp"%>
			</c:if>

			<!-- load only when user clicks manage product -->
			<c:if test="${userClickManageProducts == true }">
				<%@include file="manageProducts.jsp"%>
			</c:if>

			<!-- load only when user clicks show cart-->
			<c:if test="${userClickShowCart == true }">

				<%@include file="cart.jsp"%>
			</c:if>


		</div>

		<!-- /.container -->


		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>

		<script src="${js}/jquery.validate.js"></script>

		<script src="${js}/popper.js"></script>

		<script src="${js}/bootstrap.min.js"></script>

		<script src="${js}/dataTables.bootstrap.js"></script>

		<script src="${js}/jquery.dataTables.js"></script>

		<script src="${js}/bootbox.min.js"></script>

		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
