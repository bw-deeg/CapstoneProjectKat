<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Smoochy Zoo Animal</title>
<%@  include file="bootstraphead.jsp" %>
</head>
<body>
	<div class="container">
	<h1>New Animal Information</h1>
	<h1>${animal }</h1>
	<div class="row">
	<c:choose>
		<c:when test="${! empty animal }">
			<h5>You have successfully added </h5><br>
			The Animal's Name is: ${animal.name}<br>
			The Animal's Birthday is is: ${animal.birthday}<br>
			The Animal's Gender is: ${animal.gender }<br>
			The Animal's Category is: ${animal.category.name }<br>
			The Animal's Species is: ${animal.species.name }<br>
		</c:when>
		<c:otherwise>
			Unable to introduce the Animal to our Zoo!
		</c:otherwise>
	</c:choose>
	<br>
	<br>
	<form action="index.do">
		<input type="submit" value="Home"/><br>
	</form>
	</div>
	</div>
</body>	
<head>

	
<%@  include file="bootstrapfooter.jsp" %>
</body>
</html>