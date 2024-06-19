package org.inheritance.java.shop;

class Prodotto {
	final private int CODE;
	private String name;
	private String description;
	private double price;
	private double tax;
	
    Prodotto(String name, String description, double price, double tax) {
    	//numero random compreso tra 1 e 99999999
    	this.CODE = 1 + (int) (Math.random() * 99999999);
    	this.name = name;
    	this.description = description;
    	this.price = price;
    	this.tax = tax;
    }
    	
	//definizione vari getters e setters
    double getPrice() {
    	return this.price;	
    }
    
    void setPrice(double newPrice) {
    	this.price = newPrice;	
    }
    	
    //restituzione del prezzo come stringa, comprensivo di IVA, troncato a due decimali
  	String getFullPrice () {
  		double temp = this.price + (this.price * (this.tax / 100));
  		return String.format("%.2f€", temp); 
  	}
  	
  	String getFullName () {
  		return CODE + "-" + name;
  	}
  	
  	String getName() {
  		return this.name;
  	}
  	
  	void setName(String newName) {
  		this.name = newName;
  	}
  	
  	String getDescription() {
  		return this.description;
  	}
  	
  	void setDescription(String newDescription) {
  		this.description = newDescription;
  	}

	double getTax () {
		return this.tax;
	}

	void setTax (double newTax) {
		this.tax = newTax;
	}
  	
    int getCode() {
    	return this.CODE;
    }
  	
    //conversione in stringa del codice, con padding di zeri a sinistra
    static String getPaddedCode(int code) {
        return String.format("%08d", code);
    }
}

