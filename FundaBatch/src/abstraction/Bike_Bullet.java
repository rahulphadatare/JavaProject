package abstraction;

public class Bike_Bullet extends Bike {
	String engine,modelno, payment;
	void setBullet(String engine, String modelno, String payment)
	{
		this.engine=engine;
		this.modelno=modelno;
		this.payment=payment;
	}
	void dislay()
	{
		super.display();
		System.out.println(engine+" "+modelno);
	}
	
	void gears()
	{
		System.out.println("5 no of gears");
	}
	void seats()
	{
		System.out.println("2 no of seats");
	}
	void fetures()
	{
		System.out.println("ABS system");
	}
	void discount()
	{
		int dis=0;
		if(payment.equals("full"))
		{
			dis=price*20/100;
		}
		else if(payment.equals("half"))
		{
			dis=price*10/100;
		}
		
		System.out.println("discount is: "+dis);
	}
}
