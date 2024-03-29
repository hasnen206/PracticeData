package pack060response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadPPT extends HttpServlet
{	
	
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
		{	arg1.setContentType("application/vnd.ms-powerpoint");	// Setting content type.
		
		    ServletContext context = getServletContext();
		    InputStream is = context.getResourceAsStream("/WEB-INF/data/Presentation on JDBC.ppt");
		    OutputStream os = arg1.getOutputStream();
		    
		    int readBytes = 0;
	        byte bytesBuff[] = new byte[1024];
	        
	        while((readBytes = is.read(bytesBuff))!= -1)
	        	{os.write(bytesBuff, 0, readBytes);}
	        
		    os.flush();
		    os.close();	
		}

	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
		{	doGet(arg0, arg1);	}

}
