package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Color;

public interface ProductDao {

	public ArrayList<Color> listColors() throws SQLException;

	public ArrayList<Color> searchProducts(String name) throws SQLException;

	public Color searchById(int id) throws SQLException;

	public ArrayList<Color> listColorCans() throws SQLException;

	public ArrayList<Color> listColorSrays() throws SQLException;

	public boolean addColor(Color color) throws SQLException;

	public boolean deleteColor(int colorid) throws SQLException;

	public boolean editColor(Color color) throws SQLException;

}
