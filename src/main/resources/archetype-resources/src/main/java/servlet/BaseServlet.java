package ${groupId}.${artifactId}.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public class BaseServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
}
