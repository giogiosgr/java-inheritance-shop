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

	// il setter e il getter per isWireless formano un overload
	boolean isWireless() {
		return this.isWireless;
	}

	void isWireless(boolean wireless) {
		this.isWireless = wireless;
	}
}
