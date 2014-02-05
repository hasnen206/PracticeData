package packservlet;

import imarticuspojo.MyImarticus;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ImarticusImpl;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object String;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("name");
		String password=request.getParameter("pass");
		String address=request.getParameter("addr");
		String day=request.getParameter("day");
		 
		String month=request.getParameter("month");
		String year=request.getParameter("year");
		Date dob=Date.valueOf(day+"/"+ month + "/"+year);
        String gender=request.getParameter("group1");
        String[]hobbies=request.getParameterValues("option1");
		String hobby=hobbies[0] + "," + hobbies[1];
        ImarticusImpl fetchdata=new ImarticusImpl();
        
        MyImarticus newstudent=new MyImarticus(username, password, dob, address, gender, hobby);
        fetchdata.addStudent(newstudent);
		
		
	}
}
