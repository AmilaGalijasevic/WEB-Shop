package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.UserImpl;
import DTO.User;


/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		User user = new User(name, lastname, email, password, role);
		UserImpl userBO = new UserImpl();

		if (userBO.addUser(user)) {

			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("LogIn.jsp").forward(request, response);
		}

		else {
			request.setAttribute("message",
					"Something went wrong, please make sure your mail is correct, password is bigger than 6 digits and try again");
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		}

	}

}
