package inheritance;

public class Tractor_Arun_ultra_Novo  extends Tractor_Arjun_ultra {
	String engine;
	int speed;
	
	void setDataNovo(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
	}
	
	public String toString()
	{
		return id+" "+price+" "+milage+" "+model+" "+colour+" "+engine+" "+speed;
	}
	
	void gear()
	{
		super.gear();
		System.out.println("Arjun novo has 18 gears");
	}
}
