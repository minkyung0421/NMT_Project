/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-09-06 04:55:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.inside;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inside_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Inside Out</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"inside.css\">\r\n");
      out.write("<style>\r\n");
      out.write("          table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-top: 1px solid #444444;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("  }\r\n");
      out.write("  th, td {\r\n");
      out.write("    border-bottom: 1px solid #444444;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(" a.jcm-top {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    right: 15px;\r\n");
      out.write("    bottom: 15px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 45px;\r\n");
      out.write("    height: 45px;\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    z-index: 999;\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"#\" class=\"jcm-top hidden-xs hidden-sm\"><img src = \"../christmas_img/goto.png\" width=\"50px\" height=\"50px\"></a>\r\n");
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
      out.write(" <section class = \"section_menu\">\r\n");
      out.write("                <a href = \"../list.jsp\">  <button>자유게시판</button></a>\r\n");
      out.write("               <article class = \"menu\">\r\n");
      out.write("                <a href = \"../index.jsp\"><p class = \"index\">Index</p></a>\r\n");
      out.write("                            <ul class = \"mylist\">\r\n");
      out.write("                                <li class = \"snow_link\"><a href = \"../snow/snow_1.jsp\" style = \"color:black\"><label>Snow White</label></a></li>\r\n");
      out.write("                                <li class = \"mermaid_link\"><a href = \"../mermaid/mermaid_1.jsp\" style = \"color:black\"><label>The Little Mermaid</label></a></li>\r\n");
      out.write("                                <li class = \"christmas_link\"><a href = \"../christmas/christmas_1.jsp\" style = \"color:black\"><label>The Nightmare before Christmas</label></a></li>\r\n");
      out.write("                                <li class = \"rata_link\"><a href = \"../rata/rata_1.jsp\" style = \"color:black\"><label>Ratatouille</label></a></li>\r\n");
      out.write("                                <li class = \"inside_link\"><a href = \"../inside/inside_1.jsp\" style = \"color:black\"><label>Inside Out</label></a></li>\r\n");
      out.write("                                <li class = \"moana_link\"><a href = \"../moana/moana_1.jsp\" style = \"color:black\"><label>Moana</label></a></li>\r\n");
      out.write("                                <li class = \"koko_link\"><a href = \"../koko/koko_1.jsp\" style = \"color:black\"><label>Coco</label></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </article>\r\n");
      out.write("        \r\n");
      out.write("               \r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section class = \"section_content\">\r\n");
      out.write("               <article>\r\n");
      out.write("                    <table border=\"0\" width = \"90%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style = \"text-align: center;\">\r\n");
      out.write("                                <h1>명대사</h1>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                \"잘못된 일만 신경 쓰진 마. 되돌릴 방법은 항상 있어!\" <br>We can't focus on what's going wrong. There's always a way to turn things around!<br><br>\r\n");
      out.write("                                \"고마워 기쁨아, 하지만 내가 모든 걸 다 무서워하는 게 아니라는 건 알아둬야 할 것 같아.\"<br>\r\n");
      out.write("                                Thank you, Joy. But I'll have you know I'm not scared of everything.<br><br>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style = \"padding:3%;\">\r\n");
      out.write("                                    <label style = \"text-align: center\"><h1>줄거리</h1></label>\r\n");
      out.write("                                    <img src = \"../inside_img/II.jpg\" width=\"40%\" height=\"45%\" align=\"left\" style = \"margin-right: 2%;\">\r\n");
      out.write("                                    모든 사람들 머릿속에 존재하는 감정 컨트롤 본부. 그리고 그곳에서 열심히 일하는 기쁨, 슬픔, 버럭, 까칠, 소심 다섯 감정들. \r\n");
      out.write("                                    이사 후 새로운 환경에 적응하려는 11살 소녀 ‘라일리’를 위해 그녀의 감정들은 그 어느 때 보다 바쁘게 감정의 신호를 보내지만, \r\n");
      out.write("                                    우연한 실수로 ‘기쁨’과 ‘슬픔’이 본부를 이탈하게 되고 '라일리’의 마음 속에 큰 변화가 찾아온다.\r\n");
      out.write("                                   '라일리'가 예전의 모습을 되찾기 위해서는 ‘기쁨’과 ‘슬픔’이 본부로 돌아가야만 한다! \r\n");
      out.write("                                   그러나 엄청난 기억들이 저장되어 있는 머릿속 세계에서 본부까지 가는 길은 험난하기만 하다. 과연, ‘라일리’는 다시 행복해질 수 있을까?\r\n");
      out.write("                                    지금 당신의 머릿속에서 벌어지는 놀라운 일! 하루에도 몇번씩 변하는 감정의 비밀이 밝혀진다!\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <!-- http://extmovie.maxmovie.com/xe/movietalk/7697601 -->\r\n");
      out.write("                        <td style = \"text-align: center; padding:3%\">\r\n");
      out.write("                            <h1>이스터에그</h1>\r\n");
      out.write("                            혹시 이 장면을 보신 적이 있나요?<br><br>\r\n");
      out.write("                            <img src = \"../inside_img/inin.jpg\"><br><br>\r\n");
      out.write("                            그럼 이 장면은요?<br>\r\n");
      out.write("                            <img src = \"../inside_img/ins.jpg\" ><br><br>\r\n");
      out.write("                            라일리가 가족들과 식사를 하고 있는 장면과 몬스터 주식회사의 한 장면입니다. 무언가 같은 것이\r\n");
      out.write("                            보이지 않나요? 라일리가 먹고 있는 중국 배달 음식 상자는 몬스터 주식회사에서도 나왔던 상자입니다!\r\n");
      out.write("                            인사이드 아웃 뿐만이 아니라 <br>토이 스토리2, 라따뚜이, 벅스라이프에서도 상자가 등장합니다!\r\n");
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </table>\r\n");
      out.write("               </article>\r\n");
      out.write("            </section>\r\n");
      out.write("            \r\n");
      out.write("            <footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>\r\n");
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
