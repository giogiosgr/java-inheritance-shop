package org.inheritance.java.shop;

import java.util.Scanner;

class Carrello {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        // array dei prodotti
	    Prodotto[] prodotti = new Prodotto[0];
	    // variabili di appoggio per inizializzare le classi
	    String product = "";
	    String name;
	    String description;
	    double price;
	    double tax = 20;
	    Short memory;
	    Short inches;
	    String color;
	    String answer;
	    boolean flag;
	    
	    /**
	     * Ciclo per lo scan delle varie proprietà e creazione degli oggetti di tipo Prodotto,
	     * finisce quando l'utente sceglie di uscire, nell'input posto nella condizione del while.
	     * 
	     * L'unico controllo della validità dell'input avviene nella scelta del tipo prodotto
	     */
        do {
        	do {
        		System.out.println("\nScegli il tipo di prodotto (1-smartphone, 2-televisore, 3-cuffie)");
        	    switch (sc.nextInt()) {
        	        case 1: 
        	        	product = "Smartphone";
        	        	break;
        	        case 2:
        	        	product = "Televisore";
        	        	break;
        	        case 3:
        	        	product = "Cuffie";
        	    }
        	    sc.nextLine();
        	} while (!product.equals("Smartphone") && !product.equals("Televisore") && !product.equals("Cuffie"));
            System.out.printf("\nInserire nome %s: \n", product);
            name = sc.nextLine();
            System.out.printf("\nInserire descrizione %s: \n", product);
            description = sc.nextLine();
            System.out.printf("\nInserire prezzo %s: \n", product);
            price = sc.nextDouble();
            sc.nextLine();
            switch (product) {
                case "Smartphone":
                	System.out.println("\nInserire la memoria in GB dello smartphone");
                	memory = sc.nextShort();
                	sc.nextLine();
                	prodotti = addProduct(prodotti, new Smartphone(name, description, price, tax, memory));
                	break;
                case "Televisore":
                	System.out.println("\nInserire la dimensione in pollici del televisore:");
                	inches = sc.nextShort();
                	sc.nextLine();
                	System.out.println("\nScegliere se il televisore è Smart (s/n)");
                	answer = sc.nextLine();
                	if (answer.toLowerCase().equals("s")) {
                		flag = true;
                	} else {
                		flag = false;
                	}
                	prodotti = addProduct(prodotti, new Televisori(name, description, price, tax, inches, flag));
                	break;	
                case "Cuffie":
                	System.out.println("\nInserire il colore delle cuffie");
                	color = sc.nextLine();
                	System.out.println("\nScegliere se le cuffie sono Wireless (s/n)");
                	answer = sc.nextLine();
                	if (answer.toLowerCase().equals("s")) {
                		flag = true;
                	} else {
                		flag = false;
                	}
                	prodotti = addProduct(prodotti, new Cuffie(name, description, price, tax, color, flag));
            }
            System.out.println("\nVuoi inserire un altro prodotto? (s/n)");  
            answer = sc.nextLine();
        } while (answer.toLowerCase().equals("s"));  	    
        
        sc.close();
	
	    /* sotto commento, prodotti istanziati manualmente per test
	    prodotti = addProduct(prodotti, new Televisori("Ranasonic", "Top di gamma", 3499, 20, (short) 75, true));
	    prodotti = addProduct(prodotti, new Smartphone("Azuz", "Nuovissimo", 699.99, 20, (short) 4));
	    prodotti = addProduct(prodotti, new Cuffie("Phony", "Bassi potenti", 180.50, 15, "Viola", false));
	    */
	    
        System.out.println("\n---- CARRELLO PRODOTTI ----\n");
        /**
         * Ciclo per la stampa dell'array dei prodotti, 
         * richiamando implicitamente l'Override del metodo toString() dell'oggetto
         */
	    for (int i = 0; i < prodotti.length; i++) {
	    	System.out.printf("%d° prodotto del carrello: %s \n\n", i+1, prodotti[i]);
    	}
	}
	
	/**
	 * Metodo per aggiungere un nuovo prodotto, con restituzione di un nuovo array di lunghezza n+1
	 * 
	 * @param oldProdotti array di istanze della classe Prodotto
	 * @param newProdotto nuova istanza di prodotto
	 * @return Array di Prodotto con aggiunta la nuova istanza
	 */
	public static Prodotto[] addProduct(Prodotto[] oldProdotti, Prodotto newProdotto) {
		Prodotto[] newProdotti = new Prodotto[oldProdotti.length + 1];
		for (int i = 0; i < newProdotti.length - 1; i++) {
			newProdotti[i] = oldProdotti[i];
		}
		newProdotti[oldProdotti.length] = newProdotto;
		return newProdotti;	
	}
	
}
