<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ratatouille</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="rata.css">
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
                                "누구나 요리할 수 있다." <br>Anyone can cook<br><br>
                                "모두가 위대한 예술가가 되는 건 아니지만 위대한 예술가는 어디에서든 나올 수 있다."<br>
                                Not everyone can become a great artist; but a great artist can come from anywhere<br><br>
                            </td>
                        </tr>
                        <tr>
                            <td style = "padding:3%;">
                                    <label style = "text-align: center"><h1>줄거리</h1></label>
                                    <img src = "../rata_img/img1.jpg" width="40%" height="50%" align="left" style = "margin-right: 2%;">
                                    절대미각, 빠른 손놀림, 끓어 넘치는 열정의 소유자 ‘레미’. 프랑스 최고의 요리사를 꿈꾸는 그에게

                                    단 한가지 약점이 있었으니, 바로 주방 퇴치대상 1호인 ‘생쥐’라는 것! <br>그러던 어느 날, 하수구에서
                                    
                                    길을 잃은 레미는 운명처럼 파리의 별 다섯개짜리 최고급 레스토랑에 떨어진다. 그러나 생쥐의
                                    
                                    신분으로 주방이란 그저 그림의 떡. 보글거리는 수프, 둑닥둑닥 도마소리, 향긋한 허브 내음에 식욕
                                    
                                    이 아닌 ‘요리욕’이 북받친 레미의 작은 심장은 콩닥콩닥 뛰기 시작하는데!<br>

                                    깜깜한 어둠 속에서 요리에 열중하다 재능 없는 견습생 ‘링귀니’에게 ‘딱’ 걸리고 만다. 하지만 해
                                    
                                    고위기에 처해있던 링귀니는 레미의 재능을 한눈에 알아보고 의기투합을 제안하는데. 과연 궁지에
                                    
                                    몰린 둘은 환상적인 요리 실력을 발휘할 수 있을 것인가? 레니와 링귀니의 좌충우돌 공생공사 프로
                                    
                                    젝트가 아름다운 파리를 배경으로 이제 곧 펼쳐진다!     
                            </td>
                        </tr>
                        <td style = "text-align: center; padding:3%">
                            <h1>이스터에그</h1>
                            혹시 이 장면을 보신 적이 있나요?<br><br>
                            <img src = "../rata_img/egg.jpg"><br><br>
                            그럼 이 캐릭터는요?<br>
                            <img src = "../rata_img/up.png" ><br>
                            이 장면은 레미가 링귀니를 만나기 전에 파리 이곳 저곳을 돌아다니다 우연히 들어갔던 집에서 마주친 그림자인데,
                            작품 내에서도 1초 내외로 가볍게 처리되는 별다른 비중이 없는 장면입니다.
                            그 밑의 사진은 디즈니의 또 다른 영화 'UP'에서 나오는 강아지 '더그'입니다.
                            아무도 주목하지 않았던 이 장면에 대해 팬들이 다시금 주목하게 된 이유는 라따뚜이 블루레이판에 있습니다.
                            블루레이판에 유일하게 수록된 브레드 버드(Brad Bird) 감독의 인터뷰 내용을 보면
                            아래와 같은 말이 나옵니다.<br>
                            "저 그림자는 사실 라따뚜이 이후 영화에 나올 캐릭터 입니다. 저 그림자는 월-E 영화 이후에 출연합니다."<br><br>
                            즉 이 그림자의 주인공이 월-E 다음 작품에 등장하는 주인공이 될 것이라는데, 2010년까지 릴리즈된 픽사의 차기작중에
                            강아지가 등장하는 작품은 'UP'이 유일합니다. 그렇다면 저 그림자는 영화 'UP'에 나오는 더그가 될 것입니다.<br>
                            영화 라따뚜이에서는 이러한 이스터에그가 숨겨져 있었습니다.

                        </td>
                    </table>
               </article>
            </section>
            
            <footer>Copyright&copy;2018 3517 최민경 All rights reserved. </footer>
</body>
</html>