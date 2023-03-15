package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dto.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 크롬에서 127.0.0.1:8080/web01/memberlist.do를 입력하면
@WebServlet("/memberlist.do")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Member> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Member obj = new Member();
			obj.setMEM_ID("web01_id" + i);
			obj.setMEM_NAME("web01_name" + i);
			list.add(obj);
		}
		// 2. jsp로 값을 전달
		request.setAttribute("list", list);

		// 3. WEB-INF 폴더의 memberlist1.jsp 표시
		request.getRequestDispatcher("/WEB-INF/memberlist1.jsp").forward(request, response);
		;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
