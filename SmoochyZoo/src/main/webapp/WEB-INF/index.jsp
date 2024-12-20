<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Smoochy Zoo</title>
<style>
body { 
	background-image: linear-gradient(rgba(255, 255, 255, 0.75), rgba(255, 255, 255, 0.75)),
                  url("images/SmoochyZoo.jpg");
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<h2>Welcome to the Smoochy Zoo</h2>
		
			<p>
			We are a small zoo that has a huge heart and is known for our Animals who love to Smooch!
			Please feel free to explore our zoo and meet our animals.
			<br>
			Our Zoo is a place where a number of wildlife species are housed in separate enclosures. 
			Our habitats mimic the habitats that our animals would find in the wild. 
			The animals are fed and are given water to drink and are kept in hygienic surroundings by our wonderful staff. 
			An animal that falls ill or develops a disease is given medical attention by our trained 
			veterinarians and nursed back to health.
			<br>
			Mammals, birds and reptiles are precious residents of our zoo. 
			Children especially love to visit our Smoochy Zoo.
			</p>
			
			<jsp:include page="animalhome.jsp" />
			<jsp:include page="animalCRUD.jsp" />
		</div>
	</div>

</body>
</html>