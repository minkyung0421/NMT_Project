<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String board_title = request.getParameter("board_title");
	String nicname = request.getParameter("nicname");
	String board_content = request.getParameter("board_content"); 
	Date date = new Date();
	Long time = date.getTime();
	String filename = board_title + ".txt";
	
	String result;
	
	PrintWriter writer = null;
	
	try{
		String filePath = application.getRealPath("/WEB-INF/board/" + filename);
		writer = new PrintWriter(filePath);
		writer.printf("<table class='type04'>");
		writer.printf("<tr>");
		writer.printf("<th scope='row' style='height:px;'>글제목");
		writer.printf("</th>");
		writer.printf("<td>");
		writer.printf(board_title);
		writer.printf("</td>");
		writer.printf("</tr>");
		writer.printf("<tr>");
		writer.printf("<th scope='row' style='height:40px;'>닉네임");
		writer.printf("<td>");
		writer.printf(nicname);
		writer.printf("</td>");
		writer.printf("</tr>");
		writer.printf("<tr>");
		writer.printf("<th scope='row' style='height:200px;'>글내용");
		writer.printf("<td>");
		writer.printf(board_content);
		writer.printf("</td>");
		writer.printf("</tr>");
		writer.printf("</table>");
	 
		writer.flush();
		result = "ok";
	}catch(Exception e){
		out.println("오류발생");
		result = "fail";
	}
	
	response.sendRedirect("result.jsp?send="+result);
		
       
%>
</body>
</html>