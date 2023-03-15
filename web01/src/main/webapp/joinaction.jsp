<%@page import="dto.Member"%>
<%@page import="mapper.MemberMapper"%>
<%@page import="config.MyBatisContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리</title>
</head>
<body>
	<%
		// 여기는 자바 문법을 사용 할 수 있음.
		// 여기는 기본적으로 몇가지 클래스의 객체를 생성해 놓았음.
		// HttpServletRequest request;    // 요청
		// HttpServletResponse response;  // 응답
		// System객체 생성 되어 있음.
		
		String id = request.getParameter("id");
		String pw1 = request.getParameter("pw1");
		String pw2 = request.getParameter("pw2");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String adr = request.getParameter("adr");
		
		MemberMapper mapper = MyBatisContext.getSqlSession().getMapper(MemberMapper.class);
		Member obj = new Member();
		obj.setMEM_NAME(name);
		obj.setMEM_ID(id);
		obj.setMEM_PW(pw1);
		obj.setMEM_PHONE(phone);
		obj.setMEM_ADDRESS(adr);
		
		int ret = mapper.insertMemberOne(obj);
		
		if(ret == 1){
			response.sendRedirect("joinok.jsp"); // 404표시
		}
		else{
			response.sendRedirect("join.jsp"); // 회원가입으로 이동
		}
		
// 		out.println(id);
// 		out.println(pw1);
	%>

	<%
	    // 중복으로 생성 가능
	%>
</body>
</html>