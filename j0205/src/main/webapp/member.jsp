<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user</title>
		<style>
			h2{text-align: center;}
			table,th,td{border:1px solid black; border-collapse:collapse;}
			table{width:800px; margin:10px auto;text-align: center;}
			th,td{height:40px}
		</style>
	</head>
	<body>
	<h2>맵버 리스트</h2>
	<table>
		<colgroup>
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="*%">
		</colgroup>
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>취미</th>
		</tr>
		<!-- 10번 반복 -->
		<c:forEach items="${list1}" var="dto">
			<tr>
				<td>${dto.id }</td>
				<td>${dto.pw }</td>
				<td>${dto.name }</td>
				<td>${dto.tel }</td>
				<td>${dto.gender }</td>
				<td>${dto.hobby }</td>
			</tr>
		</c:forEach>
	</table>
	</body>
</html>