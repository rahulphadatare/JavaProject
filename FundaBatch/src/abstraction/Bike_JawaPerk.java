package abstraction;

public class Bike_JawaPerk extends Bike {
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
		System.out.println("6 no of gears");
	}
	void seats()
	{
		System.out.println("1 no of seats");
	}
	void fetures()
	{
		System.out.println("both wheel ABS system");
	}
	void discount()
	{
		int dis=0;
		if(payment.equals("full"))
		{
			dis=price*25/100;
		}
		else if(payment.equals("half"))
		{
			dis=price*15/100;
		}
		
		System.out.println("discount is: "+dis);
	}
}
