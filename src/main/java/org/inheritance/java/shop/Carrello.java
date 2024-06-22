package org.inheritance.java.shop;

class Carrello {
	
	public static void main(String[] args) {
		
	
	Prodotto[] prodotti = new Prodotto[0];
		
	prodotti = addProduct(prodotti, new Televisori("Ranasonic", "Top di gamma", 3499, 20, (short) 75, false));
	
	
	for (int i = 0; i < prodotti.length; i++) {
		System.out.println(prodotti[i].toString());
		
	}
    
		
		
	
	}
	
	/**
	 * Metodo per aggiungere un nuovo prodotto, con restituzione di un nuovo array di lunghezza n+1
	 * 
	 * @param oldProdotti
	 * @param newProdotto
	 * @return
	 */
	static Prodotto[] addProduct(Prodotto[] oldProdotti, Prodotto newProdotto) {
		Prodotto[] newProdotti = new Prodotto[oldProdotti.length + 1];
		for (int i = 0; i < newProdotti.length - 1; i++) {
			newProdotti[i] = oldProdotti[i];
		}
		newProdotti[oldProdotti.length] = newProdotto;
		return newProdotti;	
	}
	
}
