package BO;

import java.sql.SQLException;

import DAO.CartImpl;

public class CartBOImpl implements CartBO {
	CartImpl cart = new CartImpl();

	@Override
	public boolean addToCart(int userId, int productId)   {
		
		if ( productId > 0) {
			try {
				cart.addToCart(userId, productId);
				System.out.println(cart.addToCart(userId, productId));
			
			return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean removeFromCart(int cartid)  {
		if (cartid != 0) {
			try {
			cart.removeFromCart(cartid);
			return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteCart(int idcart)  {
		if (idcart != 0) {
			try {
			cart.deleteCart(idcart);
			return true;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return false;
	}

}
