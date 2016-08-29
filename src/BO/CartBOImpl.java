package BO;

import java.sql.SQLException;

import DAO.CartImpl;
import DTO.Color;

public class CartBOImpl implements CartBO {
	CartImpl cart = new CartImpl();

	@Override
	public boolean addToCart(Color color, int iduser)  {
		if (color != null && iduser != 0) {
			try {
			cart.addToCart(color, iduser);
			return true;
			} catch (Exception e) {
				// TODO: handle exception
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
