package org.inheritance.java.shop;

class Smartphone extends Prodotto {
	// codice IMEI dichiarato come costante, mentre la memoria sarà modificabile
	final private String IMEI;
	private short memory;

	public Smartphone(String name, String description, double price, double tax, short memory) {
		super(name, description, price, tax);
		/**
		 * L'IMEI è inizializzato richiamando la funzione dedicata
		 */
		this.IMEI = createIMEI();
		/**
		 * La memoria è espressa in numero di GB
		 */
		this.memory = memory;
	}
	
	/**
	 * Metodo che restituisce un codice IMEI generato casualmente (semplificazione),
	 * Un codice IMEI odierno è un numerico formato da 4 parti nel formato AA-BBBBBB-CCCCCC-D, 
	 * 
	 * @return
	 */
	public String createIMEI() {
		int part1;
		int part2;
		int part3;
		int part4;
		part1 = (int) (Math.random() * 100);
		part2 = (int) (Math.random() * 100000);
		part3 = (int) (Math.random() * 1000000);
		part4 = (int) (Math.random() * 10);	
		return String.format("%02d%05d%06d%d", part1, part2, part3, part4);
	}

	// getters e setters
	public String getIMEI() {
		return this.IMEI;
	}

	public short getMemory() {
		return this.memory;
	}

	public void setMemory(short newMemory) {
		this.memory = newMemory;
	}
	
	@Override
	public String toString() {
		return String.format("\nTIPO: %s \nNOME: %s \nDESCRIZIONE: %s \nPREZZO(comprensivo di iva): %s \nMEMORIA: %d GB \nCODICE IMEI: %s",
				 "Smartphone", getName(), getDescription(), getFullPrice(), this.memory, this.IMEI);
	}
}
