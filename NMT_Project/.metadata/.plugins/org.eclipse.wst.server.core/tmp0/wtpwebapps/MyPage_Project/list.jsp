<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
<style>

	table.type04 {
    border-collapse: separate;
    border-spacing: 1px;
    text-align: left;
    line-height: 1.5;
    border-top: 1px solid #ccc;
    margin-top:4%;
  	
}
table.type04 th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
}
table.type04 td {
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
}


     

      .Btn{margin:30px auto 0; width:100px;}
      
      button{
        background:crimson;
        color:#fff;
        border:none;
        position:relative;
        height:30px;
        font-size:0.7em;
        padding:0 2em;
        cursor:pointer;
        transition:800ms ease all;
        outline:none;
      }
      button:hover{
        background:#fff;
        color:crimson;
      }
      button:before,button:after{
        content:'';
        position:absolute;
        top:0;
        right:0;
        height:2px;
        width:0;
        background: crimson;
        transition:400ms ease all;
      }
      button:after{
        right:inherit;
        top:inherit;
        left:0;
        bottom:0;
      }
      button:hover:before,button:hover:after{
        width:100%;
        transition:800ms ease all;
      }


      
</style>
</head>
<body>
<center><h1 style = "margin-top:3%">자유롭게 이야기를 남겨보세요! :)</h1>
        <a href = "index.jsp"><button>돌아가기</button></a></center>
        
<%--         <center>
		<table class="type04">
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성일자</th>
			<tr>
			<%
			if(total==0){
			%>
			<tr>
				<td>게시글이 존재하지 않습니다.</td>
			</tr>
			<%
			//total이 0이 아닐때
			}else{
				while(rs.next()){
					int board_no = rs.getInt(1);
					String board_title = rs.getString(2);
					String board_date = rs.getString(3);
					
					//리스트 출력
			%>
			<tr>
				<th scope="row"><%=board_no %></th>
        		<td><a href="Detail.jsp?board_no=<%=board_no%>"><%= board_title %></a></td>
				<td><%= board_date %></td>
			</tr>
			<%		
				}
			}
			</table>
</center> --%>
<center>
<table class="type04">
<tr>
		<th>글제목</th>
<tr>
<%
	String dirPath = application.getRealPath("/WEB-INF/board");

	File dir = new File(dirPath);
	String filenames[] = dir.list();
	
	for(String filename : filenames){
		String filename2 = filename.replace(".txt", "");
%>		
		<tr>
        	<td><a href="Detail.jsp?FILE_NAME=<%=filename%>"><%= filename2 %></a></td>
		</tr>
		
	<%}
	
%>
</table>
</center>
<center><a href = "Write.jsp"><button style = "margin-top:3%;">글쓰기</button></a></center>
</body>
</html>