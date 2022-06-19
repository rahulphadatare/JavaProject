package abstraction;

public abstract class Car_Innova extends Car {

	void noOfSeats() {
		System.out.println("no of seats 7");
	}
	void speed()
	{
		System.out.println("180 km/hr");
	}
	void engine()
	{
		System.out.println("2400 cc");
	}
	
	public String toString()
	{
		return "Innova "+brand+" "+price;
	}
	
}
