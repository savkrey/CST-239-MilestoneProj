package milestone;
import java.util.Scanner;
/**
 * This is the main driver class that will be the "store front" part of the milestone
 * @author skrey
 *
 */
public class Store {

	static int menuChoice;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// welcome message
		System.out.println("Hello! Welcome to the storefront for my store - All You Need for Battle!");
		menu();
		readUserInput();
		action(menuChoice);
	}
/**
 * reads whatever the user enters and makes sure that it is a proper answer
 * @return integer called menuChoice
 */
	private static int readUserInput()
	{ 
		boolean isSuccessful = false;
		while (isSuccessful == false)
		{
			try
			{
				menuChoice = Integer.parseInt(userInput.nextLine());
				if (menuChoice > 0 && menuChoice < 5)
				{
					isSuccessful = true;
				}
				else if (menuChoice == 5)
				{
					System.exit(5);
				}
				else
				{
					System.out.println("Only enter the number choices given. Please try again.");
					System.out.println();
				}
			}
			catch (Exception e)
			{
				System.out.println("Please only enter numbers. Try again.");
				System.out.println();
			}
			
		}
		return menuChoice;
		
	}
	
	/**
	 * takes in what the user entered and follows a switch statement that carries out the corresponding number
	 * @param choice
	 */
	private static void action(int choice) {

		switch (choice)
		{
			case 1:
				showInventory();
				System.out.println();
				menu();
				readUserInput();
				action(menuChoice);
				
			case 2:
				addToCart();
				System.out.println();
				menu();
				readUserInput();
				action(menuChoice);
				
			case 3:
				returnItem();
				System.out.println();
				menu();
				readUserInput();
				action(menuChoice);
				
			case 4:
				checkout();
				System.out.println();
				menu();
				readUserInput();
				action(menuChoice);
		
			//case 5:
				//System.exit(5);
		}
	}

/**
 * menu method that simply shows the users the available options
 */
	public static void menu() {
		
		// show list of commands for application
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Please enter the number that corresponds with how you want to proceed");
		System.out.println();
		System.out.println("(1) view inventory");
		System.out.println("(2) add to cart");
		System.out.println("(3) return an item");
		System.out.println("(4) checkout");
		System.out.println("(5) quit");
	}
	
	/**
	 * showInventory method that outputs what is in our inventory
	 */
	public static void showInventory() {
		
		// show what is in inventory
		
		Inventory inventory = new Inventory();
		inventory.showList();
	}
	
	/**
	 * returnItem method that will remove an item from cart and add it back to inventory
	 */
	public static void returnItem() {
		
		// return an item
		System.out.println("in the returnItem() method");

	}
	
	/**
	 * checkout method that will total up all items in the cart and end the program
	 */
	public static void checkout() {
		
		// purchase an item(s)
		System.out.println("in the checkout() method");

	}
	
	/**
	 * addToCart method that will add an item into the shopping cart and take it out of inventory
	 */
	public static void addToCart() {
		
		// add item to cart
		System.out.println("in the addToCart() method");

	}
}
