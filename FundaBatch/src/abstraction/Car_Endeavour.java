package abstraction;

public class Car_Endeavour extends Car {

	void noOfSeats() {
		System.out.println("no of seats 7");
	}
	void speed()
	{
		System.out.println("220 km/hr");
	}
	void engine()
	{
		System.out.println("3200 cc");
	}
	void wheelType()
	{
		System.out.println("");
	}
	
	public String toString()
	{
		return "Endeavour "+brand+" "+price;
	}
}
