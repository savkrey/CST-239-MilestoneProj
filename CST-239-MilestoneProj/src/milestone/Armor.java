package milestone;

public class Armor extends Item {

	private String metalType;
	
	public String getMetalType() {
		return metalType;
	}

	public void setMetalType(String metalType) {
		this.metalType = metalType;
	}

	public Armor(String name, String desc, double price, int quantity, String metalType) {
		super(name, desc, price, quantity);
		this.metalType = metalType;
	}

}
