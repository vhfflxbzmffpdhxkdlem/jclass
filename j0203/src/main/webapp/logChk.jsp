<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%-- jsp주석 : 소스보기에 안나타남. --%>
	<!-- html주석 : 소스보기에 나타남  -->
	<%
	    String id = request.getParameter("id");
	    String[] saveId = request.getParameterValues("saveId");
	    if(saveId != null) {
	    	Cookie cookie = new Cookie("cook_id",id); //쿠키객체생성
		    cookie.setMaxAge(60*60*24*365); // 60초 * 60분 * 24시간 *365일 (1년)
		    response.addCookie(cookie);
	%>	    
        <div><%= saveId[0] %> (가)이 저장되었습니다.</div>
	    <%}else{
	    	Cookie[] cookies = request.getCookies();
	    	for(Cookie cookie : cookies){
	    		if(cookie.getName().equals("cook_id")){
	    			cookie.setMaxAge(0);
	    			response.addCookie(cookie);
	    		}
	    	}
	    %>
	    <div>쿠키에 저장되어 있는 cook_id (가)이 삭제 되었습니다.</div>
	    <%} %>
   
    <div>정보 : <%= saveId %></div>
	
	<button onclick="javascript:location.href='logOk.jsp'">이동하기</button>
	
	</body>
</html>