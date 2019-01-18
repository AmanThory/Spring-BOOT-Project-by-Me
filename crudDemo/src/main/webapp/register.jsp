<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
<body class="container" >
		<div class="jumbotron">
        
           <h2>Register Here </h2>
			<form:form method="post" modelAttribute="user" action="/register">
				<form:label path="uname">User Name :</form:label>
				<form:input type="text" path="uname"  class="form-control" placeholder="Enter Your name" required="required" /><br>
				
				<form:label path="uemail">user Email</form:label>
				<form:input type="email" path="uemail"  class="form-control" placeholder="Enter Your Email" required="required" /><br>
				<form:errors path="uemail" cssClass="text-danger"></form:errors>
				
				<form:label path="upassword">User Password</form:label>
				<form:input type="password" path="upassword" class="form-control" placeholder="Enter Your Password"  required="required" /><br>
				
				<form:label path="unumber">Phone No.</form:label>
				<form:input type="number" path="unumber"  class="form-control" placeholder="Enter Your Phone number" required="required" /><br>
				<form:errors path="unumber" cssClass="text-danger"></form:errors>
				
				<form:label path="pincode">pincode</form:label>
				<form:input type="text" path="pincode"  class="form-control" placeholder="Enter Your PinCode number" required="required" /><br>
				<form:errors path="pincode" cssClass="text-danger"></form:errors>
				
				
			<%-- 	<form:a class="btn btn-primary" href="login.jsp" > Login here </form:a> --%>
				<button type="submit" class="btn btn-success" >Submit</button>
			</form:form>
			
		</div>	
			
			
			
<%@ include file="common/footer.jsp" %>			