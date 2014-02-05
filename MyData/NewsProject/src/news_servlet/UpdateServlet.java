package news_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NewsDAOImpl;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsDAOImpl impl=new NewsDAOImpl();
		String id=request.getParameter("id");
		int newsid=Integer.parseInt(id);
		String newsupdate=request.getParameter("newsupdate");
		impl.updateNews(newsid,newsupdate);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/admin");
		dispatcher.forward(request, response);
	}
}
