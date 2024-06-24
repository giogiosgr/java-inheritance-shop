package org.inheritance.java.shop;

class Cuffie extends Prodotto {
	private String color;
	private boolean isWireless;

	public Cuffie(String name, String description, double price, double tax, String color, boolean isWireless) {
		super(name, description, price, tax);
		this.color = color;
		this.isWireless = isWireless;
	}

	// getters e setters
	public String getColor() {
		return this.color;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	/**
	 * Metodo in overload,
	 * restituisce lo stato di isWireless
	 * 
	 * @return true/false di isWireless
	 */
	public boolean isWireless() {
		return this.isWireless;
	}

	/**
	 * Metodo in overload,
	 * setta lo stato di isWireless
	 * 
	 * @param wireless true/false di isWireless
	 */
	public void isWireless(boolean wireless) {
		this.isWireless = wireless;
	}
	
	@Override
	public String toString() {
		String type;
		if (isWireless) {
			type = "Cuffie senza filo";
		} else {
			type = "Cuffie con filo";
		}
		return String.format("\nTIPO: %s \nNOME: %s \nDESCRIZIONE: %s \nPREZZO(comprensivo di iva): %s \nCOLORE: %s",
				 type, getName(), getDescription(), getFullPrice(), this.color);
	}
}
