package com.webftp;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebftpServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String message = "Transmission de variables : OK !";
	    req.setAttribute( "test", message );
	    this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( req, resp );
	}
}
