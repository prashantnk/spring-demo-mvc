<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/public/error.css"></link>

</head>
<body>
<div class="ui container" >
<form:form action="processForm" modelAttribute="customer" cssClass="ui form">

<div class="ui field">
<label>First Name</label>

<form:input path="firstName"/>
</div>
<div class="field">
<label>Last Name(*)</label>

<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
</div>
<div class="field">
<label>Free passes</label>

<form:input path="passes"/>
<form:errors path="passes" cssClass="error"/>
</div>
<div class="field">
<label>Postal Code</label>

<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
</div>
<button type="submit" class="ui button primary">Submit</button>

</form:form>
<footer> <i>(*) fields are required ! </i></footer>
</div>
</body>

</html>




