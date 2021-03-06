<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food Order</title>
<style type="text/css">
.divider:after, .divider:before {
	content: "";
	flex: 1;
	height: 1px;
	background: #eee;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>


	<section class="vh-100">
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<div class="d-flex justify-content-center">
						<h1>Admin Pannel</h1>
					</div>
					<form action="adminLogin" method="post" >
						<!-- Email input -->
						<div class="form-outline mb-4">
							<label class="form-label" for="form1Example13">Email address</label>
							<input type="email" name="adminEmail" id="form1Example13" class="form-control form-control-lg" />

						</div>

						<!-- Password input -->
						<div class="form-outline mb-4">
							<label class="form-label">Password</label>
							<input type="password" name="adminPassword" id="form1Example23" class="form-control form-control-lg" />

						</div>

						<!-- Submit button -->
						<button type="submit" class="btn btn-primary btn-lg btn-block">Sign in</button>

<%--						<div class="divider d-flex align-items-center my-4">--%>
<%--							<p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>--%>
<%--						</div>--%>

<%--						<a class="btn btn-primary btn-lg btn-block"--%>
<%--							style="background-color: #3b5998" href="#!" role="button"> <i--%>
<%--							class="fab fa-facebook-f me-2"></i>Continue with Facebook--%>
<%--						</a> <a class="btn btn-primary btn-lg btn-block"--%>
<%--							style="background-color: #55acee" href="#!" role="button"> <i--%>
<%--							class="fab fa-twitter me-2"></i>Continue with Twitter--%>
<%--						</a>--%>

					</form>
				</div>
			</div>
		</div>
	</section>





</body>
</html>