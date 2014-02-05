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


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}
protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	NewsDAOImpl impl=new NewsDAOImpl();
	
	String content=request.getParameter("content");
	String type=request.getParameter("type");
	MyNews addnews=new MyNews(3,content,type);
	impl.addNews(addnews);
	RequestDispatcher dispatcher=request.getRequestDispatcher("/admin");
	dispatcher.forward(request, response);
	
	}

}
