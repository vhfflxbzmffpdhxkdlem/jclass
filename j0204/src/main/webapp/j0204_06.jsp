<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>페이지</title>
		<style>
		h2{text-align:center;}
		table,th,td{border:1px solid black; border-collapse:collapse;}
		table{width:900px;margin:10px auto; text-align: center;}
		th,td{height:40px;}
		</style>
	</head>
	<body>
	<h2>리스트 출력</h2>
	
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>취미</th>
		</tr>
		<c:forEach items="${list }" var="mem">
		<tr>
			<td>${mem.id }</td>
			<td>${mem.name }</td>
			<td>${mem.hobby }</td>
		</tr>
		</c:forEach>
	</table>
	
	<hr>
	
	<h2>홍길동 회원정보</h2>
	<form action="" method="post">
	<label>아이디</label>
	<input type="text" name="id" value="${list[0].id }"><br/>
	<label>이름</label>
	<input type="text" name="name"value="${list[0].name }"><br/>
	<label>취미</label><br/>
	<input type="checkbox" id="game" name="hobby" value="게임"
	<c:if test="${fn:contains(list[0].hobby,'게임') }">checked</c:if>	>
	<label>게임</label>
	<input type="checkbox" id="golf" name="hobby" value="골프"
	<c:if test="${fn:contains(list[0].hobby,'골프') }">checked</c:if>	>
	<label>골프</label>
	<input type="checkbox" id="swim" name="hobby" value="수영"
	<c:if test="${fn:contains(list[0].hobby,'수영') }">checked</c:if>	>
	<label>수영</label>
	<input type="checkbox" id="run" name="hobby" value="조깅"
	<c:if test="${fn:contains(list[0].hobby,'조깅') }">checked</c:if>	>
	<label>조깅</label>
	<input type="checkbox" id="read" name="hobby" value="독서"
	<c:if test="${fn:contains(list[0].hobby,'독서') }">checked</c:if>	>
	<label>독서</label>
	</form>
	</body>
</html>