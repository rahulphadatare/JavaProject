package abstraction;

public abstract class Car {
	
	int price;
	String brand;
	
	
	void gear()
	{
		System.out.println("5 gears");
	}
	void wheels()
	{
		System.out.println("4 wheels");
	}
	
	abstract void noOfSeats();
	abstract void engine();
	abstract void speed();
	abstract void wheelType();
}
