// Raika Roy Choudhury, APCS Peterson P2
// Programming Project #10; 13 March 2022
//
// This class stores information about the overall order 

import java.util.*;

public class ShoppingCart {
	private ArrayList<ItemOrder> itemorders;
	private boolean discount;
	
	// Constructor
	public ShoppingCart() { 
		this.itemorders = new ArrayList<ItemOrder>();
		this.discount = false;
	}
	
	// this method keeps track of and adds Items to the shopping cart
	public void add(ItemOrder itemorder) { 
		String itemname1 = itemorder.getItem().toString().split(",")[0];
		for (int i = 0; i < this.itemorders.size(); i++) {
			String itemname2 = this.itemorders.get(i).getItem().toString().split(",")[0];
			System.out.println(itemname1 + " " + itemname2);
			if (itemname1.compareTo(itemname2) == 0) {
				this.itemorders.remove(i);
				break;
			} 
		}
		this.itemorders.add(itemorder);
	}
	
	// this method sets up the discount (made separately for ease of use)
	public void setDiscount(boolean value) { 
		if (value) {
			this.discount = true;
		} else {
			this.discount = false;
		}
	}
	
	// this method gets the total price of the order
	public double getTotal() { 
		double totalprice = 0.0;
		for (int i = 0; i < this.itemorders.size(); i++) {
			totalprice += this.itemorders.get(i).getPrice();
		}
		if (this.discount) {
			return totalprice * 0.9;
		}
		return totalprice;
	}
}
