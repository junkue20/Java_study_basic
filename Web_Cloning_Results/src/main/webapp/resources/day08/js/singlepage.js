$(document).ready(function () {
    var navbarShrink = function () { /* == ' () => { ' */
        const mainNav = $('#mainNav');
        if (!mainNav) {
            return;
        }
        if (window.scrollY === 0)
            mainNav.removeClass('navbar-shrink');
        else
            mainNav.addClass('navbar-shrink');
    }
    navbarShrink();

    // 실패. 동작을 안함
    // const navbarToggler =$('.navbar-toggler');
    // const resNavItems = [].slice.call(
    //     document.querySelectorAll('#navbarResponsive .nav-link')
    // );
    // resNavItems.map(function (resNavItems) {
    //     resNavItem.addEventListener('click', () => {
    //         if (window.getComputedStyle(navbarToggler).display !=='none') {
    //             navbarToggler.click();
    //         }
    //     });
    // });

    $(document).scroll(function () {
        navbarShrink();
    });


    /* ------------------------------------------------- */

    /* 아래의 코드는 기존에 사용했던 click Active 명령어이다.*/
    // $('#menu_about').on("click", function() {
    //     $('#menu_about').addClass('active');
    //     $('#menu_portfolio').removeClass('active');
    //     $('#menu_signup').removeClass('active');
    // });
    //
    // $("#menu_portfolio").on("click", function() {
    //     $('#menu_portfolio').addClass('active');
    //     $('#menu_about').removeClass('active');
    //     $('#menu_signup').removeClass('active');
    // });
    //
    // $("#menu_signup").on("click", function() {
    //     $('#menu_signup').addClass('active');
    //     $('#menu_about').removeClass('active');
    //     $('#menu_portfolio').removeClass('active');

    /* ------------------------------------------------- */

    /* 이 코드는 위의 코드를 좀 더 간략화 한 것. */
    // $('.nav-link').click(function () {
    //     $('.nav-link').removeClass('active');
    //     $(this).addClass('active');
    // });

    /* ------------------------------------------------- */

    /* ----------------------- 하지만 위의 코드는 사실 쓸 필요가 없었다..! ----------------------- */


    // 문제 요약 :

    /* 내 생각에는 두가지 Active 명령이 겹쳐 서로 충돌하며 잔상이 생겨 문제가 발생한것 같다는 결론이다..
    
       쉽게 이야기해서 
       
       " 클릭해도 버튼에 불이 들어오고, 스크롤 위치에따라서도 불이 들어오니 충돌이 일어났다 "
    
       그런 상황인것 같다. 위의 코드들을 주석 처리하고 실행해보니 거짓말처럼 깨끗하게 실행된다.. */

    /* ----------------------------------------------------------------------------------------- */


    /* 아래의 코드는 페이지 스크롤에 따른 내비게이션 메뉴 scroll Active 설정 코드. */

    $(document).on('scroll', function () {

        var about = document.getElementById('about');
        var aboutHeight = about.getBoundingClientRect().top;
        var portfolio = document.getElementById('portfolio');
        var portfolioHeight = portfolio.getBoundingClientRect().top;
        var signup = document.getElementById('signup');
        var signupHeight = signup.getBoundingClientRect().top;

        if (window.scrollY > aboutHeight && window.scrollY < portfolioHeight) {
            $('#menu_about').addClass('active');
            $('#menu_portfolio').removeClass('active');
            $('#menu_signup').removeClass('active');
        } else if (window.scrollY > portfolioHeight && window.scrollY < signupHeight) {
            $('#menu_about').removeClass('active');
            $('#menu_portfolio').addClass('active');
            $('#menu_signup').removeClass('active');
        } else if (window.scrollY > signupHeight) {
            $('#menu_about').removeClass('active');
            $('#menu_portfolio').removeClass('active');
            $('#menu_signup').addClass('active');
        }

    });

});
