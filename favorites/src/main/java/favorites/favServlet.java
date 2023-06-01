package favorites;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class favServlet extends HttpServlet {

	public favServlet() {
		System.out.println("creating no arg constructor using favServlet...........");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running post method");

		req.setAttribute("food", req.getParameter("fFood"));
		req.setAttribute("place", req.getParameter("fPlace"));
		req.setAttribute("person", req.getParameter("fPerson"));

		String laptops[] = { "hp", "dell", "Asus" };
		req.setAttribute("laptop1", laptops[0]);
		req.setAttribute("laptop2", laptops[1]);
		req.setAttribute("laptop3", laptops[2]);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("display.jsp");
		requestDispatcher.forward(req, resp);
	}

}
