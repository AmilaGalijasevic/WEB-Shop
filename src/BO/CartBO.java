package BO;

import java.sql.SQLException;

import DTO.Color;

public interface CartBO {
	
	public boolean addToCart(int userId, int productId) throws SQLException;

	public boolean removeFromCart(int cartid) throws SQLException;

	public boolean deleteCart(int idcart) throws SQLException;


}
