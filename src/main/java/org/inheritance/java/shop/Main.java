package org.inheritance.java.shop;

public class Main {

	public static void main(String[] args) {

		// creazione e utilizzo istanza della classe Smartphone
		Smartphone phone = new Smartphone("Azuz", "Nuovissimo", 699.99, 20, "0985-1430-0001-0002", (short) 4);
		System.out.println("Nome completo dello smartphone: " + phone.getFullName());
		System.out.println("Prezzo completo dello smartphone: " + phone.getFullPrice());
		phone.setMemory((short) 8);
		System.out.printf("Memoria dello smartphone: %d GB \n", phone.getMemory());
		System.out.println("Codice IMEI dello smartphone: " + phone.getIMEI());
	}
}
