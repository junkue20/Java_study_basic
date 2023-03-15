<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join1.jsp</title>
</head>
<body>

	<input type = "text" value = "${name}" />
	${name}
	${age}
	${mem.userid}
	${mem.userpw}
	
	<hr/>
	<%
	// joinServlet에서 불러온 값 
	// 1-1
	String name = (String) request.getAttribute("name");
	String phone = (String) request.getAttribute("phone");
	// 1-2
	Member member = (Member) request.getAttribute("member");

	/*   jsp에서 import는 문자 끝에서 Ctrl + space를 해주어야 함!   */
	
	out.println("{변수선언값 : ");
	out.println(name);
	out.println(phone);
	out.println("} | {");
	out.println("객체선언값 : ");
	out.println(member.getMEM_ID());
	out.println(member.getMEM_NAME());
	out.println("} |");


	
	%>
	join1.jsp
</body>
</html>