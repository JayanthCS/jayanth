package lovetoday;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/Activa"))
public class ActivaServalet extends HttpServlet {

	public ActivaServalet() {
		System.out.println("ActivaServalet no-arg const...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet.........Activa");

		req.getRequestURL();
		System.out.println(req.getRemoteAddr());

		Enumeration<String> enumeration = req.getHeaderNames();

		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();

			System.out.println(headerName + " : " + req.getHeader(headerName));
		}

		System.out.println("=====================");

		resp.setContentType("text/html");
		PrintWriter respWriter = resp.getWriter();
		respWriter.print("<html><body><h1>This is my first response</h1></body></html>");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service in Acti vaServlet");
		super.service(arg0, arg1);

	}
}
