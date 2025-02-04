<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="j0204_07.jsp" method="post">
		<label>아이디</label>
		<input type="text" name="id"><br/>
		<label>패스워드</label>
		<input type="text" name="pw"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>전화번호</label>
		<input type="text" name="tel"><br/>
		<label>성별</label><br/>
		<input type="radio" name="gender" id="man" value="man">
		<label>남자</label>
		<input type="radio" name="gender" id="woman" value="woman">
		<label>여자</label><br/>
		<label>취미</label><br/>
		<input type="checkbox" name="hobby" id="game" value="게임">
		<label>게임</label>
		<input type="checkbox" name="hobby" id="golf" value="골프">
		<label>골프</label>
		<input type="checkbox" name="hobby" id="swim" value="수영">
		<label>수영</label>
		<input type="checkbox" name="hobby" id="run" value="조깅">
		<label>조깅</label>
		<input type="checkbox" name="hobby" id="read" value="독서">
		<label>독서</label><br/>
		<input type="submit" value="로그인">


		</form>
	</body>
</html>