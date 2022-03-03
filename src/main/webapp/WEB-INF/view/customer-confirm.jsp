<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"/>
<title>Customer Confirmed</title>
</head>
<body>

<div class="ui container">
<h2>
Name: ${customer.firstName} ${customer.lastName}
</h2>
<h2>
freePasses : ${customer.passes}
</h2>
<h2>
Postal Code : ${customer.postalCode}
</h2>
<h2>
Course Code : ${customer.courseCode}
</h2>
</div>

</body>
</html>