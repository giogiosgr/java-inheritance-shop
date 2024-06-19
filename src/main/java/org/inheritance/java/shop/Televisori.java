package org.inheritance.java.shop;

public class Televisori extends Prodotto {
	private short inches;
	private boolean isSmart;

	public Televisori(String name, String description, double price, int tax, short inches, boolean isSmart) {
		super(name, description, price, tax);
		this.inches = inches;
	}

	// getters e setters
	short getInches() {
		return this.inches;
	}

	boolean isSmart() {
		return this.isSmart;
	}

	void setInches(short newInches) {
		this.inches = newInches;
	}

	void setIsSmart(boolean smart) {
		this.isSmart = smart;
	}
}
