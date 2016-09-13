package DTO;

import java.util.HashMap;

public class Cart {
	HashMap<Color, Integer> cart;

	public Cart() {
		cart = new HashMap<>();
	}

	public HashMap<Color, Integer> getCart() {
		return cart;
	}

	public void setCart(HashMap<Color, Integer> cart) {
		this.cart = cart;
	}

	public void addToCart(Color color, int productId) {
		cart.put(color, productId);
	}

	@Override
	public String toString() {
		return "Cart [cart=" + cart + "]";
	}
	

}
