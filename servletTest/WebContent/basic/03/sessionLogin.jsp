<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 로그인 시작페이지</title>
</head>
<body>

<%
	// 세션의 key값인 'userId'에 저장된 데이터를 읽어온다.
	// 이 때 값이 null이면 세션에 저장되지 않은것이 된다.
	String userId = (String)session.getAttribute("userId");		
//if(session.getAttribute("userId") == null || session.getAttribute("pass") ==null){
	if(userId == null){
%>
<form method="post" action="<%= request.getContextPath()%>/sessionLogin.do">
<table border="1">
	<tr>
		<td>ID:</td>
		<td><input type="text" name="userid" placeholder="ID를 입력하세요."></td>
	</tr>
	
	<tr>
		<td>PASS:</td>
		<td><input type="password" name="pass" placeholder="PassWord를 입력하세요."></td>
	</tr>
	
	<tr>
		<td colspan="2" style="text-align: center;"><button type="submit" value="Login">Login</button></td>
	</tr>
</table>
</form>

<%	
}else{
%>
<h2><%=/*session.getAttribute("userId")*/userId %>님 반갑습니다.</h2>
<a href="<%= request.getContextPath()%>/sessionLogout.do">로그아웃</a>
<%
}
%>

</body>
</html>