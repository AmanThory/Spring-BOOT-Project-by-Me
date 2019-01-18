<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" >
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container" >
		<div class="jumbotron">
        
           <h2>Register Here </h2>
			<form action="/update?id=${user.getUid()}" method="post">
				<input type="text" name="uname"  value="${user.getUname() }" class="form-control" required><br>
				<input type="email" name="uemail" value="${user.getUemail()}"  class="form-control"  required><br>
				<input type="password" name="upassword" value="${user.getUpassword() }" class="form-control"  required><br>
				<input type="number" name="unumber"  value="${user.getUnumber() }" class="form-control"  required><br>
				<a class="btn btn-primary" href="login.jsp" > Login here </a>
				<input type="submit" class="btn btn-success" >
			</form>
			
		</div>	
			
			
			
<script src="webjars/jquery/1.9.1/jquery.min.js" ></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.css"></script>

</body>
</html>