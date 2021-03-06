<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board</title>
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

      #board_title{width:730px; height:30px;}

      #board_content{width:730px; height:300px;}

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
<form name="insertFrm" id="insertFrm" action="insert.jsp">
<center>
    <table class="type04">
	 <tr>
        <th scope="row">글제목</th>
        <td><input type="text" id="board_title" name="board_title"></td>
    </tr>
    <tr>
        <th scope="row">닉네임</th>
        <td><input type="text" id="nicname" name="nicname"></td>
    </tr>
    <tr>
        <th scope="row">글내용</th>
        <td><textarea id="board_content" name="board_content"></textarea></td>
    </tr>
    </table>
</center>
  </form>

  <div class="Btn">

    <center><input type="button" value="작성완료" class = "button" id="insert" OnClick="javascript:Insert();"></center>
    
  </div>
</body>
<script>
	function Insert(){
		var insertFrm = document.insertFrm;
		if(!insertFrm.board_title.value){
			alert("글제목을 작성해주세요;)");
			insertFrm.board_title.focus();
			return;
		}
		
		if(!insertFrm.board_content.value){
			alert("내용을 적어주세요;)");
			insertFrm.board_content.focus();
			return;
		}
		
		insertFrm.submit();
	}
</script>
</html>