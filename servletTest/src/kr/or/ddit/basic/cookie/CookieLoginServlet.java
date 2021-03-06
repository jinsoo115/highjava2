package kr.or.ddit.basic.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieLoginServlet.do")
public class CookieLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		// form에서 넘어오는 Parameter값들을 구한다.
		String userId = request.getParameter("userid"); // userid값 
		String pass = request.getParameter("pass"); // pass값 
		String chk = request.getParameter("chkid"); // 체크박스의  체크여부
		
		// 일단 Cookie 객체 생성
		Cookie cookie = new Cookie("userId", userId);
		
		// checkbox의 체크 여부에 따라 쿠키값을 저장한다.
		if(chk != null) { // 체크된 상태이다.
			response.addCookie(cookie); // 쿠키 저장
		}else { // 체크가 안된 상태일 때.
			cookie.setMaxAge(0); // 쿠키의 유효시간을 0으로 설정하여 쿠키를 삭제한다.
			response.addCookie(cookie);
		}
		
		// 로그인 성공 여부 검사하기 (성공id : test, password:1234)
		if(userId != null && pass != null) { // 해당 변수의 null값이 여부 검사
			if(userId.equals("test") && pass.equals("1234")) {
				// 로그인 성공시 cookieMain.jsp로 이동
				response.sendRedirect(request.getContextPath() + "/basic/02/cookieMain.jsp");
			}else {
				// 로그인 실패시 cookieLogin.jsp로 이동
				response.sendRedirect(request.getContextPath() + "/basic/02/cookieLogin.jsp");
			}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
