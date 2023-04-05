package BSAlbumController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// http://127.0.0.1:8080/Web_Cloning_Results/bootstrap.html
@WebServlet(urlPatterns = {"/bootstrap.html"})
public class BootstrapAlbum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BootstrapAlbum() {
	}
//	${pageContext.request.contextPath}/resources/day08/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// main.jsp 파일 랜더링 
		request.getRequestDispatcher("/WEB-INF/day06/bootstrapalbum.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
