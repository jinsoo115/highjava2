/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.107
 * Generated at: 2021-02-26 12:01:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.or.ddit.vo.MemberVO;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");

	MemberVO memVo = (MemberVO)request.getAttribute("memberVo");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t// 회원 목록 버튼 클릭 처리\r\n");
      out.write("\t\t$(\"#memListBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/memberList.ddit\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t// 수정 버튼 클릭 처리\r\n");
      out.write("\t\t$(\"#updateBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\tvar memForm = document.getElementById(\"memberForm\");\r\n");
      out.write("\t\t\tmemForm.action = \"");
      out.print(request.getContextPath());
      out.write("/member/memberUpdateForm.ddit\";\r\n");
      out.write("\t\t\tmemForm.submit(); //서버로 전송하게 하는 메서드\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 삭제 버튼 클릭 처리\r\n");
      out.write("\t\t$(\"#deleteBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\tvar memForm = $(\"#memberForm\").get(0);\r\n");
      out.write("\t\t\tmemForm.action = \"");
      out.print(request.getContextPath());
      out.write("/member/memberDelete.ddit\";\r\n");
      out.write("\t\t\tmemForm.submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>회원 정보 상세 보기</h2>\r\n");
      out.write("\r\n");
      out.write("<form id=\"memberForm\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"mem_id\" value=\"");
      out.print(memVo.getMem_id());
      out.write("\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>회원ID</td>\r\n");
      out.write("\t\t<td>");
      out.print(memVo.getMem_id() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>회원이름</td>\r\n");
      out.write("\t\t<td>");
      out.print(memVo.getMem_name() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>전화번호</td>\r\n");
      out.write("\t\t<td>");
      out.print(memVo.getMem_tel() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>회원주소</td>\r\n");
      out.write("\t\t<td>");
      out.print(memVo.getMem_addr() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"수정\" id=\"updateBtn\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"삭제\" id=\"deleteBtn\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"회원목록\" id=\"memListBtn\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
