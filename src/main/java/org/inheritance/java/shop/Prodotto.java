package org.inheritance.java.shop;

class Prodotto {
	final protected int CODE;
	private String name;
	private String description;
	private double price;
	private double tax;
	
    public Prodotto(String name, String description, double price, double tax) {
    	// numero random compreso tra 1 e 99999999
    	this.CODE = 1 + (int) (Math.random() * 99999999);
    	this.name = name;
    	this.description = description;
    	this.price = price;
    	this.tax = tax;
    }
    	
	//definizione vari getters e setters
    public double getPrice() {
    	return this.price;	
    }
    
    public void setPrice(double newPrice) {
    	this.price = newPrice;	
    }
    	
    /**
     * Restituzione del prezzo come stringa, comprensivo di IVA, troncato a due decimali
     * 
     * @return String
     */
  	public String getFullPrice () {
  		double temp = this.price + (this.price * (this.tax / 100));
  		return String.format("%.2f€", temp); 
  	}
  	
  	public String getFullName () {
  		return CODE + "-" + name;
  	}
  	
  	public String getName() {
  		return this.name;
  	}
  	
  	public void setName(String newName) {
  		this.name = newName;
  	}
  	
  	public String getDescription() {
  		return this.description;
  	}
  	
  	public void setDescription(String newDescription) {
  		this.description = newDescription;
  	}

	public double getTax () {
		return this.tax;
	}

	public void setTax (double newTax) {
		this.tax = newTax;
	}
  	
    public int getCode() {
    	return this.CODE;
    }
  	
    /**
     * Conversione in stringa del codice, con padding di zeri a sinistra
     * 
     * @param code
     * @return String
     */
    public static String getPaddedCode(int code) {
        return String.format("%08d", code);
    }
}

