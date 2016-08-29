package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import DTO.Color;



public class CartImpl implements CartDao {
	Connection connection = ConnManager.getInstance().getConnection();

	@Override
	public boolean addToCart(Color color, int iduser) throws SQLException {
	Date date = new Date();
		String query = "insert into color_shop.cart (iduser, idcolor, date) values (?,?,?)";

		PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1,iduser );
			statement.setInt(2, color.getIdColors());
			statement.setDate(3, (java.sql.Date) date );

			statement.executeUpdate();

		
		
		return true;
	}

	@Override
	public boolean removeFromCart( int idcart) throws SQLException {
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
