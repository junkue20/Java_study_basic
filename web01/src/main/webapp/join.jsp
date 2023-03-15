<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<div>
			<h3>회원가입</h3>
			<!-- joinaction.jsp로 페이지를 전환시킴! -->	
			<form action = "joinaction.jsp" method = "post"> 
			<!-- method 를 get으로 설정할 시 주소창에 데이터가 보임! -->	
			<!-- 민감한 정보를 전달 할 시 post로 정보를 전송할 것 -->	
				아이디 :       <input type="text" name = "id"/> <br />
				비밀번호 : <input type="text"  name = "pw1"/> <br />
				비밀먼호 확인 : <input type="text"  name = "pw2"/> <br />
				이름 : <input type="text" name = "name" /> <br />
				연락처 : <input type="text"  name = "phone"/> <br />
				주소 : <input type="text"  name = "adr"/> <br />
				
				
				<input type="submit" value="회원가입" />
				<!-- name은 입력값의 고유명임. 값을 불러올 때 필요! -->	
				
			</form>
		</div>
	</body>
</html>