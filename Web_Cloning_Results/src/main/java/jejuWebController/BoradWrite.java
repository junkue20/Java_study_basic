package jejuWebController;

import java.io.IOException;

import config.MybatisContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webdto.Board;
import webmapper.BoardMapper;

@WebServlet(urlPatterns = { "/board/write.do" })
public class BoradWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoradWrite() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// main.jsp 파일 랜더링
		request.getRequestDispatcher("/WEB-INF/board_write.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 항목에 해당하는 내용들 받아오기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");

		// 확인
		Board obj = new Board();
		obj.setTitle(title);
		obj.setContent(content);
		obj.setWriter(writer);
		
		System.out.println(obj.toString());

		// 1. DB 추가하기
		int ret = MybatisContext.getSqlSession().getMapper(BoardMapper.class).insertBoard(obj);

		// 2. wjrwjfgks vpdlwlfh dlehd
		if (ret == 1) {
			response.sendRedirect("select.do");
		} else {
			response.sendRedirect("write.do");
		}
	}

}
