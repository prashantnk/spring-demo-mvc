<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"/>
<title>Student Confirmed</title>
</head>
<body>

<div class="ui container">
<h2>
Student Name: ${student.firstName} ${student.lastName}
</h2>
<h2>
Country: ${student.country}
</h2>
<h2>
favoriteLanguage: ${student.favoriteLanguage}
</h2>

<h2 class="ui list">
	<label>Used OS : </label>
	<c:forEach var="temp" items="${student.OS}">
		<div class="item">
			${temp}
		</div>
	</c:forEach>

</h2>


</div>

</body>
</html>