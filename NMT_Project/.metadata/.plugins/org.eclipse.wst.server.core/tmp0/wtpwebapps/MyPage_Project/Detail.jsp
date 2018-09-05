<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
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
  margin : 20px 10px;
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
        <a href = "list.jsp"><button>목록으로</button></a></center>

<center>        
<%
	String filename = request.getParameter("FILE_NAME");
	BufferedReader reader = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/board/" + filename);
		
		reader = new BufferedReader(new FileReader(filePath));
		
		while(true){
			String str = reader.readLine();
			if(str == null) break;
			out.println(str + "<br>");
		}
	}catch(Exception e){
		out.println("파일을 읽을 수 없습니다.");
	}
%>
</center>
</body>
</html>