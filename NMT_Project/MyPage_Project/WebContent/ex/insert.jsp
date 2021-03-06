<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	Class.forName("com.mysql.jdbc.Driver"); //mysql연동
	String url = "jdbc:mysql://localhost:3306/blog?useUnicode=true&amp;characterEncoding=UTF-8"; //mysql 데이터베이스명
	String mysql_id = "root"; //mysql id
	String mysql_pw = "1234"; //mysql pw
	
	String board_title = request.getParameter("board_title"); //넘어온 글제목 저장
	String board_content = request.getParameter("board_content"); //넘어온 글 내용 저장
	
	try{
		Connection conn = DriverManager.getConnection(url, mysql_id, mysql_pw); //실제 연동시도
		
		String sql = "insert into board(board_title, board_content) values(?,?)"; //insert
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, board_title);
		pstmt.setString(2, board_content);
		
		pstmt.execute();
		pstmt.close();
	}catch(SQLException e){
		out.println(e.toString());
	}
%>
</body>
<script>
	alert("게시글이 업로드되었습니다 :)");
	window.location.href="list.jsp";
</script>
</html>