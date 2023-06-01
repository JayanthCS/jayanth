package jayanth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class JayanthServlet extends HttpServlet {

	public JayanthServlet() {
		System.out.println("JayanthServlet no-arg const...........");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Calling service method");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet........JayanthServlet");

		req.getRequestURL();
		System.out.println("Ip adress " + req.getRemoteAddr());

		Enumeration<String> enumeration = req.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();

			System.out.println(headerName + "  " + req.getHeader(headerName));
		}

		String name = req.getParameter("fname");
		String code = req.getParameter("code");
		String population = req.getParameter("population");
		String capitalcity = req.getParameter("capitalcity");
		System.out.println(
				"CountryName :" + name + "code :" + code + "Population:" + population + "capitalCity:" + capitalcity);

		String pmName = req.getParameter("pmName");
		// System.out.println("pmName:" + pmName);

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body bgcolor='lightblue'>");
		printWriter.print("<h1>");

		printWriter.print("Country info......." + "</br>");
		// printWriter.print("<pre>");
		printWriter.print("CountryName:" + name + "</br>");
		printWriter.print("code:" + code + "</br>");
		printWriter.print("population:" + population + "</br>");
		printWriter.print("CapitalCity:" + capitalcity + "</br>");
		// printWriter.print("<pre>");

		printWriter.print("<form method='get' action='PmSend'>");
		printWriter.print("<h3>");
		printWriter.print("Enter Prime Minister Name" + "</br>");

		printWriter.print("<h3 color='blue'>");
		printWriter.print("PM Name :<input type='text' name='pmName'>" + "</br>");
		printWriter.print("  <input type='submit' value='send'");
		printWriter.print("PMName:" + pmName + "</br>");

		printWriter.print("</form>");

		printWriter.print("<h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");
	}

}
