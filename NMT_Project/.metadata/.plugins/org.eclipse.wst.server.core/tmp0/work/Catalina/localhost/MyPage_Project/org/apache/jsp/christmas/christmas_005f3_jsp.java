/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-09-06 04:53:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.christmas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class christmas_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>The Nightmare before Christmas</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"christmas.css\">\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tborder-top: 1px solid #444444;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("\tborder-bottom: 1px solid #444444;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.jcm-top {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tright: 15px;\r\n");
      out.write("\tbottom: 15px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 45px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tfont-size: 40px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tz-index: 999;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<a href=\"#\" class=\"jcm-top hidden-xs hidden-sm\"><img\r\n");
      out.write("\t\tsrc=\"../christmas_img/goto.png\" width=\"50px\" height=\"50px\"></a>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$( document ).ready( function() {\r\n");
      out.write("$( window ).scroll( function() {\r\n");
      out.write("if ( $( this ).scrollTop() > 200 ) {\r\n");
      out.write("$( '.jcm-top' ).fadeIn();\r\n");
      out.write("} else {\r\n");
      out.write("$( '.jcm-top' ).fadeOut();\r\n");
      out.write("}\r\n");
      out.write("} );\r\n");
      out.write("$( '.jcm-top' ).click( function() {\r\n");
      out.write("$( 'html, body' ).animate( { scrollTop : 0 }, 400 );\r\n");
      out.write("return false;\r\n");
      out.write("} );\r\n");
      out.write("} );\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<section class=\"section_menu\"> <a href=\"../list.jsp\">\r\n");
      out.write("\t\t<button>자유게시판</button>\r\n");
      out.write("\t</a> <article class=\"menu\"> <a href=\"../index.jsp\"><p\r\n");
      out.write("\t\t\tclass=\"index\">Index</p></a>\r\n");
      out.write("\t<ul class=\"mylist\">\r\n");
      out.write("\t\t<li class=\"snow_link\"><a href=\"../snow/snow_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>Snow White</label></a></li>\r\n");
      out.write("\t\t<li class=\"mermaid_link\"><a href=\"../mermaid/mermaid_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>The Little Mermaid</label></a></li>\r\n");
      out.write("\t\t<li class=\"christmas_link\"><a href=\"../christmas/christmas_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>The Nightmare before\r\n");
      out.write("\t\t\t\t\tChristmas</label></a></li>\r\n");
      out.write("\t\t<li class=\"rata_link\"><a href=\"../rata/rata_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>Ratatouille</label></a></li>\r\n");
      out.write("\t\t<li class=\"inside_link\"><a href=\"../inside/inside_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>Inside Out</label></a></li>\r\n");
      out.write("\t\t<li class=\"moana_link\"><a href=\"../moana/moana_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>Moana</label></a></li>\r\n");
      out.write("\t\t<li class=\"koko_link\"><a href=\"../koko/koko_1.jsp\"\r\n");
      out.write("\t\t\tstyle=\"color: black\"><label>Coco</label></a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</article> </section>\r\n");
      out.write("\r\n");
      out.write("\t<section class=\"section_content\"> <article>\r\n");
      out.write("\t<table border=\"0\" width=\"90%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t<!-- http://moviequote.tistory.com/15 -->\r\n");
      out.write("\t\t\t\t<h1>명대사</h1> <br> \"볼 수 없다고 해서 안 믿는건 아니야\" <br>Just because\r\n");
      out.write("\t\t\t\tI can not see it doesn't mean I can't believe it. <br>\r\n");
      out.write("\t\t\t<br> \"나는 크리스마스가 정말 싫어!\"<br> I really hate Christmas! <br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"padding: 3%;\"><label style=\"text-align: center\"><h1>줄거리</h1></label>\r\n");
      out.write("\t\t\t\t<img src=\"../christmas_img/ccc.jpg\" width=\"50%\" height=\"90%\"\r\n");
      out.write("\t\t\t\talign=\"left\" style=\"margin-right: 2%;\"> 할로윈 마을에는 갖가지 귀신들이 모여\r\n");
      out.write("\t\t\t\t사는데, 그 중 호박의 왕이라 불리는 잭은 해골 귀신이다. 잭는 마을 사람들의 우상이었고, 모두들 잭을 좋아했다. 하지만\r\n");
      out.write("\t\t\t\t잭은 반복되는 일상에 지쳐있었다. 어느날 숲을 지나 크리스마스타운에 간 잭은 기쁨에 가득차 크리스마스를 준비하는 사람들을\r\n");
      out.write("\t\t\t\t발견한다. 이를 본 잭은 산타를 납치해 크리스마스의 주인이 될 계획을 세운다. 잭은 수염과 붉은 옷을 입고 세마리의 순록이\r\n");
      out.write("\t\t\t\t이끄는 스키를 타고 내려와 할로윈 주민들을 풀어 마을을 공포 분위기로 만든다. 쭈그러진 머리나 트리를 게걸스럽게 먹는 뱀\r\n");
      out.write("\t\t\t\t등등 일대 소동이 벌어진다. 산타가 할로윈의 악마 '부기 우기'에 의해 먹히려는 순간 잭은 마음을 바꾸는데.....</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<!-- https://youtu.be/rJqNV5sZxBo. -->\r\n");
      out.write("\t\t\t<td style=\"padding: 3%; text-align: center\"><label><h1>게임으로\r\n");
      out.write("\t\t\t\t\t\t만든 크리스마스의 악몽</h1></label> <a href=\"../christmas_img/마인크래프트로 만든 크리스마스의 악몽.mp4\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../christmas_img/jj.jpg\" width=\"60%\" height=\"120%\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 2%\">\r\n");
      out.write("\t\t\t</a> <br>\r\n");
      out.write("\t\t\t<br> 마인크래프트란? <br> 모든 것이 네모난 블록으로 만들어진 세계에서 몬스터들을 피해 집을 짓고\r\n");
      out.write("\t\t\t\t도구를 만들며 채광을 하거나 농사를 지어 생존하는 간단한 구성을 가지고 있다. 블록들을 쌓아 유저가 원하는 형태를 쉽게\r\n");
      out.write("\t\t\t\t만들 수 있어 게임 지형의 변화나 건축을 유저가 하고자 하는대로 얼마든지 할 수 있다.</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</article> <a href=\"christmas_4.jsp\"><article class=\"next_page\">\r\n");
      out.write("\t\t<label style=\"font-weight: 800\">OST</label>\r\n");
      out.write("\t\t<img src=\"../snow_img/nn.png\"></article></a> </section>\r\n");
      out.write("\r\n");
      out.write("\t<footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>\r\n");
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
