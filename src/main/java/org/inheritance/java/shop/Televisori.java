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

	// il setter e il getter per isSmart formano un overload
	boolean isSmart() {
		return this.isSmart;
	}

	void isSmart(boolean smart) {
		this.isSmart = smart;
	}
}
