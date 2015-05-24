package ${groupId}.${artifactId}.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ${groupId}.${artifactId}.service.HelloService;

@WebServlet(name = "hello", value = { "/hello"})
public class HelloServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	@Qualifier("helloService")
	HelloService helloService;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Long> ids = helloService.list();
		System.out.println(StringUtils.join(ids, ","));
		resp.getWriter().println("hello world to webapp3,uri is " + req.getRequestURI());
	}

}
