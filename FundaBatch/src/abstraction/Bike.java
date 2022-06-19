package abstraction;

public abstract class Bike {
	int price;
	String colour,brand;
	void setBike(int price, String colour, String brand)
	{
		this.price=price;
		this.colour=colour;
		this.brand=brand;
	}
	void display()
	{
		System.out.println(price+" "+colour+" "+brand);
	}
	void wheelNo()
	{
		System.out.println("2 no of wheels");
	}
	void mirror()
	{
		System.out.println("2 simple mirror");
	}
	
	abstract void gears();
	abstract void seats();
	abstract void fetures();
	abstract void discount();
}
