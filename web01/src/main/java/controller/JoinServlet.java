package controller;

import java.io.IOException;

import dto.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//1. extends
// 서버 재 구동 127.0.0.1:8080/web01/join.do 입력

@WebServlet("/join1.do") // 어노테이션 사용, 항상 주소값은 servlet을 통과하여 jsp를 찾아감.
public class JoinServlet extends HttpServlet {

	// 2. override
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 1. view로 필요한 정보를 전달
		// 1-1. 변수선언
		req.setAttribute("name", "aaa");
		req.setAttribute("phone", "010");
		
		// 1-2. 객체선언
		Member obj = new Member();
		obj.setMEM_NAME("홍길동");
		obj.setMEM_ID("id123123");
		req.setAttribute("member", obj);

		// 2. 해당 주소의 jsp로 전달
		req.getRequestDispatcher("/WEB-INF/join1.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
