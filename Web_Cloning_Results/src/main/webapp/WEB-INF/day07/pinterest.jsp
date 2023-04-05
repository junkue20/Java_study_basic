<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>pinterest 웹 클로닝</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <!-- 1. Bootstrap용 css CDN 추가 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <link rel="icon" href="image/pinterest.ico">
    <!-- 3. Bootstrap용 Icon CDN / font-awesome 아이콘용 CDN -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- 현재페이지용 css 링크 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/day07/css/main.css">
    <!-- 4. jQuery 추가 -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"
        integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
    <!-- Desandro libraries CDN -->
    <script src="https://unpkg.com/masonry-layout@4/dist/masonry.pkgd.min.js"></script>
    <script src="https://unpkg.com/imagesloaded@5/imagesloaded.pkgd.min.js"></script>
    <!-- 현재페이지용 js 링크 -->
    <script src="${pageContext.request.contextPath}/resources/day07/js/main.js"></script>
</head>

<body>
    <div class="head-wrapper">
        
        <!-- 헤더 -->
        <header id="main-header">

            <div class="header-search-form">
                <form class="form">
                    <i class="fa fa-search"></i>
                    <input type="text" class="form-control form-input" placeholder="Search anything...">
                    <span class="left-pan"><i class="fa fa-microphone"></i></span>
                </form>
            </div>
            <h1 class="header-title">Pinterest</h1>
        </header>


        <!-- 네비게이션 영역 -->
        <nav id="main-navigation" class="shadow-sm">
            <ul id="main-navbar">
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <!-- 드롭다운 메뉴 영역 -->
            <div class="btn-group profile-loc">
                <button type="button" class="btn btn-danger dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">프로필</button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">About me</a></li>
                    <li><a class="dropdown-item" href="#">Security</a></li>
                    <li><a class="dropdown-item" href="#">Settings</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="#">Log out</a></li>
                </ul>
            </div>
        </nav>
    </div>

    <!-- 메인섹션 영역 -->
    <section id="main-section">
        <!-- 최종 완성 Paper -->
        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/750" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>
        <!-------------------------------------- Paper 반복 -------------------------------------->
        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/740" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/740" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/530" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/840" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/710" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/790" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/720" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/880" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/980" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/450" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/950" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/720" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/660" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/735" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/750" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/870" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/610" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/790" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/430" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/630" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

        <div class="paper">
            <div class="paper-holder">
                <img width="210" src="https://picsum.photos/400/710" class="paper-img">
            </div>
            <!-- <p class="paper-description">Lorem ipsum dolor sit amet.</p> -->
            <div class="paper-content align-middle">
                <a class="paper-link" href="#">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif" width="30">
                </a>
                <p class="paper-text">About User</p>
            </div>
        </div>

    </section>	
    <!-- 라이트박스 영역 -->
    <div id="darken-background">
        <div id="lightbox">
            <div class="user-info">
                <a href="#" class="user-info-image">
                    <img src="${pageContext.request.contextPath}/resources/day07/image/profile.gif">
                </a>
                <div class="user-info-text">
                    <h3>About me...</h3>
                </div>
            </div>
            <hr class="lightbox-splitter">
            <img id="random-image" src="https://picsum.photos/600/555">

        </div>
    </div>

    <!-- 2. Bootstrap용 js는 body에 위치해야 함! -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>

</html>