<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Dream Jeju</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet'
	href="${pageContext.request.contextPath}/resources/jeju/css/main.css">
</head>

<body >
	<div id="container">
		<jsp:include page="header.jsp"></jsp:include>
		<div id="slideShow">
			<div id="slides">
				<img
					src="${pageContext.request.contextPath}/resources/jeju/images/100a0e0000006zype378A_C_640_320_R5_Q70.jpg_.webp"
					style="width: 100%;"> <img
					src="${pageContext.request.contextPath}/resources/jeju/images/image_readbot_2021_1053506_16362360634839726.jpg"
					style="width: 100%;"> <img
					src="${pageContext.request.contextPath}/resources/jeju/images/Jeju-Island-hotels-things-to-do-in-Jeju-Island-South-Korea.jpg"
					style="width: 100%;">
				<button id="prev">&lang;</button>
				<button id="next">&rang;</button>
			</div>
		</div>
		<div id="contents">
			<div id="tabMenu">
				<input type="radio" id="tab1" name="tabs" checked> <label
					for="tab1">공지사항</label> <input type="radio" id="tab2" name="tabs">
				<label for="tab2">갤러리</label>

				<div id="notice" class="tabContent">
					<h2>공지사항 내용입니다.</h2>
					<ul>
						<li>사무실 이전내용</li>
						<li>[참가모집중] 카약 체험에 초대합니다.</li>
						<li>[참가모집중] 여름방학 기간, 오름 체험단을 모집합니다.</li>
						<li>겨울, 추천여행지</li>
						<li>가을, 추천여행지</li>
					</ul>
				</div>
				<div id="gallery" class="tabContent">
					<h2>갤러리 내용입니다.</h2>
					<ul>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-1.jpg"></li>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-2.jpg"></li>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-3.jpg"></li>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-1.jpg"></li>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-2.jpg"></li>
						<li><img
							src="${pageContext.request.contextPath}/resources/jeju/images/img-3.jpg"></li>
					</ul>
				</div>
			</div>


			<div id="links">
				<ul>
					<li><a href="#"> <span id="quick-icon1"></span>
							<p>평화 기행</p>
					</a></li>
					<li><a href="#"> <span id="quick-icon2"></span>
							<p>힐링 워크숍</p>
					</a></li>
					<li><a href="#"> <span id="quick-icon3"></span>
							<p>문의하기</p>
					</a></li>
				</ul>
			</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/jeju/js/slideshow.js"></script>
</body>

</html>