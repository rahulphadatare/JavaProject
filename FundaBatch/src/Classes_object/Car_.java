package Classes_object;

public class Car_ {
	void Wheel()
	{
		System.out.println("4 wheel");
	}
	void Speed()
	{
		System.out.println("max 150 km/hr");
	}
	void Mileage()
	{
		System.out.println("20km/ltr");
	}
	void colour()
	{
		System.out.println("red,black,white");
	}
public static void main(String[] args) {
	Car_ c1=new Car_();
	Car_ c2=new Car_();
	Car_ c3=new Car_();
	
	c1.colour();
	c2.Mileage();
	c3.Wheel();
	c3.Speed();
}
}
