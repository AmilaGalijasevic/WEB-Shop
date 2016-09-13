package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSeparatorUI;

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

	/**
	 * 
	 */
	private static final long serialVersionUID = -635208441017438737L;

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
		req.getSession().getAttribute("list");
		String[] values = req.getParameterValues("name");

		ProductBOImpl colorBo = new ProductBOImpl();

		ArrayList<Color> listp = (ArrayList<Color>) req.getSession().getAttribute("listp");

		for (int i = 0; i < values.length; i++) {
	
			listp.addAll(colorBo.searchProducts(values[i]));
		}

		req.setAttribute("message", "Item/s added to the cart");

		req.getSession().setAttribute("listp", listp);
		req.getSession().setAttribute("user", user);
		req.getRequestDispatcher("Cart.jsp").forward(req, resp);

	}

}
