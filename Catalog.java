// Raika Roy Choudhury, APCS Peterson P2
// Programming Project #10; 13 March 2022
//
// This class stores information about collections of Item objects using ArrayList

import java.util.*;

public class Catalog {
	private String name;
	private ArrayList<Item> items;
	
	// Constructor
	public Catalog(String name) { 
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	/* Accessor methods: */
	// returns catalog name
	public String getName() { 
		return this.name;
	}
	// adds an item to the catalog
	public void add(Item item) { 
		this.items.add(item);
	}
	// returns the catalog size
	public int size() { 
		return this.items.size();
	}
	// returns item at given index
	public Item get(int index) throws IndexOutOfBoundsException { 
		return this.items.get(index);
	}
}
