<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
	
	<!-- This is jsp Fragementation --> 

<body class="container" >

<div style="margin-top:20px">
	<a class="btn btn-primary"  href="login.jsp">Login Here</a>
	<a class="btn btn-success"  href="register.jsp">Register Here</a>
	<a class="btn btn-primary"  href="/allData">All Data</a><br><br>
	<a class="btn btn-primary"  href="/show">Show Register</a><br><br>
	
	<form action="" enctype="Multiparted/Data">
		<input class="btn btn-primary" type="file" name="file" ><br>
		<button class="btn btn-primary" >Updload File</button> 
	</form>
	
</div>

<%@ include file="common/footer.jsp" %>