<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Parallax Scrolling Web</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
     <!-- 1. Bootstrap용 css CDN 추가 -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
     <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/day07/css/parallax.css'>
     <link rel="icon" href="${pageContext.request.contextPath}/resources/day07/image/ui.ico">

     <!-- 3. jQuery 추가 -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"
    integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>

    <script src='${pageContext.request.contextPath}/resources/day07/js/parallax.js'></script>
    <script>
        $(document).ready(function () {
            var image = document.getElementById('hill1');
            $('.contents').css({
                'position': 'absolute',
                'top': image.height + 'px'
            });
        });

        // 브라우저 사이즈 바뀔때마다
        $(window).resize(function () {
            var image = document.getElementById('hill1');
            console.log(`${image.width} x ${image.height}`);

            $('.contents').css({
               'position': 'absolute',
               'top': image.height + 'px' 
            });
        });
    </script>
</head>
<body>
    <header>
        <h2 class="logo">Logo</h2>
        <nav class="navigation">
            <a href="#" class="pullUp">Home</a>
            <a href="#">About</a>
            <a href="#">Service</a>
            <a href="#">Contact</a>
        </nav>
    </header>

    <!-- Section 영역 -->
    <section class="parallax">
        <img src="${pageContext.request.contextPath}/resources/day07/image/hill1.png" id="hill1"> <!-- 맨뒤 -->
        <img src="${pageContext.request.contextPath}/resources/day07/image/hill2.png" id="hill2">
        <img src="${pageContext.request.contextPath}/resources/day07/image/hill3.png" id="hill3">
        <img src="${pageContext.request.contextPath}/resources/day07/image/hill4.png" id="hill4">
        <img src="${pageContext.request.contextPath}/resources/day07/image/hill5.png" id="hill5">
        <img src="${pageContext.request.contextPath}/resources/day07/image/tree.png" id="tree">
        <h2 id="text">Parallax Website</h2>
        <img src="${pageContext.request.contextPath}/resources/day07/image/leaf.png" id="leaf">
        <img src="${pageContext.request.contextPath}/resources/day07/image/plant.png" id="plant"> <!-- 맨앞 -->
    </section>

    <section class="contents">
        <h2>Parallex Scrolling Web</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum accusamus, tenetur adipisci doloremque dicta voluptatem ea, voluptas aperiam qui quos nesciunt velit nam minima voluptates molestias aspernatur laborum, dolor aliquam possimus illo? Neque aperiam excepturi itaque harum? Totam eligendi nostrum enim! Exercitationem molestias veniam, repudiandae consectetur, eum debitis quisquam doloribus, velit officiis eligendi eius nemo iste animi vero autem facere qui. Qui iste doloribus ipsam sapiente. Explicabo rem officiis ad ut eligendi nesciunt sed! Alias quis maiores impedit eaque quasi? Non suscipit consectetur quidem iusto, at est voluptatibus repellendus, ducimus praesentium temporibus modi, qui commodi numquam quis recusandae molestias excepturi. Illum ab quisquam eum molestias repellendus corporis, magnam minima quod explicabo inventore sint, in placeat sequi harum at architecto quasi sapiente voluptas pariatur accusamus ad hic! Eius odit adipisci quae harum quis quasi dolores, molestias accusamus cupiditate explicabo natus consectetur. Non inventore esse nemo ex quaerat maiores consectetur, temporibus sequi amet a officia eligendi nihil atque et dignissimos hic harum delectus consequuntur accusamus nobis qui rem voluptates molestias! Molestiae asperiores a provident autem, expedita commodi voluptatum consequatur sapiente cumque officiis quibusdam reiciendis sequi optio debitis recusandae exercitationem nisi repellendus perspiciatis. Error, blanditiis debitis! Voluptas soluta deleniti cumque, libero nobis vel ad. Eligendi ipsam, eum itaque soluta magni inventore sunt repellat alias blanditiis molestias eveniet illo non natus voluptatem vero maiores explicabo consequatur quia corrupti nam, doloribus praesentium ut! Similique soluta nesciunt repellat obcaecati odit. Accusantium, ratione officiis natus provident dignissimos odit fugit est iusto quidem maxime nostrum consectetur minus, laboriosam quaerat mollitia repellat expedita, impedit earum voluptatem tempore porro magni. Totam voluptatum harum ipsam eaque dolor ex deserunt possimus numquam, provident hic non tempora, eos optio nemo fugit quae earum sit aspernatur eligendi recusandae. Accusantium laudantium, a, rem dolor facere voluptatem facilis laboriosam nobis quasi sunt fugit nisi possimus maxime!<br><br> </p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum accusamus, tenetur adipisci doloremque dicta voluptatem ea, voluptas aperiam qui quos nesciunt velit nam minima voluptates molestias aspernatur laborum, dolor aliquam possimus illo? Neque aperiam excepturi itaque harum? Totam eligendi nostrum enim! Exercitationem molestias veniam, repudiandae consectetur, eum debitis quisquam doloribus, velit officiis eligendi eius nemo iste animi vero autem facere qui. Qui iste doloribus ipsam sapiente. Explicabo rem officiis ad ut eligendi nesciunt sed! Alias quis maiores impedit eaque quasi? Non suscipit consectetur quidem iusto, at est voluptatibus repellendus, ducimus praesentium temporibus modi, qui commodi numquam quis recusandae molestias excepturi. Illum ab quisquam eum molestias repellendus corporis, magnam minima quod explicabo inventore sint, in placeat sequi harum at architecto quasi sapiente voluptas pariatur accusamus ad hic! Eius odit adipisci quae harum quis quasi dolores, molestias accusamus cupiditate explicabo natus consectetur. Non inventore esse nemo ex quaerat maiores consectetur, temporibus sequi amet a officia eligendi nihil atque et dignissimos hic harum delectus consequuntur accusamus nobis qui rem voluptates molestias! Molestiae asperiores a provident autem, expedita commodi voluptatum consequatur sapiente cumque officiis quibusdam reiciendis sequi optio debitis recusandae exercitationem nisi repellendus perspiciatis. Error, blanditiis debitis! Voluptas soluta deleniti cumque, libero nobis vel ad. Eligendi ipsam, eum itaque soluta magni inventore sunt repellat alias blanditiis molestias eveniet illo non natus voluptatem vero maiores explicabo consequatur quia corrupti nam, doloribus praesentium ut! Similique soluta nesciunt repellat obcaecati odit. Accusantium, ratione officiis natus provident dignissimos odit fugit est iusto quidem maxime nostrum consectetur minus, laboriosam quaerat mollitia repellat expedita, impedit earum voluptatem tempore porro magni. Totam voluptatum harum ipsam eaque dolor ex deserunt possimus numquam, provident hic non tempora, eos optio nemo fugit quae earum sit aspernatur eligendi recusandae. Accusantium laudantium, a, rem dolor facere voluptatem facilis laboriosam nobis quasi sunt fugit nisi possimus maxime!</p>
    </section>

<!-- <footer>
    <nav>
        <a href="#">Blog</a>
        <span> | </span>
        <a href="#">Github</a>
    </nav>
    <p>
        <span>author : Codehal</span><span> | </span>
        <span>editor : Jungyu Park</span><span> | </span>
        <span>email : junkue13@gmail.com</span><span> | </span>
        <span>Copyright &copy; 2022.codehal. All Rights Reserved</span><span> | </span>
    </p>
</footer> -->

    <!-- 2. Bootstrap용 js는 body에 위치해야 함! -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>