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

	void setInches(short newInches) {
		this.inches = newInches;
	}

	// il setter per la proprietà isSmart è un overload del metodo getter
	boolean isSmart() {
		return this.isSmart;
	}

	void isSmart(boolean smart) {
		this.isSmart = smart;
	}
}
