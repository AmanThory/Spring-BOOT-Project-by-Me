<%@ include file="common/header.jsp" %>
<h2 style="margin-top:20px" ></h2>
<%@ include file="common/navbar.jsp" %>
<body class="container" >
		<div class="jumbotron">
        
           <h2>Login Here </h2>
			<form action="/login" method="post">
				<input type="email" name="uemail"  class="form-control" placeholder="Enter Your Email" required><br><br>
				<input type="password" name="upassword" class="form-control" placeholder="Enter Your Password"  required><br><br>
				<a class="btn btn-primary" href="register.jsp" > register here </a>
				<input type="submit" class="btn btn-success" >
			</form>
			
		</div>	
		
<%@ include file="common/footer.jsp" %>