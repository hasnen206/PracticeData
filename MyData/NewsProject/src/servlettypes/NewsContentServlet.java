package servlettypes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NewsDAOImpl;
import dao.UserDAOImpl;

/**
 * Servlet implementation class NewsContentServlet
 */
public class NewsContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		PrintWriter out=response.getWriter();
		ArrayList<String> list=new ArrayList<>();
		String newstype=request.getParameter("group1");
		
		NewsDAOImpl caller=new NewsDAOImpl();
		RequestDispatcher dispatcher=null;
		if(newstype.equals("sports")){
			list.addAll(caller.getNews("SPORTS"));
			for(String s:list){
				out.println(s);
			}
			dispatcher=request.getRequestDispatcher("/user");
		}
		/*else if(newstype.equals("politics")){
			caller.getNews("POLITICS");
			dispatcher=request.getRequestDispatcher("/user");
		}
		else if(newstype.equals("others")){
			caller.getNews("OTHERS");
			dispatcher=request.getRequestDispatcher("/user");
		}
		dispatcher.forward(request, response);*/
	}

}
