<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%

    Class.forName("com.mysql.jdbc.Driver");

    String url = "jdbc:mysql://localhost:3306/blog?useUnicode=true&amp;characterEncoding=UTF-8";

    String mysql_id = "root";

    String mysql_pw = "1234";



    int num = Integer.parseInt(request.getParameter("board_no"));



    try{

      Connection conn = DriverManager.getConnection(url, mysql_id, mysql_pw);

      Statement stmt = conn.createStatement();



      String sql = "select board_title, board_content from board where board_no="+num;  

      ResultSet rs = stmt.executeQuery(sql);

      if(rs.next()){

        String board_title = rs.getString(1);

        String board_content = rs.getString(2);

  %>

  <table class="body">

  <form id="updateFrm" action="updateProc.jsp" method="post">

    <tr>

      <th style="height:40px;">글제목</th>

      <td><input type="text" name="board_title" id="board_title" value="<%=board_title%>"></td>

    </tr>

    <tr>

      <th style="height:200px;">글내용</th>

      <td><textarea name="board_content" id="board_content"><%=board_content%></textarea></td>

    </tr>

  </table>

  <input type="hidden" id="board_no" name="board_no" value="<%=num%>">

  <form>

  <%

      rs.close();

      stmt.close();

      conn.close();

      }

    }catch(SQLException e){

      out.println(e.toString());

    }

  %>



  <div class="btnDiv">

    <input type="button" id="update" value="수정완료">

  </div>
</body>
</html>