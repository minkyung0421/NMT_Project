/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-09-06 04:55:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.rata;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rata_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Ratatouille</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"rata.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("          table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-top: 1px solid #444444;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("  }\r\n");
      out.write("  th, td {\r\n");
      out.write("    border-bottom: 1px solid #444444;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("  }\r\n");
      out.write("         a.jcm-top {\r\n");
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
      out.write("        <section class = \"section_menu\">\r\n");
      out.write("                <a href = \"../list.jsp\"> <button>자유게시판</button></a>\r\n");
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
      out.write("                                \"누구나 요리할 수 있다.\" <br>Anyone can cook<br><br>\r\n");
      out.write("                                \"모두가 위대한 예술가가 되는 건 아니지만 위대한 예술가는 어디에서든 나올 수 있다.\"<br>\r\n");
      out.write("                                Not everyone can become a great artist; but a great artist can come from anywhere<br><br>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style = \"padding:3%;\">\r\n");
      out.write("                                    <label style = \"text-align: center\"><h1>줄거리</h1></label>\r\n");
      out.write("                                    <img src = \"../rata_img/img1.jpg\" width=\"40%\" height=\"50%\" align=\"left\" style = \"margin-right: 2%;\">\r\n");
      out.write("                                    절대미각, 빠른 손놀림, 끓어 넘치는 열정의 소유자 ‘레미’. 프랑스 최고의 요리사를 꿈꾸는 그에게\r\n");
      out.write("\r\n");
      out.write("                                    단 한가지 약점이 있었으니, 바로 주방 퇴치대상 1호인 ‘생쥐’라는 것! <br>그러던 어느 날, 하수구에서\r\n");
      out.write("                                    \r\n");
      out.write("                                    길을 잃은 레미는 운명처럼 파리의 별 다섯개짜리 최고급 레스토랑에 떨어진다. 그러나 생쥐의\r\n");
      out.write("                                    \r\n");
      out.write("                                    신분으로 주방이란 그저 그림의 떡. 보글거리는 수프, 둑닥둑닥 도마소리, 향긋한 허브 내음에 식욕\r\n");
      out.write("                                    \r\n");
      out.write("                                    이 아닌 ‘요리욕’이 북받친 레미의 작은 심장은 콩닥콩닥 뛰기 시작하는데!<br>\r\n");
      out.write("\r\n");
      out.write("                                    깜깜한 어둠 속에서 요리에 열중하다 재능 없는 견습생 ‘링귀니’에게 ‘딱’ 걸리고 만다. 하지만 해\r\n");
      out.write("                                    \r\n");
      out.write("                                    고위기에 처해있던 링귀니는 레미의 재능을 한눈에 알아보고 의기투합을 제안하는데. 과연 궁지에\r\n");
      out.write("                                    \r\n");
      out.write("                                    몰린 둘은 환상적인 요리 실력을 발휘할 수 있을 것인가? 레니와 링귀니의 좌충우돌 공생공사 프로\r\n");
      out.write("                                    \r\n");
      out.write("                                    젝트가 아름다운 파리를 배경으로 이제 곧 펼쳐진다!     \r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <td style = \"text-align: center; padding:3%\">\r\n");
      out.write("                            <h1>이스터에그</h1>\r\n");
      out.write("                            혹시 이 장면을 보신 적이 있나요?<br><br>\r\n");
      out.write("                            <img src = \"../rata_img/egg.jpg\"><br><br>\r\n");
      out.write("                            그럼 이 캐릭터는요?<br>\r\n");
      out.write("                            <img src = \"../rata_img/up.png\" ><br>\r\n");
      out.write("                            이 장면은 레미가 링귀니를 만나기 전에 파리 이곳 저곳을 돌아다니다 우연히 들어갔던 집에서 마주친 그림자인데,\r\n");
      out.write("                            작품 내에서도 1초 내외로 가볍게 처리되는 별다른 비중이 없는 장면입니다.\r\n");
      out.write("                            그 밑의 사진은 디즈니의 또 다른 영화 'UP'에서 나오는 강아지 '더그'입니다.\r\n");
      out.write("                            아무도 주목하지 않았던 이 장면에 대해 팬들이 다시금 주목하게 된 이유는 라따뚜이 블루레이판에 있습니다.\r\n");
      out.write("                            블루레이판에 유일하게 수록된 브레드 버드(Brad Bird) 감독의 인터뷰 내용을 보면\r\n");
      out.write("                            아래와 같은 말이 나옵니다.<br>\r\n");
      out.write("                            \"저 그림자는 사실 라따뚜이 이후 영화에 나올 캐릭터 입니다. 저 그림자는 월-E 영화 이후에 출연합니다.\"<br><br>\r\n");
      out.write("                            즉 이 그림자의 주인공이 월-E 다음 작품에 등장하는 주인공이 될 것이라는데, 2010년까지 릴리즈된 픽사의 차기작중에\r\n");
      out.write("                            강아지가 등장하는 작품은 'UP'이 유일합니다. 그렇다면 저 그림자는 영화 'UP'에 나오는 더그가 될 것입니다.<br>\r\n");
      out.write("                            영화 라따뚜이에서는 이러한 이스터에그가 숨겨져 있었습니다.\r\n");
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
