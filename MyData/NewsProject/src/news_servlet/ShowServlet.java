package news_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.MyNews;

import dao.NewsDAOImpl;


public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	NewsDAOImpl impl=new NewsDAOImpl();
	PrintWriter out=response.getWriter();
	for(MyNews s:impl.getNewsList()){
		out.println(s);
		
	}
	//RequestDispatcher dispatcher=request.getRequestDispatcher("/admin");
	//dispatcher.forward(request, response);
	}
}
