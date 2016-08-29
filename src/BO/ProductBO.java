package BO;


import java.util.ArrayList;

import DTO.Color;

public interface ProductBO {

	public ArrayList<Color> listColors();

	public ArrayList<Color> searchProducts(String name);
	public Color searchById(int id) ;

	public ArrayList<Color> listColorCans();

	public ArrayList<Color> listColorSrays();

	public boolean addColor(Color color);

	public boolean deleteColor(int idcolor);

	public boolean editColor(Color color);

}
