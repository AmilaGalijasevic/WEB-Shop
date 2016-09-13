package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BO.UserImpl;
import DTO.Color;
import DTO.User;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/login")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogInServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserImpl u = new UserImpl();

		ArrayList<Color> listp = new ArrayList<>();
		User user = u.validateUser(email, password);

		if (user == null) {
			request.setAttribute("message", "Wrong email or password");
			request.getRequestDispatcher("LogIn.jsp").forward(request, response);

		} else {
			HttpSession session = request.getSession();

			session.setAttribute("listp", listp);
			HttpSession session2 = request.getSession();

			session2.setAttribute("user", user);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
	}
}
