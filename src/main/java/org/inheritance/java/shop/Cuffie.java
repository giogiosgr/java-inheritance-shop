package org.inheritance.java.shop;

class Cuffie extends Prodotto {
	private String color;
	private boolean isWireless;

	Cuffie(String name, String description, double price, int tax, String color, boolean isWireless) {
		super(name, description, price, tax);
		this.color = color;
		this.isWireless = isWireless;
	}

	// getters e setters
	String getColor() {
		return this.color;
	}

	void setColor(String newColor) {
		this.color = newColor;
	}

	/**
	 * Metodo in overload,
	 * restituisce lo stato di isWireless
	 * 
	 * @return true/false di isWireless
	 */
	boolean isWireless() {
		return this.isWireless;
	}

	/**
	 * Metodo in overload,
	 * setta lo stato di isWireless
	 * 
	 * @param wireless true/false di isWireless
	 */
	void isWireless(boolean wireless) {
		this.isWireless = wireless;
	}
}
