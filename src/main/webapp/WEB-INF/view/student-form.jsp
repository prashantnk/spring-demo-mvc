<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- adding spring name space -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"/>
</head>
<body>

<div class="ui container" style="margin-top:10px">


	<form:form class="ui form" action="processForm" modelAttribute="student">
	
	
	<div class="field" > 
	
		<label for="firstName">Enter First Name : </label>
		<form:input type="text" path="firstName" />
		
	</div>
	
	
	<div class="field" > 
		<label for="lastName">Enter Last Name : </label>
		
		<form:input type="text" path="lastName" />
	</div>
	<div class="field" > 
		<label >Select your country : </label>
		
		<form:select path="country">
			<form:options items="${countryOptions}"/>
			
		</form:select>
	</div>
	<div class="field" > 
		<label >Select your Favorite Language : </label>
		
		<form:radiobuttons path="favoriteLanguage" items="${student.languages}"/>
	
	</div>
	<div class="field" > 
		<label >Select OS Experienced : </label>
		
		<div class="ui checkbox">
			<form:checkbox path="OS" value="Mac"/>
			<label>Mac</label>
		</div>
		<div class="ui checkbox">
			<form:checkbox path="OS" value="Linux"/>
			<label>Linux</label>
		</div>
		<div class="ui checkbox">
			<form:checkbox path="OS" value="Windows"/>
			<label>Windows</label>
		</div>	
	</div>
	
	<button class="ui button" type="submit"> Submit </button>
	
	</form:form>
	
</div>


</body>
</html>