package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import DTO.Cart;
import DTO.Color;

public class CartImpl implements CartDao {
	Connection connection = ConnManager.getInstance().getConnection();
	Cart cart = new Cart();

	@Override
	public boolean addToCart(int userId,  int productId) throws SQLException {

		String query = "insert into color_shop.cart (iduser, idcolor) values (?,?)";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, userId);
		statement.setInt(2, productId);

		statement.executeUpdate();

		return true;
	}

	@Override
	public boolean removeFromCart(int idcart) throws SQLException {
		String query = "DELETE FROM color_shop cart  WHERE idcolor = ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setInt(1, idcart);

		statement.executeUpdate();

		return true;
	}

	@Override
	public boolean deleteCart(int idcart) throws SQLException {
		String query = "DELETE FROM color_shop cart  WHERE idcart = ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setInt(1, idcart);

		statement.executeUpdate();

		return true;
	}

}
