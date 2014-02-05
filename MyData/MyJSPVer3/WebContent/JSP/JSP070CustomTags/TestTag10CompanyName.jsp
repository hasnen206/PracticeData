<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<%@ taglib uri="/tags" prefix="tagjsp" %>
<HTML>
	<HEAD>
		<TITLE><tagjsp:COMPANYNAME/></TITLE>
	</HEAD>
	<BODY>
		<%@ page errorPage = "/JSP/JSP070CustomTags/Errors.jsp" %>
		<CENTER>
			<H1><tagjsp:COMPANYNAME/></H1>
			<H3><tagjsp:COMPANYADDRESS/></H3>
		</CENTER>
	</BODY>
</HTML>