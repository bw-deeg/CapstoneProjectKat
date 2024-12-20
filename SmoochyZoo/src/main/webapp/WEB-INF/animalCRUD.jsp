<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Smoochy Zoo's Animals</title>
<%@  include file="bootstraphead.jsp" %>
</head>
<body>

<div class="container">
		<div class="row">
			<a href="index.do"> Home</a>
			<br>
			<br>
		</div>
		<div class="row">
		  	 <div id="outer">
		  	 <strong>Add an animal to our Smoochy Zoo</strong>
		<br>
		You will be asked to enter the Animal's name, birthday, category, species, and Gender.
		<br>
		<div class="inner">
		<form action="addAnimal.do" method="post" >
			<br>
				
				<label for="name">Name</label><br>
				<input type="text" id="name" name="name" />
				<br>
				<br>
				<label for="birthday">Select Your Animals Birthday</label><br>
				<input type="date" name="birthday" id="birthday">
				<br>
				<br>
				<label for="category.id">Category</label><br>
				<select name="category.id">
				<c:forEach items="${categoryList}" var="category">
				    <option value="${category.id}">${category.name }</option>
				</c:forEach>
				</select>
				<br>
				<br>
				<label for="species.id">Species</label><br>
					<select name="species.id">
						<c:forEach items="${speciesList}" var="species">
						    <option value="${species.id}">${species.name }</option>
						 </c:forEach>
					</select>
				<br>
				<br>
				<label for="gender">Gender</label><br>
				<select name="gender">
				    <option value="Male">Male</option>
				    <option value="Female">Female</option>
				 </select>
				<br>
				<br>
				<input type="submit" value="Add the Animal to the Zoo">
			<br>
			<br>
			<br>
		</form>
		
		</div>

	</div>
</div>
</body>
</html>