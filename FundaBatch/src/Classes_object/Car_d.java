package Classes_object;

import java.util.Scanner;

public class Car_d {
	int id, year, price, installment, dis, totalpay, paym;
	String name, brandname;
	void car(int i, String n, int y, int p, String b, int in, int py)
	{
		id=i;
		name=n;
		year=y;
		price=p;
		brandname=b;
		installment=in;
		paym=py;
		
	}
	void discount()
	{
		if(installment==1)
		{
			if(paym==0)
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
	
	public String toString()
	{
		return id+" "+name+" "+year+" "+price+" "+brandname;
	}
	
	
	
 public static void main(String[] args) {
	 int id, year, price, installment, paym;
	 String name, brandname;
	 Car_d c1=new Car_d();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter: id,name,year,price,brandname,installation,paym 0 for online 1 for cash");
	 id=sc.nextInt();
	 name=sc.next();
	 year=sc.nextInt();
	 price=sc.nextInt();
	 brandname=sc.next();
	 installment=sc.nextInt();
	 paym=sc.nextInt();
	 c1.car(id, name, year, price, brandname, installment, paym);
	 System.out.println(c1);
	 c1.discount();
	 
	 Car_d c2=new Car_d();

	 System.out.println("Enter: id,name,year,price,brandname,installation,paym");
	 id=sc.nextInt();
	 name=sc.next();
	 year=sc.nextInt();
	 price=sc.nextInt();
	 brandname=sc.next();
	 installment=sc.nextInt();
	 paym=sc.nextInt();
	 c2.car(id, name, year, price, brandname, installment, paym);
	 System.out.println(c2);
	 c2.discount();
	 
	 Car_d c3=new Car_d();
	
	 System.out.println("Enter: id,name,year,price,brandname,installation,paym");
	 id=sc.nextInt();
	 name=sc.next();
	 year=sc.nextInt();
	 price=sc.nextInt();
	 brandname=sc.next();
	 installment=sc.nextInt();
	 paym=sc.nextInt();
	 c3.car(id, name, year, price, brandname, installment, paym);
	 System.out.println(c3);
	 c3.discount();
	 
	 
	 
	 
	 
	 
	
}
}
