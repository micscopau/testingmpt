<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Media Preference Tracking</title>
</head>
<body>
    <div class="content">  
		<h1>Movie Tracker</h1>	
		<div class="main vlcone">

			<div class="pay_form">

				<div id="success" align='center'>${message}</div>
				 <form:form action="login" method="post" modelAttribute="userForm">
					<form:input path="userName" />
					<form:input path="Password" />
					<input type="submit" value="Log In">
				</form:form>
				 <form action="registration" method="GET">
					
					<input type="submit"  value="Create Account">
				</form> 
			</div>
		</div>
	</div>
</body>
</html>
