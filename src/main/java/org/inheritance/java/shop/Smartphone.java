package org.inheritance.java.shop;

class Smartphone extends Prodotto {
	//codice IMEI dichiarato come costante, mentre la memoria sarà modificabile
    final private String IMEI;
	private short memory;

	Smartphone(String name, String description, double price, int tax, String IMEI, short memory) {
		super(name, description, price, tax);
		this.IMEI = IMEI;
		this.memory = memory;
	}

    //getters e setters
    String getIMEI() {
		return this.IMEI;
	}

	short getMemory () {
		return this.memory;
	}

	void setMemory(short newMemory) {
		this.memory = newMemory;
	}
}
