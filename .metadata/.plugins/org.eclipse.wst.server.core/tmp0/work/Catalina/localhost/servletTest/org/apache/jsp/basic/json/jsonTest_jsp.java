/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.107
 * Generated at: 2021-02-16 06:34:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.basic.json;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsonTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>JSON데이터 처리하기</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t// 문자열\r\n");
      out.write("\t$(\"#strBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\"url\" : \"");
      out.print(request.getContextPath());
      out.write("/JSONServlet.do\",\r\n");
      out.write("\t\t\t\"type\" : \"post\",\r\n");
      out.write("\t\t\t\"data\" : \"choice=str\",\r\n");
      out.write("\t\t\t\"success\" : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#result\").empty(); // div태그 안의 내용 삭제\r\n");
      out.write("\t\t\t\t$(\"#result\").append(data);\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"<hr color='red'>\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"dataType\" : \"json\"\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("\t// 배열\r\n");
      out.write("\t$(\"#arrayBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\"url\" : \"");
      out.print(request.getContextPath());
      out.write("/JSONServlet.do\",\r\n");
      out.write("\t\t\t\"type\" : \"post\",\r\n");
      out.write("\t\t\t\"data\" : \"choice=array\",\r\n");
      out.write("\t\t\t\"success\" : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#result\").empty(); // div태그 안의 내용 삭제\r\n");
      out.write("\t\t\t\t$.each(data, function(i,v) {\r\n");
      out.write("\t\t\t\t\t$(\"#result\").append(i + \"번째 자료 : \" + v + \"<br>\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"<hr color='red'>\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"dataType\" : \"json\"\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("\t// 객체\r\n");
      out.write("\t$(\"#objBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\"url\" : \"");
      out.print(request.getContextPath());
      out.write("/JSONServlet.do\",\r\n");
      out.write("\t\t\t\"type\" : \"post\",\r\n");
      out.write("\t\t\t\"data\" : \"choice=obj\",\r\n");
      out.write("\t\t\t\"success\" : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#result\").empty();\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"ID : \" + data.id + \"<br>\");\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"NAME : \" + data.name + \"<br>\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"<hr color='red'>\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"dataType\" : \"json\"\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("\t// 리스트\r\n");
      out.write("\t$(\"#listBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\"url\" : \"");
      out.print(request.getContextPath());
      out.write("/JSONServlet.do\",\r\n");
      out.write("\t\t\t\"type\" : \"post\",\r\n");
      out.write("\t\t\t\"data\" : \"choice=list\",\r\n");
      out.write("\t\t\t\"success\" : function(data) {\r\n");
      out.write("\t\t\t\t// [{\"id\":100,\"name\":\"강감찬\"},{\"id\":200,\"name\":\"이순신\"},{\"id\":300,\"name\":\"일지매\"}]\r\n");
      out.write("\t\t\t\t$(\"#result\").empty();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.each(data, function(i,v) {\r\n");
      out.write("\t\t\t\t\t$(\"#result\").append(\"ID : \" + v.id + \"<br>\");\r\n");
      out.write("\t\t\t\t\t$(\"#result\").append(\"NAME : \" + v.name + \"<hr>\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"<hr color='red'>\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"dataType\" : \"json\"\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("\t// Map객체\r\n");
      out.write("\t$(\"#mapBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\"url\" : \"");
      out.print(request.getContextPath());
      out.write("/JSONServlet.do\",\r\n");
      out.write("\t\t\t\"type\" : \"post\",\r\n");
      out.write("\t\t\t\"data\" : \"choice=map\",\r\n");
      out.write("\t\t\t\"success\" : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#result\").empty();\r\n");
      out.write("\t\t\t\t/*\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"name : \" + data.name + \"<br>\");\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"tel : \" + data.tel + \"<br>\");\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"addr : \" + data.addr + \"<br>\");\r\n");
      out.write("\t\t\t\t*/\r\n");
      out.write("\t\t\t\t$.each(data, function(key, value) {\r\n");
      out.write("\t\t\t\t\t$(\"#result\").append(key + \" : \" + value + \"<br>\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t$(\"#result\").append(\"<hr color='red'>\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"dataType\" : \"json\"\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"\">\r\n");
      out.write("\t<input type=\"button\" id=\"strBtn\" value=\"문자열\">\r\n");
      out.write("\t<input type=\"button\" id=\"arrayBtn\" value=\"배 열\">\r\n");
      out.write("\t<input type=\"button\" id=\"objBtn\" value=\"객 체\">\r\n");
      out.write("\t<input type=\"button\" id=\"listBtn\" value=\"리스트\">\r\n");
      out.write("\t<input type=\"button\" id=\"mapBtn\" value=\"Map객체\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("<div id=\"result\"></div>\r\n");
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
