<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>프레임 애니메이션</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<script>
        window.onload = function () { // function () { (익명함수) or () => { (익명 람다함수)
            var count = 0;
            var running = document.getElementById('running');
            var frames = [
                '${pageContext.request.contextPath}/resources/day05/images/0.png',
                '${pageContext.request.contextPath}/resources/day05/images/1.png',
                '${pageContext.request.contextPath}/resources/day05/images/2.png',
                '${pageContext.request.contextPath}/resources/day05/images/3.png',
                '${pageContext.request.contextPath}/resources/day05/images/4.png',
                '${pageContext.request.contextPath}/resources/day05/images/5.png',
                '${pageContext.request.contextPath}/resources/day05/images/6.png',
                '${pageContext.request.contextPath}/resources/day05/images/7.png',
                '${pageContext.request.contextPath}/resources/day05/images/8.png',
                '${pageContext.request.contextPath}/resources/day05/images/9.png',
                '${pageContext.request.contextPath}/resources/day05/images/10.png',
                '${pageContext.request.contextPath}/resources/day05/images/11.png',
                '${pageContext.request.contextPath}/resources/day05/images/12.png',
                '${pageContext.request.contextPath}/resources/day05/images/13.png',
                '${pageContext.request.contextPath}/resources/day05/images/14.png'
            ];
            
            setInterval(() => { // => 는 lambda 함수.
                running.src = frames[count % frames.length]; // 0~14 index로 무한반복
                count += 1;
            }, 40 ); // 영상 재생속도, 40ms에 한번씩 이미지 체인지.
        }
    </script>
</head>
<body>
	<img id="running">
</body>
</html>