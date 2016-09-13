package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.CartBOImpl;
import BO.ProductBOImpl;
import DTO.Color;
import DTO.User;

/**
 * Servlet implementation class PurchaseServlet
 */
@WebServlet("/purchase")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PurchaseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = (User) request.getSession().getAttribute("user");
		request.getSession().getAttribute("list");

		CartBOImpl cartBo = new CartBOImpl();

		ArrayList<Color> listp = (ArrayList<Color>) request.getSession().getAttribute("listp");
		Color c = null;
		for (int i = 0; i < listp.size(); i++) {
			c = listp.get(i);
			cartBo.addToCart(user.getIdUsers(), c.getIdColors());

		}

		request.setAttribute("message", "Items succesfully purchased");
		request.getSession().invalidate();
		request.getRequestDispatcher("Cart.jsp").forward(request, response);

	}

}
