package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.CartBOImpl;
import BO.ProductBOImpl;
import DAO.ProductImpl;
import DTO.Cart;
import DTO.Color;
import DTO.User;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToCartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = (User) req.getSession().getAttribute("user");
		
		ProductBOImpl product = new ProductBOImpl();
		
		int colorId = Integer.parseInt(req.getParameter("id"));

		Color color = product.searchById(colorId);

		CartBOImpl cartBO = new CartBOImpl();
		
		if (cartBO.addToCart(color, user.getIdUsers())) {

			req.getRequestDispatcher("Cart.jsp").forward(req, resp);

		} else {
			req.getRequestDispatcher("Home.jsp").forward(req, resp);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
