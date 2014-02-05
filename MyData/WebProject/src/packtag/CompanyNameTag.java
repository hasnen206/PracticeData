package packtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CompanyNameTag extends TagSupport {
@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.print("Imarticus Pvt. Ltd.");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}
