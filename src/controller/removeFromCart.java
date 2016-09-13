package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.Color;
import DTO.User;

/**
 * Servlet implementation class removeFromCart
 */
@WebServlet("/removeFromCart")
public class removeFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeFromCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User user = (User) request.getSession().getAttribute("user");
		String[] values = request.getParameterValues("name");
		
		HttpSession session = request.getSession();
		List<Color> colorlist = (List<Color>) session.getAttribute("listp");
		
		for (int i = 0; i <= values.length; i++) {
			
			colorlist.remove(i);
			break;
			
		}

		request.setAttribute("message", "Item/s removed from the cart");

		request.getSession().setAttribute("colorlist", colorlist);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("Cart.jsp").forward(request, response);
	}

}
