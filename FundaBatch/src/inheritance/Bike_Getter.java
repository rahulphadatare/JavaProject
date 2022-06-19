package inheritance;

public class Bike_Getter {
	int price;
	String colour, brand, milage;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMilage() {
		return milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}

	void gear()
	{
		System.out.println("4 gears");
	}
	
	void seats()
	{
		System.out.println("2 seats");
	}
}
