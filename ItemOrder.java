// Raika Roy Choudhury, APCS Peterson P2
// Programming Project #10; 13 March 2022
//
// This class that stores information about a particular Item and the quantity ordered for it

public class ItemOrder {
	private Item item;
	private int quantity;
	
	// Constructor
	public ItemOrder(Item item, int quantity) { 
		System.out.println("itemorder " + item.toString() + " quantity " + quantity);
		this.item = item;
		this.quantity = quantity;
	}
	
	// this method returns the price
	public double getPrice() { 
		return this.item.priceFor(this.quantity);
	}
	
	// retrieves Item from the item order
	public Item getItem() { 
		return this.item;
	}
}
