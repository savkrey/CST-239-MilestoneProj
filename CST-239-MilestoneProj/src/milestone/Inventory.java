package milestone;

import java.util.ArrayList;
import java.util.List;
/**
 * the inventory class houses the products in stock and puts them all in an array list
 * @author skrey
 *
 */
public class Inventory {
	// declare array list
	List<Item> inventoryList = new ArrayList<>();

	// the store will call on this class to show what is available in the inventory
	public void showList() {
		
		// create three base items
		Weapon whip = new Weapon("whip", "a real game changer when you use it right", 50.84, 1, 10);		
		Weapon sword = new Weapon("sword", "basically a big handheld knife", 62.25, 1, 15);
		Armor helmet = new Armor("helmet", "protect your most valuable body part", 45.26, 1, "silver");
		Armor chestPlate = new Armor("chest plate", "protect your heart", 38.47, 1, "bronze");
		Health extraLife = new Health("extra life", "keep playing one more time!", 15.00, 1, "life");

		
		// add to list
		inventoryList.add(whip);
		inventoryList.add(sword);
		inventoryList.add(helmet);
		inventoryList.add(chestPlate);
		inventoryList.add(extraLife);

		
		
		
		for (Item inventory: inventoryList) {
			System.out.println("Name: " + inventory.getName() + " Description: " + inventory.getDesc() + 
					" Price: " + inventory.getPrice() + " Quantity: " + inventory.getQuantity());
		}
		
		
	}
	
	
	
	

	
	
}
