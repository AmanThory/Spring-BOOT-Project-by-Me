<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
<body class="container">

<script>

     function error(){
    	 alert('Do you want to delete ');
     }

</script>


 <table class="table table-stripet" style="margin-top:20px">
       <thead>
             <th>Name</th>
             <th>Email</th>
             <th>Password</th>
             <th>Number</th>
             <th></th>
             <th></th>
       </thead>
       <tbody>
       <c:forEach var="users" items="${user}">
                <tr>
                     <td>${users.getUname() }</td>
		             <td>${users.getUemail() }</td>
		             <td>${users.getUpassword() }</td>
		             <td>${users.getUnumber() }</td>
		             <td><a href="/updateShowData?id=${users.getUid()}" class="btn btn-primary">Update</a></td>
		             <td><a href="/delete?id=${users.getUid()}" class="btn btn-warning"  onclick="error()">Delete</a></td>
		             
                </tr>
            </c:forEach>
             
       </tbody>
 </table>

<%@ include file="common/footer.jsp" %>