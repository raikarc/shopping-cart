// Raika Roy Choudhury, APCS Peterson P2
// Programming Project #10; 13 March 2022
//
// This class stores information about individual Item objects and takes into account bulk price, quantity, etc.

import java.text.*;

public class Item {
	private String name;
	private double price;
	private int bulkquantity;
	private double bulkprice;
	
	// Constructor with Bulk
	public Item(String name, double price, int bulkquantity, double bulkprice) throws IllegalArgumentException { 
		if (price < 0 || bulkquantity <= 0 || bulkprice <= 0) {
			throw new IllegalArgumentException("price cannot be negative");
		}
		this.name = name;
		this.price = price;
		this.bulkquantity = bulkquantity;
		this.bulkprice = bulkprice;
	}
		
	// Constructor (overload) without Bulk
	public Item(String name, double price) throws IllegalArgumentException { 
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.name = name;
		this.price = price;
		this.bulkquantity = 0;
		this.bulkprice = 0;
	}
	
	// Accessor methods to return values of private ints
	private String getName() { 
		return this.name;
	}
	
	private double getPrice() { 
		return this.price;
	}
	
	private int getBulkQuantity() { 
		return this.bulkquantity;
	}
	
	private double getBulkPrice() { 
		return this.bulkprice;
	}
	// ^
	
	// this method finds and adds the price of a given item (including bulk discount)
	public double priceFor(int quantity) throws IllegalArgumentException { 
		if (quantity < 0) {
			throw new IllegalArgumentException("Item quantity cannot be negative");
		} else if (quantity == 0) {
			return 0.0;
		}
		double totalprice = 0.0;
		if (this.getBulkPrice() != 0) {
			while (quantity >= this.getBulkQuantity()) {
				totalprice += this.getBulkPrice();
				quantity -= this.getBulkQuantity();
			}
		}
		totalprice += quantity * this.getPrice();
		return totalprice;
	}
	
	// toString overriden; formats data into a String
	public String toString() { 
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String resp = this.getName() + ", " + nf.format(this.getPrice());
		if (this.getBulkPrice() != 0) {
			resp += " (" + this.getBulkQuantity() + " for " + nf.format(this.getBulkPrice());
		}
		return resp;
	}
}
