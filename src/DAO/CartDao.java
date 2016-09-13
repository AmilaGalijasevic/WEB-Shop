package DAO;

import java.sql.SQLException;

import DTO.Color;

public interface CartDao {
	
public boolean addToCart(int userId, int productId) throws SQLException;

public boolean removeFromCart(int cartid) throws SQLException;

public boolean deleteCart(int idcart) throws SQLException;



}
