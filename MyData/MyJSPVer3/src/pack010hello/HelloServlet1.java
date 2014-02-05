package pack010hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*This is JSP's comment. It is not translated in servlet*/

public class HelloServlet1 extends HttpServlet
	{	
	
		// 
		protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
			{	PrintWriter outToServer = arg1.getWriter();
				//PrintHead.printHead(arg1, "HelloWorld.");
				outToServer.println("<!--This is HTML Comment.  It is passed to browser as a part of html-->");
				arg1.setContentType("text/plain");
				outToServer.println("Hello World 01.");
				outToServer.println("<HTML>");
			}

		protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
			{	doGet(arg0, arg1);
			}
	}