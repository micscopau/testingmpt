<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recommendation</title>
</head>
<body>
<h3>Hi ${fName}</h3>

<a href="login"> Recommendation</a>
<a href="Search"> Search</a>
<a href="MyLists-Ratings"> MyLists</a>
<a href="logout">Log out</a>
<a href="editprofile">Edit Profile</a>
<h3> Displaying Recommendation list </h3>
<h4> List of Movies </h4>
<table>
 <tr>
    <th>Movie Title</th>
    <th>Ratings</th>		
    <th>Ignore</th>
    <th>Wish</th>
  </tr>
  <tr>
    <td>Movie Title 1</td>
    <td>4</td> 
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>   
    <td>Movie Title 2</td>
    <td>0</td> 
    <td>1</td>
    <td>0</td>
  </tr>
</table>
<form action="dbupdate" method="POST">
<input type="submit" name="action" value="Save" />
<input type="submit" name="action" value="Cancel" />
</form> 
</body>
</html>