/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-09-06 04:49:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.snow;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class snow_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"snow.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <section class=\"section_menu\">\r\n");
      out.write("            <a href = \"../list.jsp\"> <button>자유게시판</button></a>\r\n");
      out.write("        <article class=\"menu\">\r\n");
      out.write("            <a href = \"../index.jsp\"><p class=\"index\">Index</p></a>\r\n");
      out.write("            <ul class=\"mylist\">\r\n");
      out.write("                <li class = \"snow_link\"><a href = \"../snow/snow_1.jsp\" style=\"color:black\">\r\n");
      out.write("                        <label>Snow White</label>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class = \"mermaid_link\">\r\n");
      out.write("                    <a href=\"../mermaid/mermaid_1.jsp\" style=\"color:black\">\r\n");
      out.write("                        <label>The Little Mermaid</label>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class = \"christmas_link\"><a href = \"../christmas/christmas_1.jsp\" style = \"color:black\"><label>The Nightmare before Christmas</label></a></li>\r\n");
      out.write("                <li class=\"rata_link\">\r\n");
      out.write("                    <a href=\"../rata/rata_1.jsp\" style=\"color:black\">\r\n");
      out.write("                        <label>Ratatouille</label>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class = \"inside_link\">\r\n");
      out.write("                    <a href=\"../inside/inside_1.jsp\" style=\"color:black\">\r\n");
      out.write("                        <label>Inside Out</label>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class = \"moana_link\">\r\n");
      out.write("                    <a href=\"../moana/moana_1.jsp\" style=\"color:black\">\r\n");
      out.write("                        <label>Moana</label>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class = \"koko_link\"><a href = \"../koko/koko_1.jsp\" style = \"color:black\"><label>Coco</label></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </article>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class = \"section_content\">\r\n");
      out.write("        <article>\r\n");
      out.write("            <img src = \"../snow_img/snoww.jpg\" width=\"15%\" height=\"25%\" align=\"left\" style = \"margin-right: 2%; margin-bottom: 3%\">\r\n");
      out.write("            <label style = \"font-size:20pt;\">백설공주(SNOW WHITE)</label><br><br>\r\n");
      out.write("            순진하고 사랑을 꿈꾸는 해맑은 소녀, 계모 밑에서 자라 청소, 설거지, 요리 등 기본적인 집안일은 전부 할 수 있으며, 후에 계모에게 죽임을 \r\n");
      out.write("            당할 뻔 하지만 살아서 일곱난쟁이와 살게 된다.\r\n");
      out.write("            사람 말을 못하는 동물들과 금새 친해지고 자기 편으로 만드는 친화력을 가지고 있다. 또한 의외로 약간\r\n");
      out.write("            짖궃은 유머감각도 있는 듯 한데 이는 난쟁이 중 심술이를 처음 만났을 때 심술내는 흉내를 내며\r\n");
      out.write("            \"오호~ 이러는 당신은 바로 심술이겠군요\"하고 놀리는 장면이 있다.\r\n");
      out.write("        </article>\r\n");
      out.write("        <article style = \"float: left\">\r\n");
      out.write("            <a href = \"snow_3.jsp\"><article style=\"float: right; margin-top:10%; margin-left: 4%\"> <label style=\"font-weight: 800\">STORY</label><img src = \"../snow_img/nn.png\"></article></a>\r\n");
      out.write("            <img src = \"../snow_img/seven.jpg\" width=\"30%\" height=\"20%\" align=\"right\"  style = \"margin-left: 3%; margin-bottom: 3%\">\r\n");
      out.write("            <label style = \"float: right; font-size:20pt;\">일곱난쟁이(SEVEN DWARFS)</label><br><br>\r\n");
      out.write("            숲속에 살고 있는 일곱 명의 난쟁이들로, 키가 작으며, 멍청이를 제외하면 희끗한 수염을 기른 노인에 가까운 모습을 하고 있지만 심성은 순수해서 마치 어린 아이같다. \r\n");
      out.write("            손재주가 매우 뛰어나서 광산에서 보석을 캐며 산다. 난쟁이들은 박사, 심술, 행복, 졸음, 부끄럼, 재채기, 멍청이가 있다.\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("        </article>\r\n");
      out.write("        <article>\r\n");
      out.write("            <img src = \"../snow_img/witch.png\" width=\"15%\" height=\"25%\" align=\"left\" style = \"margin-right: 2%;\">\r\n");
      out.write("            <br><br><br><br><br>\r\n");
      out.write("            <label style = \"font-size:20pt;\">그림하일드(GRIMHILDE)</label><br><br>\r\n");
      out.write("            새로 맞이한 왕비는 아름다웠으나 허영심이 많았다. 특히, 욕심이 많은 마녀였다.\r\n");
      out.write("            왕비는 마법 거울을 갖고 있었는데 이런 저런 질문을 하면 그에 맞는 대답을 하였다.\r\n");
      out.write("            자신이 무조건 가장 아름다워야 하며, 자신보다 아름다운 것이 있으면 그 아름다운 것을\r\n");
      out.write("            없애기까지 한다. 결국 그녀는 가장 아름다운 백설공주를 죽이기로 마음먹고, 독사과를 만들어 한 입만 베어먹어도 잠든 듯이 죽는 무서운 약을 만들었다.\r\n");
      out.write("            순진한 백설공주는 결국 사과를 베어먹고 저주에 걸려 쓰러지게 된다.\r\n");
      out.write("        </article>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <section>\r\n");
      out.write("           \r\n");
      out.write("    </section>\r\n");
      out.write("    <footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>\r\n");
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