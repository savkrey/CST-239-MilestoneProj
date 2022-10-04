package milestone;

/**
 * the item class is the base class for each item/product that will be available in the store front
 * @author skrey
 *
 */
public class Item {

	
	private String name;
	private String desc;
	private double price;
	private int quantity;
	
	// parameterized constructor
	public Item(String name, String desc, double price, int quantity) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
