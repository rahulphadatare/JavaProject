package inheritance;

public class Tractor {
	int id,price;
	String milage;
	
	void setDataTractor(int id, int price, String milage)
	{
		this.id=id;
		this.price=price;
		this.milage=milage;
	}
	
	void gear()
	{
		System.out.println("4 gears");
	}
}
