<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그아웃</title>
	</head>
	<body>
		<%
			session.invalidate();   // 모든 세션종료
			// removeAttribute("session_id");  // 특정 세션만 종료   
			response.sendRedirect("j0204_01.jsp"); // 페이지 이동
		%>
	</body>
</html>