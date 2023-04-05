<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Dream Jeju 회원가입</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<!-- css -->
<link rel='stylesheet'
	href="${pageContext.request.contextPath}/resources/jeju/css/join.css">
</head>

<body>
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-lg-5">
							<div class="card shadow-lg border-0 rounded-lg mt-5">
								<div class="card-header">
									<h3 class="text-center font-weight-light my-4">환영합니다!</h3>
								</div>
								<div class="card-body">
									<form>
										<div class="form-floating mb-3">
											<input type="email" class="form-control" id="id"
												placeholder="name@example.com"> <label
												for="floatingInput">설정할 아이디</label>
										</div>
										<div class="form-floating mb-3">
											<input type="password" class="form-control" id="password"
												placeholder="Password"> <label
												for="floatingPassword">설정할 비밀번호</label>
										</div>
										<div class="form-floating mb-3">
											<input type="password" class="form-control"
												id="passwordCheck" placeholder="Password"> <label
												for="floatingPassword">비밀번호 확인</label>
										</div>
										<div class="form-floating mb-3">
											<input type="text" class="form-control" id="name"
												placeholder="name@example.com"> <label
												for="floatingInput">이름 </label>
										</div>
										<hr />
										<div class="container text-center">
											<input type="button" class="btn btn-success mb-3"
												onclick="sample6_execDaumPostcode()" value="내주소 찾기">
											<div class="row">
												<div class="col">
													<input type="text" class="form-control mb-3"
														id="sample6_postcode" placeholder="우편번호" disabled>
												</div>
												<div class="col">
													<input type="text" id="sample6_address"
														class="form-control mb-3" placeholder="주소" disabled>
												</div>
											</div>
											<input type="text" class="form-control mb-3"
												id="sample6_detailAddress" placeholder="상세주소"> 
											<input type="text" class="form-control mb-3"
												id="sample6_extraAddress" placeholder="추가정보">
										</div>
										<hr>
										<div class="container text-center">
											<a class="btn btn-primary" href=""
												onclick="getMemberJoinContent()">회원가입</a>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>
	</div>

	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
		function sample6_execDaumPostcode() {
			// PostCode() obj = new postCode();
			// obj.open;

			// new PostCode().open();

			new daum.Postcode(
					{
						oncomplete : function(data) {
							// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

							// 각 주소의 노출 규칙에 따라 주소를 조합한다.
							// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
							var addr = ''; // 주소 변수
							var extraAddr = ''; // 참고항목 변수

							//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
							if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
								addr = data.roadAddress;
							} else { // 사용자가 지번 주소를 선택했을 경우(J)
								addr = data.jibunAddress;
							}

							// '1'== 1   '1'=== 1 엄격한 비교 (=세개짜리는)
							// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
							if (data.userSelectedType === 'R') {
								// 법정동명이 있을 경우 추가한다. (법정리는 제외)
								// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
								// 정규식, 정규표현식 패털을 찾아서
								// ex) 사용자가 입력한 이메일 주소가 정확한지 확인
								if (data.bname !== ''
										&& /[동|로|가]$/g.test(data.bname)) {
									extraAddr += data.bname;
								}
								// 건물명이 있고, 공동주택일 경우 추가한다.
								if (data.buildingName !== ''
										&& data.apartment === 'Y') {
									extraAddr += (extraAddr !== '' ? ', '
											+ data.buildingName
											: data.buildingName);
								}
								// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
								if (extraAddr !== '') {
									extraAddr = ' (' + extraAddr + ')';
								}
								// 조합된 참고항목을 해당 필드에 넣는다.
								document.getElementById("sample6_extraAddress").value = extraAddr;

							} else {
								document.getElementById("sample6_extraAddress").value = '';
							}

							// 우편번호와 주소 정보를 해당 필드에 넣는다.
							document.getElementById('sample6_postcode').value = data.zonecode;
							document.getElementById("sample6_address").value = addr;
							// 커서를 상세주소 필드로 이동한다.
							document.getElementById("sample6_detailAddress")
									.focus();
						}
					}).open();
		}
	</script>

	<script>
		function getMemberJoinContent() {
			const id = document.getElementById("id");
			const password = document.getElementById("password");
			const name = document.getElementById("name");
			const sample6_postcode = document
					.getElementById("sample6_postcode");
			const sample6_address = document.getElementById("sample6_address");
			const sample6_detailAddress = document
					.getElementById("sample6_detailAddress");
			const sample6_extraAddress = document
					.getElementById("sample6_extraAddress");

			console.log(id.value);
			console.log(password.value);
			console.log(name.value);

		}
	</script>
</body>

</html>

