$(document).ready(function () {
    // 풀다운메뉴 이벤트

    $('.outer-menu').hover(function () {
        $(this).find('.inner-menu').css('display', 'block');
    }, function () {
        $(this).find('.inner-menu').css('display', 'none');
    });

    // masonry layout + imageload plugin
    $('#main-section').imagesLoaded(function () {
        $('#main-section').masonry({
            itemSelector: '.paper',
            columnWidth: 220,
            isAnimated: true,
        });
    });

    // 라이트박스 동작
    function showLightBox(obj) { // 라이트박스 보이기
        var img_src = obj.getElementsByTagName('img')[0].src; // 선택하는 이미지 출력
        $('#random-image').attr('src', img_src); // id값을 불러올때는 공백이 존재하면 안된다! 중요!

        $('#darken-background').show();
        $('#darken-background').css('top', $(window).scrollTop());
        $('body').css('overflow', 'hidden');
    }

    function hideLightBox() { // 라이트박스 숨기기
        $('#darken-background').hide();
        $('body').css('overflow', '');
    }

    $('.paper').on('click', function () { // 사진 클릭시 라이트박스 효과
        showLightBox(this);
    });

    $('#darken-background').click(function () { // 배경 클릭시 라이트박스 숨김
        hideLightBox();
    });

    $('#lightbox').click(function (event) {
        event.stopPropagation(); // 클릭 이벤트 하위객체 전달 금지
    });
});
