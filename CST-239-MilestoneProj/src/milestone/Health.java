package milestone;

public class Health extends Item {

	private String type;
	
	public Health(String name, String desc, double price, int quantity, String type) {
		super(name, desc, price, quantity);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
