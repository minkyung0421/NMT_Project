<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Disney</title>
</head>
<!-- top 으로 올라가는 버튼 만들기!! -->
<style>
        html, body{
            width:100%;
            height: 100%;
            padding:0;
            margin:0;
        }


     article
     {
         display: inline;
     }

     img
     {
         display: inline;
         position: relative;
     }
     
     .mermaid
     {
        margin-left:10%;
        width:15.5%;
        height:20.5%;
        padding-left: 250px;
     }

     .snowwhite{
        width:16.5%;
        height:20.5%;
     }

     .pocahontas{
        float: right;
        height:33%;
        width:21%;
        padding-right:450px;
     }

     .rata{
         height: 30%;
         width:23.3%;
         padding-left: 443px;
    } 
    
    .dd{
        height:12%;
        width:8.5%;
        float: right;
       margin-right:6px;
    }

    .frozen{
        height:150px;
        width:130px;
    }

    .inside{
        height: 17.5%;
        width: 13%;
        float: right;
        position: absolute;
        margin-top:6.4%;
        margin-left:0.3%;
    }
    
    .moana{
        position: absolute;
        height: 17.6%;
        width: 16.4%;
        margin-left:13.7%;
        margin-top:6.4%;
    }


    </style>
<body>

 <!-- https://youtu.be/4-o6y5VPXkM -->
    
    <embed src="image/Walt Disney Opening Video(월트 디즈니 오프닝 영상) (1).mp3" autostart="true" hidden="true" loop="false">
    <center>
        <header>
            <br>
            <br>
            <img src="image/desney1.png" height="150" width="350">
        </header>
        
    </center>
    <br>
    <br>

        <article>
            <a href = "mermaid/mermaid_1.jsp"><img src = "image/mermaid.png" class = "mermaid"></a>
            <a href = "snow/snow_1.jsp"><img src = "image/snowwhite1.png" class = "snowwhite"></a>
            <a href = "christmas/christmas_1.jsp"><img src = "image/chis.jpg" class = "pocahontas"></a>
        </article>

        <article>
            <a href = "rata/rata_1.jsp"><img src = "image/rata2.png" class = "rata"></a>
            <a href = "index.jsp"><img src = "image/dd.jpg" class = "dd"></a>
     </article>
     
     <article>
         <a href = "inside/inside_1.jsp"><img src = "image/Insideout.png"class = "inside"></a>
         <a href = "moana/moana_1.jsp"><img src = "image/moaaa.jpg" class = "moana"></a>
     </article>

     
            

</body>
</html>