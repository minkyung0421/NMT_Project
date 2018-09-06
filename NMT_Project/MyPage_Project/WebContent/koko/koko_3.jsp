<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coco</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <link rel="stylesheet" type="text/css" href="koko.css">
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
                <a href = "../index.jsp"><p class = "index">Index</p></a>
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
                                "더 이상 숨지 않을 거야 단테!" 
                                <br>No more hiding, Dante<br><br>
                                "제가 저기 나가서 노래 한 곳을 부르지 못한다면..."<br>
                                "어떻게 스스로 음악가라고 말하겠어요?"<br>
                                If I can't sing go out there and play one song...<br>
                                how can i call myself a musician?<br><br>
                            </td>
                        </tr>
                        <tr>
                            <!-- https://blog.naver.com/PostView.nhn?blogId=cine_play&logNo=220958817529&parentCategoryNo=&categoryNo=6&viewDate=&isShowPopularPosts=false&from=postView -->
                            <td style = "padding:3%;">
                                    <label style = "text-align: center"><h1>줄거리</h1></label>  
                                    <img src = "../koko_img/gggg.jpg" width="40%" height="50%" align="left" style = "margin-right: 2%;">
                                    뮤지션을 꿈꾸는 소년 미구엘은 전설적인 가수 에르네스토의 기타에 손을 댔다 ‘죽은 자들의 세상’에 들어가게 된다.
                                    그리고 그곳에서 만난 의문의 사나이 헥터와 함께 상상조차 못했던 모험을 시작하게 되는데…
                                    과연 ‘죽은 자들의 세상’에 숨겨진 비밀은? 그리고 미구엘은 무사히 현실로 돌아올 수 있을까?
                            </td>
                        </tr>
                        <!-- http://extmovie.maxmovie.com/xe/movietalk/16739989 -->
                        <td style = "text-align: center; padding:3%">
                            <h1>이스터에그</h1>
                            혹시 이 장면을 아시나요?<br><br>
                            <img src = "../koko_img/eeeko.PNG" width="70%" height="70%"><br><br>
                            그럼 이 장면은요?<br>
                            <img src = "../koko_img/ecp.JPG" width="70%" height="70%"><br><br>
                            이제 조금 아시겠나요?<br><br>
                            초반 미구엘이 밖에 나가려고 할 때, 피자 플래닛의 트럭을 볼 수 있어요!<br>
                            피자 플래닛은 토이스토리 1 부터 시작해서, 꾸준히 개근하는 픽사 내의 브랜드입니다.
                        </td>
                    </table>
               </article>
               <a href = "koko_4.jsp"><article class = "next_page"><label style="font-weight: 800">OST</label><img src = "../snow_img/nn.png"></article></a>
            </section>
            
            <footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>
</body>
</html>