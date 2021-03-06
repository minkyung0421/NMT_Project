<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Snow White</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="snow.css">
    <style>
     table {
    width: 100%;
    border-top: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border-bottom: 1px solid #444444;
    padding: 10px;
  }
 a.jcm-top {
    position: fixed;
    right: 15px;
    bottom: 15px;
    border-radius: 5px;
    color: #ffffff;
    text-align: center;
    width: 45px;
    height: 45px;
    font-size: 40px;
    background-color:white;
    z-index: 999;
    display: none;
}
    </style>
</head>
<body>
<a href="#" class="jcm-top hidden-xs hidden-sm"><img src = "../christmas_img/goto.png" width="50px" height="50px"></a>
<script>

$( document ).ready( function() {
$( window ).scroll( function() {
if ( $( this ).scrollTop() > 200 ) {
$( '.jcm-top' ).fadeIn();
} else {
$( '.jcm-top' ).fadeOut();
}
} );
$( '.jcm-top' ).click( function() {
$( 'html, body' ).animate( { scrollTop : 0 }, 400 );
return false;
} );
} );

</script>
 <section class = "section_menu">
                <a href = "../list.jsp"> <button>자유게시판</button></a>
               <article class = "menu">
                <a href = "../index.jsp"> <p class = "index">Index</p></a>
                            <ul class = "mylist">
                                <li class = "snow_link"><a href = "../snow/snow_1.jsp" style = "color:black"><label>Snow White</label></a></li>
                                <li class = "mermaid_link"><a href = "../mermaid/mermaid_1.jsp" style = "color:black"><label>The Little Mermaid</label></a></li>
                                <li class = "christmas_link"><a href = "../christmas/christmas_1.jsp" style = "color:black"><label>The Nightmare before Christmas</label></a></li>
                                <li class = "rata_link"><a href = "../rata/rata_1.jsp" style = "color:black"><label>Ratatouille</label></a></li>
                                <li class = "inside_link"><a href = "../inside/inside_1.jsp" style = "color:black"><label>Inside Out</label></a></li>
                                <li class = "moana_link"><a href = "../moana/moana_1.jsp" style = "color:black"><label>Moana</label></a></li>
                                <li class = "koko_link"><a href = "../koko/koko_1.jsp" style = "color:black"><label>Coco</label></a></li>
                            </ul>
                        </article>
        
               
            </section>

            <section class = "section_content">
               <article>
                    <table border="0" width = "90%">
                        <tr>
                            <td style = "text-align: center;">
                                <h1>명대사</h1>
                                <br>
                                "너무나 할 일이 많을 때, 자신을 괴롭히지 말아요. 당신의 문제거리들을 잊어버리세요." 
                                <br>When there's too much to do, don't let it bother you.Forget your troubles.<br><br>
                                "기억해, 너는 세상을 햇빛으로 가득 채울 수 있는 존재라는 걸."<br>
                                Remember you're the one who can fill the world with sunshine<br><br>
                            </td>
                        </tr>
                        <tr>
                            <td style = "padding:3%;">
                                    <label style = "text-align: center"><h1>줄거리</h1></label>  
                                    <img src = "../snow_img/snowoo.jpg" width="40%" height="50%" align="left" style = "margin-right: 2%;">
                                    백설공주의 이야기를 83분짜리 장편으로 만든 월트 디즈니사의 최초의 장편 만화 영화이자 만화 영화 사상 최초의 장편 만화 영화이다. 
                                    또한 흥행 면에서도 800만 달러의 흥행 수익을 기록하여 의 뒤를 바짝 쫓았다. 아주 먼 옛날, 큰 성에서 아름다운 여자 아이가 태어난다. 
                                    살결이 매우 하얗기 때문에 백설 공주라 불린 아이는 크면 클수록 더욱 더 예뻐졌고 마음씨도 고왔기 때문에 사람들에게 사랑을 받는다.
                                    그러나 어머니가 죽으면서부터 불행이 닥친다. 어머니를 생각하며 매일 슬퍼하는 백설공주를 위해 아버지는 새엄마를 맞이했는데, 그녀는 바로 사악한 마녀였던 것. 
                                    세상에서 백설 공주가 제일 예쁘다는 요술거울의 말에 왕비는 사냥꾼을 시켜 그녀를 죽이려 하고, 
                                    왕비의 마수를 피해 성을 빠져나온 백설 공주는 일곱 난장이들을 만난다.    
                            </td>
                        </tr>
                        <!-- https://m.blog.naver.com/PostView.nhn?blogId=jinpp01&logNo=220558788748&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F -->
                        <td style = "text-align: center; padding:3%">
                            <h1>이스터에그</h1>
                            혹시 이 사람을 아시나요?<br><br>
                            <img src = "../snow_img/eeee.jpg"><br><br>
                            그럼 이 장면은요?<br><br>
                            <img src = "../snow_img/eee.PNG" ><br><br>
                            위의 사람은 백설공주에 나오는 마녀가 변신한 모습입니다. 그 밑의 장면은 디즈니의 또 다른 영화 '마법에 걸린 사랑'이라는 영화에서
                            나온 한 장면입니다. 무언가 같은 점이 있지 않나요? 마법의 걸린 사랑이란 영화에서는 많은 디즈니 영화들을 패러디했는데요, 그 중
                            백설공주에서 백설공주가 독사과를 먹는 장면을 패러디했습니다.
                           

                        </td>
                    </table>
               </article>
               <a href = "snow_4.jsp"><article class = "next_page"><label style="font-weight: 800">OST</label><img src = "../snow_img/nn.png"></article></a>
               
            </section>
            
            <footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>
</body>
</html>