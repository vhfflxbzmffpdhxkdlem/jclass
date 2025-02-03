<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
		<style>
		*{margin:0;padding:0;}
		header{display:flex;}
		header div{width:120px; heigth:40px; border:1px solid black; border-collapse:collapse;
		 display:flex; align-items:center; justify-content:center; text-align:center}
		.back{width:100%; height:300px; overflow:hidden;}
		</style>
	</head>
	<body>
	
	<%@ include file="Top.jsp" %>
	
	<div class="back">
	<img src="./images/back1.jpg"/>
	</div>
	
	<%@ include file="footer.jsp" %>
	
	</body>
</html>