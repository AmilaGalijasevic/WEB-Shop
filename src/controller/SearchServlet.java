package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.ProductBOImpl;
import BO.UserImpl;
import DTO.Color;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("search");
		ProductBOImpl product = new ProductBOImpl();
		
		ArrayList<Color> list =product.searchProducts(name);

		request.getSession().setAttribute("product", product);
		request.setAttribute("list", list);
		request.getRequestDispatcher("List.jsp").forward(request, response);
	}

	
}
