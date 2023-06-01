package jayanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/PmSend"))
public class PMServlet extends HttpServlet {

	public PMServlet() {
		System.out.println("no-arg const... using PMServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet..........PMServlet");

		req.getRequestURL();
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String pmName = req.getParameter("pmName");

		System.out.println("pmName:" + pmName);
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.print("pm info" + "</br>");
		printWriter.print("PMName:" + pmName);
		printWriter.print("<h1>");

		printWriter.print("<body>");

		printWriter.print("<html>");

	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Server created");
		super.service(arg0, arg1);
	}
}
