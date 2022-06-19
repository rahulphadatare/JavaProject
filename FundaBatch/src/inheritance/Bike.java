package inheritance;

public class Bike {
	int price;
	String colour, brand, milage;
	
	void setBikedata(int price, String colour, String milage, String brand)
	{
		this.price=price;
		this.colour=colour;
		this.milage=milage;
		this.brand=brand;
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
