<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <!--  -->
    <meta name="author" content="PJK">
    <meta name="description" content="스타트 부트스트랩 닷컴에서 받은 예시로 만든 커스터마이징 웹사이트입니다.">

    <title>Single Page Web</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>

    <!-- 1. Bootstrap용 css CDN 추가 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <!-- 2. Bootstrap용 Icon CDN / font-awesome 아이콘용 CDN -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- 3. font awesome용 css CDN  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
        integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <link rel='stylesheet' type='text/css' media='screen' href="${pageContext.request.contextPath}/resources/day08/css/singlepage.css">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/day08/images/ui.ico">
    <!-- 4. jQuery 추가 -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"
        integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>

    <!-- font awesome용 스크립트 CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/js/all.min.js"
        integrity="sha512-fD9DI5bZwQxOi7MhYWnnNPlvXdp/2Pj3XSTRrFs5FQa4mizyGLnJcN6tuvUS6LbmgN1ut+XGSABKvjN0H6Aoow=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src='${pageContext.request.contextPath}/resources/day08/js/singlepage.js'></script>
</head>

<body id="page-top">

    <!-- 네비게이션 영역 -->
    <nav id="mainNav" class="navbar navbar-light navbar-expand-lg fixed-top">
        <div class="container px-4">
            <a href="#page-top" class="navbar-brand">Logo</a>
            <button type="button" class="navbar-toggler navbar-toggler-right" 
                    data-bs-toggle="collapse" data-bs-target="#navbarResponsive" 
                    aria-controls="navbarResponsive" aria-expanded="Toggle navigation">
                Menu
                <i class="fas fa-bars"></i>
            </button>
            <div id="navbarResponsive" class="navbar-collapse collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a id="menu_about" href="#about" class="nav-link">About</a></li>
                    <li class="nav-item"><a id="menu_portfolio" href="#portfolio" class="nav-link">Portfolio</a></li>
                    <li class="nav-item"><a id="menu_signup" href="#signup" class="nav-link">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- 마스터헤드 -->
    <header class="masterHead">
        <div class="container px-4 d-flex h-100 justify-content-center align-items-center">
            <div class="d-flex justyfy-content-center">
                <div class="text-center">
                    <h1 class="mx-auto my-50 text-uppercase">Grayscale</h1>
                    <h2 class="text-gray-50 mx-auto mt-2 mb-5">responsive single page Bootstrap site</h2>
                    <a href="#about" class="btn btn-primary">Get Started</a>
                </div>
            </div>
        </div>
    </header>
    <!-- about -->
    <section id="about" class="about-section text-center">
        <div class="container px-4">
            <div class="row gx-4 justify-content-center">
                <div class="col-8">
                    <h2 class="text-white mb-4">Grayscale</h2>
                    <p class="text-white-50">A free, responsive, one page Bootstrap theme created by Start Bootstrap. It can be yours right now, simply download the template on
                        <a href="https://startbootstrap.com/theme/grayscale/">the preview page.</a>
                        The theme is open source, and you can use it for any purpose, personal or commercial.
                    </p>
                </div>
            </div>
            <img src="${pageContext.request.contextPath}/resources/day08/images/ipad.png" alt="..." class="img-fluid">
        </div>
    </section>
    <!-- Portfolio 영역 -->
    <section id="portfolio" class="portfolios-section bg-light">
        <div class="container px-4 ">
            <!-- Freatured 1st row 영역 -->
            <div class="row align-items-center gx-0 mb-4">
                <div class="col-8">
                    <img src="${pageContext.request.contextPath}/resources/day08/images/bg-masthead.jpg" class="img-fluid mb-3">
                </div>
                <div class="col-4">
                    <div class="featured-text text-center">
                        <h4>Shoreline</h4>
                    <p class="text-black-50 mb-0">Grayscale is open source and MIT licensed. This means you can use it for any project - even
                        commercial projects! Download it, customize it, and publish your website!</p>
                    </div>
                </div>
            </div>
            <!-- 2nd row 영역 -->
            <div class="row justify-content-center gx-0">
                <div class="col-6">
                    <img src="${pageContext.request.contextPath}/resources/day08/images/demo-image-01.jpg" class="img-fluid">
                </div>
                <div class="col-6">
                    <div class="bg-black text-center h-100 portfolio">
                        <div class="d-flex h-100">
                            <div class="portfolio-text w-100 my-auto text-center">
                                <h4 class="text-white">Misty</h4>
                                <p class="mb-0 text-white-50">An example of where you can put an image of a project, or anything else, along with a
                                    description.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 3rd row 영역 -->
            <div class="row justify-content-center gx-0 mb-5">
                <div class="col-6">
                    <img src="${pageContext.request.contextPath}/resources/day08/images/demo-image-02.jpg" class="img-fluid">
                </div>
                <!-- col 영역 위치 바꾸기 -->
                <div class="col-6 order-first"> <!-- order-first로 앞뒤 순서를 바꿔줌!  -->
                    <div class="bg-black text-center h-100 portfolio">
                        <div class="d-flex h-100">
                            <div class="portfolio-text w-100 my-auto text-center">
                                <h4 class="text-white">Mountains</h4>
                                <p class="mb-0 text-white-50">Another example of a project with its respective description. These sections work
                                    well responsively as well!</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact / signup 영역 -->
    <section id="signup" class="signup-section">
        <div class="container px-4">
            <div class="row">
                <div class="col-10 mx-auto text-center">
                    <i class="far fa-paper-plane fa-2x text-white"></i>
                    <h2 class="text-gray mb-5 text-white">Subscribe!!</h2>
                    <form id="contactForm" class="form-signup">
                        <!-- 나중에 추가할 것!! -->
                        <div class="row input-group-newletter">
                            <div class="col"><input id="email" type="email" class="form-control" placeholder="Enter email address..." 
                                aria-label="Enter email address..." data-sb-validations="required,email"></div>
                            <div class="col-auto"><button id="save" type="submit" class="btn btn-primary">Send Email</button></div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <!-- Contact 영역 -->
    <section class="contact-section bg-black">
        <div class="container px-4">
            <div class="row gx-4">
                <!-- 1st col -->
                <div class="col-4 mb-3">
                    <div class="card py-4 h-100">
                        <div class="card-body text-center">
                            <i class="fas fa-map-marked-alt custom-color mb-2"></i>
                            <h4 class="text-uppercase m-0">Address</h4>
                            <hr class="my-4 mx-auto">
                            <div class="small text-black-50">365, Sinseon-ro, Nam-gu, Busan</div>
                        </div>
                    </div>
                </div>
                <!-- 2nd col -->
                <div class="col-4 mb-3">
                    <div class="card py-4 h-100">
                        <div class="card-body text-center">
                            <i class="fas fa-envelope custom-color mb-2"></i>
                            <h4 class="text-uppercase m-0">Email</h4>
                            <hr class="my-4 mx-auto">
                            <div class="small text-black-50"><a href="#!">email123@gmail.com</a></div>
                        </div>
                    </div>
                </div>
                <!-- 3rd col -->
                <div class="col-4 mb-3">
                    <div class="card py-4 h-100">
                        <div class="card-body text-center">
                            <i class="fas fa-mobile-alt custom-color mb-2"></i>
                            <h4 class="text-uppercase m-0">Phone</h4>
                            <hr class="my-4 mx-auto">
                            <div class="small text-black-50">+82 010-1234-5678</div>
                        </div>
                    </div>
                </div>
                <div class="social d-flex justify-content-center">
                    <a id="instagramBG" class="mx-2" href="#"><i class="fab fa-instagram"></i></a>
                    <a id="facebookBG" class="mx-2" href="#"><i class="fab fa-facebook-f"></i></a>
                    <a id="githubBG" class="mx-2" href="#"><i class="fab fa-github"></i></a>
                </div>
            </div>
    </section>
    <!-- footer -->
    <footer class="footer bg-black small text-center text-white-50">
        <div class="container px-4">Copyright &copy; Single Page Website 2023.</div>
    </footer>


    <!-- 5. Bootstrap용 js는 body에 위치해야 함! -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>