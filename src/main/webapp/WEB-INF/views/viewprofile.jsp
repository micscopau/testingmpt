<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Lists</title>
</head>
<body>
    <h3>Hi ${Username}</h3>
    	<form:form action="profile" method="post" modelAttribute="userForm">
            <center>
            <table border="1" >
                <thead>
                    <tr>
                        <th colspan="2">Edit User information</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><form:input value="${fName}"  path="fName" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><form:input value="${lName}" path="lName" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><form:input value="${email}"  path="email" /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><form:input value= "${uName}"  path="userName" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><form:input value=""  path="password" /></td>
                    </tr>
     
                    <tr>
                        <td><input type="submit" name="action" value="Save" /></td>
                        <td><input type="submit" name="action" value="Cancel" /></td>
                    </tr>         
                </tbody>
            </table>
            </center>
         </form:form>
    </body>
</html>