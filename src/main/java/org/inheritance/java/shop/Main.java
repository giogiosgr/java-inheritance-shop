package org.inheritance.java.shop;

public class Main {

	public static void main(String[] args) {

		// creazione e utilizzo istanza della classe Smartphone
		Smartphone phone = new Smartphone("Azuz", "Nuovissimo", 699.99, 20, "0985-1430-0001-0002", (short) 4);
		System.out.println("Caratteristiche dello smartphone");
		System.out.println("Nome completo dello smartphone: " + phone.getFullName());
		System.out.println("Prezzo completo dello smartphone: " + phone.getFullPrice());
		phone.setMemory((short) 8);
		System.out.printf("Memoria dello smartphone: %d GB \n", phone.getMemory());
		System.out.println("Codice IMEI dello smartphone: " + phone.getIMEI());

		// creazione e utilizzo istanza della classe Televisori
		Televisori tv = new Televisori("PENASONIC", "Top di gamma", 3499, 20, (short) 75, false);
		System.out.println("\nCaratteristiche del televisore");
		System.out.println("Nome completo del televisore: " + tv.getFullName());
		System.out.println("Prezzo completo del televisore: " + tv.getFullPrice());
		tv.setInches((short) 65);
		System.out.printf("Dimensione del televisore: %s pollici \n", tv.getInches());
		tv.isSmart(true);
		if (tv.isSmart()) {
			System.out.println("Questo televisore è uno smart TV");
		} else {
			System.out.println("Questo televisore non è uno smart TV");
		}

		// creazione e utilizzo istanza della classe Cuffie
		Cuffie headphones = new Cuffie("Phony", "Bassi potenti", 180.50, 15, "Viola", true);
		System.out.println("\nCaratteristiche delle cuffie");
		System.out.println("Nome completo delle cuffie: " + headphones.getFullName());
		System.out.println("Prezzo completo delle cuffie: " + headphones.getFullPrice());
		headphones.setColor("Blu");
		System.out.println("Colore delle cuffie: " + headphones.getColor());
		headphones.isWireless(false);
		if (headphones.isWireless) {
			System.out.println("Questo modello di cuffie è senza filo");
		} else {
			System.out.println("Questo modello di cuffie è con filo");
		}
	}
}
