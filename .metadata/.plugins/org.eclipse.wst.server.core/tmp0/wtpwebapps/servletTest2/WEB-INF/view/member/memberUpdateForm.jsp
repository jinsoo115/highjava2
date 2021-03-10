<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	MemberVO memVo = (MemberVO)request.getAttribute("memberVo");
%>
<title>member update</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 회원 목록 버튼 클릭 처리
		$("#memListBtn").on("click", function() {
			location.href="<%=request.getContextPath()%>/member/memberList.ddit";
		});
		//취소버튼 클릭 처리
		$("#cancleBtn").on("click", function() {
			location.href="<%=request.getContextPath()%>/member/memberView.ddit?mem_id=<%=memVo.getMem_id()%>";
		})
	})
</script>
</head>
<body>
<h2>회원 정보 수정 폼</h2>

<%-- <form id="memberForm" method="post" action="<%=request.getContextPath()%>/member/memberUpdate.ddit?mem_id=<%=memVo.getMem_id()%>"> --%>
<form id="memberForm" method="post" action="<%=request.getContextPath()%>/member/memberUpdate.ddit">
<input type="hidden" name="mem_id" value="<%=memVo.getMem_id()%>">
<table border="1">
	<tr>
		<td>회원ID</td>
		<%-- <td><%=memVo.getMem_id() %></td> --%>
		<td><input type="hidden" name="mem_id" id="mem_id" value="<%=memVo.getMem_id() %>"><%=memVo.getMem_id() %></td>
	</tr>
	<tr>
		<td>회원이름</td>
		<td><input type="text" name="mem_name" id="mem_name" value="<%=memVo.getMem_name() %>"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="mem_tel" id="mem_tel" value="<%=memVo.getMem_tel() %>"></td>
	</tr>
	<tr>
		<td>회원주소</td>
		<td><input type="text" name="mem_addr" id="mem_addr" value="<%=memVo.getMem_addr() %>"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장" id="updateBtn">
			<input type="button" value="취소" id="cancleBtn">
			<input type="button" value="회원목록" id="memListBtn">
		</td>
	</tr>
</table>
</form>
</body>
</html>