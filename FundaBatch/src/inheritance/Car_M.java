package inheritance;

public class Car_M extends Car {
	int id,price,inst;
	String paym;
	int dis;
	
	void setMdata(int id, int price, String paym,  int inst)
	{
		this.id=id;
		this.price=price;
		this.paym=paym;
		this.inst=inst;
	}
	
	void discount()
	{
		if(paym.equals("cash") || paym.equals("online") || inst==0)
		{
			dis=price*15/100;
		}
		else if(inst==1)
		{
			dis=price*10/100;
		}
		else if(inst==2)
		{
			dis=price*5/100;
		}
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+price+" "+dis);
	}
}
