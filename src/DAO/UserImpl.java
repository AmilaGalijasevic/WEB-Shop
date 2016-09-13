package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.User;

public class UserImpl implements UserDao {

	Connection connection = ConnManager.getInstance().getConnection();

	@Override
	public User validateUser(String email, String pass) throws SQLException {

		User user = null;

		String query = "SELECT * FROM color_shop.users WHERE email=? and password=?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, email);
		statement.setString(2, pass);

		try (ResultSet rs = statement.executeQuery()) {

			while (rs.next()) {
				user = new User();
				user.setIdUsers(rs.getInt(1));
				user.setName(rs.getString("name"));
				user.setLastname(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));

			}
		}
		return user;
	}

	@Override
	public boolean addUser(User user) throws SQLException {

		String query = "INSERT INTO color_shop.users(name, lastname, email, password, role) VALUES (?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, user.getName());
		statement.setString(2, user.getLastname());
		statement.setString(3, user.getEmail());
		statement.setString(4, user.getPassword());
		statement.setString(5, user.getRole());

		statement.executeUpdate();

		return true;
	}

	@Override
	public boolean deleteUser(String email, String pass) throws SQLException {

		String query = "DELETE FROM color_shop.users where email = ? AND password = ?";

		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, email);
		statement.setString(2, pass);

		statement.executeUpdate();

		return false;
	}

}