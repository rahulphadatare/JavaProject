package inheritance;

public class Tractor_Arjun_ultra extends Tractor {
	String model,colour;
	
	void setDataArjun(String model, String colour)
	{
		this.model=model;
		this.colour=colour;
	}
	
	void gear()
	{
		super.gear();
		System.out.println("Arjun ultra has 5 gears");
	}
	

}
