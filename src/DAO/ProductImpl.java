package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Color;

public class ProductImpl implements ProductDao {

	Connection connection = ConnManager.getInstance().getConnection();
	ArrayList<Color> colors = new ArrayList<>();

	@Override
	public ArrayList<Color> listColors() throws SQLException{

		Color color = null;

		String query = "SELECT * FROM color_shop.colors;";

		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			rs = statement.executeQuery();

			while (rs.next()) {
				color = new Color();
				color.setIdColors(rs.getInt(1));
				color.setType(rs.getString("type"));
				color.setName(rs.getString("name"));
				color.setColor(rs.getString("color"));

				colors.add(color);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return colors;
	}

	@Override
	public ArrayList<Color> searchProducts(String name) throws SQLException {
		ArrayList<Color> searchColors = new ArrayList<>();
		Color color = null;
		String query = "SELECT * FROM color_shop.colors WHERE name LIKE ? OR type LIKE ?";
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, "%" + name + "%");
			statement.setString(2, "%" + name + "%");
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				color = new Color();
				color.setIdColors(rs.getInt(1));
				color.setType(rs.getString("type"));
				color.setName(rs.getString("name"));
				color.setColor(rs.getString("color"));

				searchColors.add(color);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return searchColors;
	}

	@Override
	public ArrayList<Color> listColorCans() throws SQLException{

		ArrayList<Color> searchCans = new ArrayList<>();
		Color color = null;
		String query = "SELECT * FROM color_shop.colors WHERE type = 'can';";
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				color = new Color();
				color.setIdColors(rs.getInt(1));
				color.setType(rs.getString("type"));
				color.setName(rs.getString("name"));
				color.setColor(rs.getString("color"));

				searchCans.add(color);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return searchCans;
	}

	@Override
	public ArrayList<Color> listColorSrays() throws SQLException{
		ArrayList<Color> searchSprays = new ArrayList<>();
		Color color = null;
		String query = "SELECT * FROM color_shop.colors WHERE type = 'spray';";
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				color = new Color();
				color.setIdColors(rs.getInt(1));
				color.setType(rs.getString("type"));
				color.setName(rs.getString("name"));
				color.setColor(rs.getString("color"));

				searchSprays.add(color);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return searchSprays;
	}

	@Override
	public boolean addColor(Color color)throws SQLException {

		String query = "INSERT INTO color_shop.colors (type, name, color) VALUES (?,?,?)";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, color.getType());
			statement.setString(2, color.getName());
			statement.setString(3, color.getColor());

			statement.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean deleteColor(int colorid)throws SQLException {

		String query = "DELETE FROM color_shop.colors WHERE idcolors= ?;";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, colorid);

			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean editColor(Color color)throws SQLException {

		String query = "UPDATE color_shop.colors SET name= ?, type = ?, color= ? WHERE idcolors = ? ";

		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, color.getName());
			statement.setString(2, color.getType());
			statement.setString(3, color.getColor());

			statement.setInt(5, color.getIdColors());

			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	public Color searchById(int id) throws SQLException{
		Color color = null;
		String query = "SELECT * FROM color_shop.colors WHERE idcolors = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				color = new Color();
				color.setIdColors(rs.getInt(1));
				color.setType(rs.getString("type"));
				color.setName(rs.getString("name"));
				color.setColor(rs.getString("color"));

				
			}

		

		return color;
		
		
	}

}