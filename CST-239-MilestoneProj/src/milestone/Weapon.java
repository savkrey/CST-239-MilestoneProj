package milestone;

public class Weapon extends Item {

	private int power;
	
	public Weapon(String name, String desc, double price, int quantity, int power) {
		super(name, desc, price, quantity);
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
