package news_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NewsDAOImpl;

/**
 * Servlet implementation class Remove_Servlet
 */
public class Remove_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		int newsId=Integer.parseInt(id);
		NewsDAOImpl impl=new NewsDAOImpl();
		impl.deleteNews(newsId);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/admin");
		dispatcher.forward(request, response);
		
		
	}
}
