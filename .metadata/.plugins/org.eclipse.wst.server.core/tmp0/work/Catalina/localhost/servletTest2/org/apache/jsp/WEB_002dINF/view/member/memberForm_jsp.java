/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.107
 * Generated at: 2021-03-02 00:16:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>member?????? ??? ?????????</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#memListBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/memberList.ddit\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar chkMemId = \"\"; // ???????????? ??? ?????? ID??? ????????? ?????????\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// ?????? ?????? ?????? ?????? ??????\r\n");
      out.write("\t\t$(\"#idCheck\").on(\"click\", function() {\r\n");
      out.write("\t\t\tvar memId = $(\"#mem_id\").val(); // ????????? ??????ID ????????????\r\n");
      out.write("\t\t\tif(memId==\"\"){\r\n");
      out.write("\t\t\t\talert(\"??????ID??? ???????????????.\");\r\n");
      out.write("\t\t\t\t$(\"#mem_id\").focust();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"");
      out.print(request.getContextPath());
      out.write("/member/memberIdCheck.ddit\",\r\n");
      out.write("\t\t\t\tmethod : \"post\",\r\n");
      out.write("\t\t\t\tdata : {\"mem_id\" : memId},\r\n");
      out.write("\t\t\t\tdataType : \" json\",\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t//alert(result)\r\n");
      out.write("\t\t\t\t\tif(result==\"OK\"){\r\n");
      out.write("\t\t\t\t\t\t$(\"#idChkResult\").html(\"?????? ?????? ID\");\r\n");
      out.write("\t\t\t\t\t\tchkMemId = memId;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(\"#idChkResult\").html(\"ID?????? - ????????????\");\r\n");
      out.write("\t\t\t\t\t\tchkMemId = \"\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(xhr) {\r\n");
      out.write("\t\t\t\t\talert(\"?????? - ????????? : \" + xhr.sataus);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// ?????? ?????? ?????? ==> form??? submit ??? ???\r\n");
      out.write("\t\t$(\"#memberForm\").on(\"submit\", function() {\r\n");
      out.write("\t\t\tvar memId = $(\"#mem_id\").val();\r\n");
      out.write("\t\t\tvar idChk = $(\"#idChkResult\").html().trim();\r\n");
      out.write("\t\t\tif(chkMemId != memId || idChk!=\"?????? ?????? ID\"){\r\n");
      out.write("\t\t\t\talert(\"ID??? ??????????????? ?????????????????????.. ????????? ID??? ???????????????.\");\r\n");
      out.write("\t\t\t\t$(\"#mem_id\").focus();\r\n");
      out.write("\t\t\t\treturn false;  // ????????? ????????? ????????????.\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true; // ????????? ?????? ????????? ????????????.\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>?????? ?????? ?????? ???</h2>\r\n");
      out.write("<form id=\"memberForm\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/member/memberInsert.ddit\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>??????ID</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"mem_id\" id=\"mem_id\"><input type=\"button\" value=\"????????????\" id=\"idCheck\"><br><span id=\"idChkResult\"></span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>????????????</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"mem_name\" id=\"mem_name\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>????????????</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"mem_tel\" id=\"mem_tel\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>????????????</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"mem_addr\" id=\"mem_addr\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"??????\">\r\n");
      out.write("\t\t\t<input type=\"reset\" value=\"??????\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"????????????\" id=\"memListBtn\">\r\n");
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
