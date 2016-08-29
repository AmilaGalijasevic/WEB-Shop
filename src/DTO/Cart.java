package DTO;

import java.util.Date;

public class Cart {
	private int idCart;
	private int idUser;
	private int idColor;
	private Date date;
	
	
	public Cart(int idCart, int idUser, int idColor, Date date) {
		super();
		this.idCart = idCart;
		this.idUser = idUser;
		this.idColor = idColor;
		this.date = date;
	}


	public Cart() {
		super();
	}


	public int getIdCart() {
		return idCart;
	}


	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public int getIdColor() {
		return idColor;
	}


	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
