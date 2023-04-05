<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" data-bs-theme="Light">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>부트스트랩 앨범페이지 클로닝</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <!-- 1. Bootstrap용 css CDN 추가 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <!-- 3. Bootstrap용 Icon CDN -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="icon" href="https://getbootstrap.com//docs/5.3/assets/img/favicons/favicon.ico">
    <!-- 4. jQuery 추가 -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js" 
    integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" 
    crossorigin="anonymous"></script>
    <script>
        $(document).ready(function (){
            $('#btnLight').addClass('active');

            $('img').css("border-radius", "5px 5px 0 0"); // 모드 이미지에 위쪽 모서리를 부드럽게 다음어준다.
            // 테마변경
            $('#btnLight').click(function () {
                $('html').attr('data-bs-theme', 'light');
                $(this).addClass('active');
                $('#btnDark').removeClass('active');
            });
            $('#btnDark').click(function () {
                $('html').attr('data-bs-theme', 'dark');
                $(this).addClass('active');
                $('#btnLight').removeClass('active');

            });
        });
    </script>
</head>

<body>
    <!-- TOP 메뉴영역 -->
    <header data-bs-theme-value="dark">
        <div class="text-bg-dark collapse" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 py-4">
                        <h4>About</h4>
                        <p class="text-secondary">
                            Add some information about the album below, the author, or any other background context.
                            Make it a few sentences long so folks can pick up some informative tidbits. Then, link them
                            off to some social networking sites or contact information.
                        </p>
                    </div>
                    <div class="col-sm-4 py-4">
                        <h4>Contact</h4>
                        <ul class="list-unstyled"> <!-- 글 앞에있는 점을 빼주는 클래스. -->
                           <li><a href="#" class="text-white">Follow on Twitter</a></li>
                           <li><a href="#" class="text-white">Like on Facebook</a></li>
                           <li><a href="#" class="text-white">Email me</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="navbar navbar-dark bg-dark shadow-sm">
            <div class="container">
                <a href="#" class="navbar-brand d-flex align"> <!-- '#'은 자기페이지를 이야기함! -->
                    <i class="bi bi-camera"></i>&nbsp; <!-- '&nbsp;'로 여백을 줄 수 있다! -->
                    <strong> Album</strong> <!-- strong은 Bold체를 이야기함! -->
                </a>
                <!-- 상위 메뉴의 숨겨진 부분을 버튼과 상호작용하여 나타나도록 설정 -->
                <button type="button" class="navbar-toggler collapsed" data-bs-toggle="collapse"
                    data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="true"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </div>
    </header>
    <!-- Main 영역 (Album example, Thumbnail)-->
    <main>
        <section class="py-5 text-center container">
            <div class="row py-5">
                <div class="col-6 mx-auto">
                    <h1 class="fw-light">Album example</h1>
                    <p class="lead text-body-secondary">Something short and leading about the collection below—its contents, the creator, 
                        etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.
                    </p>
                    <p>
                        <a href="#" class="btn btn-primary my-2">Main call to action</a>
                        <a href="#" class="btn btn-secondary my-2">Secondary action</a>
                    </p>
                </div>
            </div>
        </section>
        <div class="album py-5 bg-body-tertiary">
            <div class="container">
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    <!-- col 9개로 구성할 것 -->
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225" focusable="false" >
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <img src="https://via.placeholder.com/400x225" width="100%" height="225">
                            <div class="card-body">
                                <p class="card=text">
                                    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                                </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    <small class="text-body-secondary">9 mins</small>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <!-- Footer 영역 (Album example is ©)-->
    <footer class="text-secondary py-5">
        <div class="container">
            <p class="float-end mb-1">
                <a href="#">Back to top</a>
            </p>
            <p class="mb-1">
                Album example is &copy; Bootstrap, but please download and customize it for yourself! <br/>
                New to Bootstrap? <a href="#">Visit the homepage</a> or read our <a href="#">getting started guide.</a>
            </p>
        </div>
    </footer>
    <!-- 맨바닥 테마(light/dark) 변경 버튼 영역 (Light, Dark 테마)-->
    <div class="dropdown position-fixed bottom-0 end-0 mb-3 me-3 bd-mode-toggle">
        <button class="btn btn-primary py-2 dropdown-toggle d-flex align-items-center" data-bs-toggle="dropdown"
            id="bd-theme" type="button" aria-expanded="false" data-bs-toggle="dropdown" aria-label="Toggle theme (light)">
            <i class="bi bi-brightness-high-fill"></i>
        </button>
        <ul class="dropdown-menu">
            <li>
                <button id="btnLight" class="dropdown-item d-flex align-items-center " data-bs-theme-value="light"
                    aria-pressed="true">
                    <i class="bi bi-brightness-high-fill" style="color: gray;"></i>&nbsp; Light
                </button>
            </li>
            <li>
                <button id="btnDark" type="button" class="dropdown-item d-flex align-items-center " data-bs-theme-value="dark"
                    aria-pressed="false">
                    <i class="bi bi-moon-stars-fill" style="color: gray;"></i>&nbsp; Dark
                </button>
            </li>
        </ul>
    </div>
    <!-- 2. Bootstrap용 js는 body에 위치해야 함! -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>

</html>