package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.ProductBOImpl;
import DTO.Color;
import DTO.User;

/**
 * Servlet implementation class ProcuctsServlet
 */
@WebServlet("/products")
public class ProcuctsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcuctsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	
			throws ServletException, IOException {
		
		
		User user = (User) request.getSession().getAttribute("user");
		ProductBOImpl product = new ProductBOImpl();

		ArrayList<Color> list = product.listColors();

		
		request.setAttribute("list", list);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("List.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
	}


