package org.inheritance.java.shop;

class Televisori extends Prodotto {
	private short inches;
	private boolean isSmart;

	public Televisori(String name, String description, double price, double tax, short inches, boolean isSmart) {
		super(name, description, price, tax);
		this.inches = inches;
		this.isSmart = isSmart;
	}

	// getters e setters
	public short getInches() {
		return this.inches;
	}

	public void setInches(short newInches) {
		this.inches = newInches;
	}

	/**
	 * Metodo in overload,
	 * restituisce lo stato di isSmart
	 * 
	 * @return true/false di isSmart
	 */
	public boolean isSmart() {
		return this.isSmart;
	}
    
	/**
	 * Metodo in overload,
	 * setta lo stato di isSMart
	 * 
	 * @param smart true/false di isSmart
	 */
	public void isSmart(boolean smart) {
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
				 type, getName(), getDescription(), getFullPrice(), this.inches);
	}
}
