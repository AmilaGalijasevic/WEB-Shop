package BO;

import java.sql.SQLException;
import java.util.ArrayList;

import DAO.ProductDao;
import DAO.ProductImpl;
import DTO.Color;

public class ProductBOImpl implements ProductBO {
	ProductDao prodDao = new ProductImpl();

	@Override
	public ArrayList<Color> listColors() {

		ArrayList<Color> list = new ArrayList<>();

		try {
			list = prodDao.listColors();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Color> searchProducts(String name) {
		ArrayList<Color> colors = new ArrayList<>();

		if (name.length() > 0) {

			try {
				colors = prodDao.searchProducts(name);

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

		return colors;
	}

	@Override
	public ArrayList<Color> listColorCans() {
		ArrayList<Color> list = new ArrayList<>();

		try {
			list = prodDao.listColorCans();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Color> listColorSrays() {
		ArrayList<Color> list = new ArrayList<>();

		try {
			list = prodDao.listColorSrays();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addColor(Color color) {
		if (color != null) {
			try {
				prodDao.addColor(color);
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			return false;
		}
		return false;
	}

	@Override
	public boolean deleteColor(int idcolor) {
		if (idcolor != 0) {

			try {
				prodDao.deleteColor(idcolor);

				return true;
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean editColor(Color color) {
		if (color != null) {

			try {
				prodDao.editColor(color);
				return true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}
		return false;
	}

	@Override
	public Color searchById(int id) {
		Color col = null;
		if(id > 0){
			
			try {
				col = prodDao.searchById(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return col;
	}

}
