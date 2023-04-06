package jejuWebController;

import java.io.IOException;
import java.util.List;

import config.MybatisContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webdto.Board;
import webmapper.BoardMapper;

@WebServlet(urlPatterns = { "/board/select.do" })

public class BoradSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoradSelect() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 주소창에 select.do?page=1가 없을경우 처리
		String page = request.getParameter("page");
		if (page == null) {
			response.sendRedirect("select.do?page=1"); // 강제로 page=1 처리
			return; // 메소드 종료시키기
		}

		// 페이지네이션(PN) 시작값
		int start = Integer.parseInt(page) * 10 - 9;
		// PN 종료값
		int end = Integer.parseInt(page) * 10;

		// 1. DB에서 게시글 전체 읽기
		List<Board> list = MybatisContext.getSqlSession()
				.getMapper(BoardMapper.class).selectBoardList(start, end);

		// 1-1. 전체 게시글 갯수 페이지네이션 전달
		long cnt = MybatisContext.getSqlSession().getMapper(BoardMapper.class).countBoardList();

		// 2. view로 list 전달
		request.setAttribute("list", list);
		request.setAttribute("pages", (cnt - 1) / 10 + 1);

		// 3. board_select.jsp 화면에 표시
		request.getRequestDispatcher("/WEB-INF/board_select.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
