/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-09-06 04:54:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.snow;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class snow_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Snow White</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"snow.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("     table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-top: 1px solid #444444;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("  }\r\n");
      out.write("  th, td {\r\n");
      out.write("    border-bottom: 1px solid #444444;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("  }\r\n");
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
      out.write("                <a href = \"../list.jsp\"> <button>자유게시판</button></a>\r\n");
      out.write("               <article class = \"menu\">\r\n");
      out.write("                <a href = \"../index.jsp\"> <p class = \"index\">Index</p></a>\r\n");
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
      out.write("                                \"너무나 할 일이 많을 때, 자신을 괴롭히지 말아요. 당신의 문제거리들을 잊어버리세요.\" \r\n");
      out.write("                                <br>When there's too much to do, don't let it bother you.Forget your troubles.<br><br>\r\n");
      out.write("                                \"기억해, 너는 세상을 햇빛으로 가득 채울 수 있는 존재라는 걸.\"<br>\r\n");
      out.write("                                Remember you're the one who can fill the world with sunshine<br><br>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style = \"padding:3%;\">\r\n");
      out.write("                                    <label style = \"text-align: center\"><h1>줄거리</h1></label>  \r\n");
      out.write("                                    <img src = \"../snow_img/snowoo.jpg\" width=\"40%\" height=\"50%\" align=\"left\" style = \"margin-right: 2%;\">\r\n");
      out.write("                                    백설공주의 이야기를 83분짜리 장편으로 만든 월트 디즈니사의 최초의 장편 만화 영화이자 만화 영화 사상 최초의 장편 만화 영화이다. \r\n");
      out.write("                                    또한 흥행 면에서도 800만 달러의 흥행 수익을 기록하여 의 뒤를 바짝 쫓았다. 아주 먼 옛날, 큰 성에서 아름다운 여자 아이가 태어난다. \r\n");
      out.write("                                    살결이 매우 하얗기 때문에 백설 공주라 불린 아이는 크면 클수록 더욱 더 예뻐졌고 마음씨도 고왔기 때문에 사람들에게 사랑을 받는다.\r\n");
      out.write("                                    그러나 어머니가 죽으면서부터 불행이 닥친다. 어머니를 생각하며 매일 슬퍼하는 백설공주를 위해 아버지는 새엄마를 맞이했는데, 그녀는 바로 사악한 마녀였던 것. \r\n");
      out.write("                                    세상에서 백설 공주가 제일 예쁘다는 요술거울의 말에 왕비는 사냥꾼을 시켜 그녀를 죽이려 하고, \r\n");
      out.write("                                    왕비의 마수를 피해 성을 빠져나온 백설 공주는 일곱 난장이들을 만난다.    \r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- https://m.blog.naver.com/PostView.nhn?blogId=jinpp01&logNo=220558788748&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F -->\r\n");
      out.write("                        <td style = \"text-align: center; padding:3%\">\r\n");
      out.write("                            <h1>이스터에그</h1>\r\n");
      out.write("                            혹시 이 사람을 아시나요?<br><br>\r\n");
      out.write("                            <img src = \"../snow_img/eeee.jpg\"><br><br>\r\n");
      out.write("                            그럼 이 장면은요?<br><br>\r\n");
      out.write("                            <img src = \"../snow_img/eee.PNG\" ><br><br>\r\n");
      out.write("                            위의 사람은 백설공주에 나오는 마녀가 변신한 모습입니다. 그 밑의 장면은 디즈니의 또 다른 영화 '마법에 걸린 사랑'이라는 영화에서\r\n");
      out.write("                            나온 한 장면입니다. 무언가 같은 점이 있지 않나요? 마법의 걸린 사랑이란 영화에서는 많은 디즈니 영화들을 패러디했는데요, 그 중\r\n");
      out.write("                            백설공주에서 백설공주가 독사과를 먹는 장면을 패러디했습니다.\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </table>\r\n");
      out.write("               </article>\r\n");
      out.write("               <a href = \"snow_4.jsp\"><article class = \"next_page\"><label style=\"font-weight: 800\">OST</label><img src = \"../snow_img/nn.png\"></article></a>\r\n");
      out.write("               \r\n");
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
