package kr.or.ddit.basic.req_resp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestTest02.do")
public class RequestTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int first = Integer.parseInt(request.getParameter("first"));
		String operator = request.getParameter("operator");
		int last = Integer.parseInt(request.getParameter("last"));
		double result = 0.0;
		boolean calOk = true; // 
		
		switch (operator) {
		case "+": result = first + last; break;
		case "-": result = first - last; break;
		case "*": result = first * last; break;
		case "/":
			if(last!=0) {
				result = (double)first / last; 
			}else {
				calOk = false;
			}
			break;
		case "%":
			if(last!=0) {
				result = first % last; 
			}else {
				calOk = false;
			}
			break;
		}
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><meta charset='utf-8'>");
		out.println("<title>Request객체 연습</title></head>");
		out.println("<body>");
		out.println("<hr>");
		out.println("<h2>계산 결과</h2>");
		out.println("<hr>");
		out.println(first + " " + operator + " " + last +" = " + result + "<br>");
		//out.printf("%d %s %d = %f", first, operator, last, result);
		out.printf("%d %s %d =", first, operator, last);
		
		// 계산 성공 여부를 확인해서 결과를 출력한다.
		if(calOk == true) { // 정상적인 계산이 완료 되었으면 결과 출력
			out.println(result);
		}else { // 분모가 0일때 나눗셈이나 나머지 연산을 했을 때 
			out.println("계산 불능 (0으로 나누기)");
		}
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
