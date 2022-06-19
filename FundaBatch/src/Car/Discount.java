package Car;

public class Discount {
	int dis, totalpay;
void discount(int installment, String mpay, Car c)
{
	int price=c.getPrice();
	
	

	if(installment==1)
	{
		if(mpay.equals("online"))
		{
		dis=price*20/100;
		totalpay=price-dis;
		System.out.println("Discount= "+dis);
		System.out.println("Total amount= "+totalpay);
		}
		else
		{
			dis=price*15/100;
			totalpay=price-dis;
			System.out.println("Discount= "+dis);
			System.out.println("Total amount= "+totalpay);
		}
	}
	
	else if(installment==2)
	{
		
		dis=price*13/100;
		totalpay=price-dis;
		System.out.println("Discount= "+dis);
		System.out.println("Total amount= "+totalpay);
		
	}
	
	else if(installment==3)
	{
		
		
			dis=price*8/100;
			totalpay=price-dis;
			System.out.println("Discount= "+dis);
			System.out.println("Total amount= "+totalpay);
		
	}
	else
	{
		System.out.println("No discount");
		System.out.println("Total amount= "+price);
	}
}
}
