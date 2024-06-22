package org.inheritance.java.shop;

class Televisori extends Prodotto {
	private short inches;
	private boolean isSmart;

	Televisori(String name, String description, double price, int tax, short inches, boolean isSmart) {
		super(name, description, price, tax);
		this.inches = inches;
		this.isSmart = isSmart;
	}

	// getters e setters
	short getInches() {
		return this.inches;
	}

	void setInches(short newInches) {
		this.inches = newInches;
	}

	/**
	 * Metodo in overload,
	 * restituisce lo stato di isSmart
	 * 
	 * @return true/false di isSmart
	 */
	boolean isSmart() {
		return this.isSmart;
	}
    
	/**
	 * Metodo in overload,
	 * setta lo stato di isSMart
	 * 
	 * @param smart true/false di isSmart
	 */
	void isSmart(boolean smart) {
		this.isSmart = smart;
	}
	
	@Override
	public String toString() {
		String type;
		if (isSmart) {
			type = "Televisore smart";
		} else {
			type = "Televisore non smart";
		}
		return String.format("\nTIPO: %s \nNOME: %s \nDESCRIZIONE: %s \nPREZZO(comprensivo di iva): %s \nPOLLICI: %d",
				 type, this.name, this.description, getFullPrice(), this.inches);
	}
}
