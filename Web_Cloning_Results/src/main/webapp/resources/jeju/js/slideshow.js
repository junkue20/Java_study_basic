var slides = document.querySelectorAll("#slides > img");
var prev = document.getElementById("prev");
var next = document.getElementById("next");

var current = 0;

showSlides(current);        // 현재이미지 표시
prev.onclick = prevSlide;   // 이전이미지 
next.onclick = nextSlide;   // 다음이미지

function showSlides(n) {
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";  // 모든 이미지 화면에서 감춤
    }

    slides[n].style.display = "block";     // n번째 이미지만 화면에 표시
    slides[n].style.width = '1200px';
    slides[n].style.height = '350px';

}

function prevSlide() {
    if (current > 0) current -= 1; // current값이 0보다 크면 이전위치로
    else current = slides.length - 1; // 그렇지 않으면 (첫번째 이미지이므로) 마지막위치로
    showSlides(current)
}

function nextSlide() {
    if (current < slides.length - 1) current += 1; // current값이 2보다 작으면 다음 위치로
    else current = 0;    // 그렇지 않다면 (마지막 이미지이므로) 첫번째 위치로 이동
    showSlides(current); // 이동한 위치의 이미지 표시
}

setInterval(function(){
    $('#slides>img').delay(2500);
    $('#slides>img').animate({marginLeft: "-1200px"})
    $('#slides>img').delay(2500);
    $('#slides>img').animate({marginLeft: "-2400px"})
    $('#slides>img').delay(2500);
    $('#slides>img').animate({marginLeft: "0px"})
});