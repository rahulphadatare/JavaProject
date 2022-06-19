package inheritance;

public class Car {
	String brand,name;
	int lunchyear;
	
	void setCarData(String name, String brand, int lunchyear)
	{
		this.name=name;
		this.brand=brand;
		this.lunchyear=lunchyear;
	}
	
	void display()
	{
		System.out.println(name+" "+brand+" "+lunchyear);
	}
}
