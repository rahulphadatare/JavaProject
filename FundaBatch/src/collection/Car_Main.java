package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Car_Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Car_Company> cc=new ArrayList<Car_Company>();
	ArrayList<Car> c = null;
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter id comp-name");
		int cid=sc.nextInt();
		String cname=sc.next();
		c=new ArrayList<Car>();
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter id,carname,year,price");
			int id=sc.nextInt();
			String name=sc.next();
			int year=sc.nextInt();
			int price=sc.nextInt();
			c.add(new Car(id,name,year,price));
		}
		cc.add(new Car_Company(cid,cname,c));
	}
	
	System.out.println(cc);
	
//	for(Car_Company a:cc)
//	{
//		for(Car c:a.c)
//		{
//			if(c.year==2000 && c.price>600000)
//			{
//				System.out.println(a.cname+" "+c.name+" "+c.price);
//			}
//		}
//	}
	int z=0;
	for(int i=0;i<cc.size();i++)
	{
		for(int j=0;j<c.size();j++)
		{
			if(c.get(j).id==105)
			{
				z=c.get(j).year;
			}
		}
	}
//	for(int i=0;i<c.size();i++)
//	{
//		if(c.get(i).id==105)
//		{
//			z=c.get(i).year;
//		}
//	}
	System.out.println(z);
	
	ListIterator<Car_Company> a=cc.listIterator();
	while(a.hasNext())
	{
		ListIterator<Car> b=c.listIterator();
		while(b.hasNext())
		{
			Car m=b.next();
			if(m.year==2000)
			{
				b.remove();
			}
		}
		a.next();
	}
	System.out.println(cc);
	
//	Iterator<Car> b= c.iterator();
//	while(b.hasNext())
//	{
//		Car m=b.next();
//		if(m.year==2000)
//		{
//			b.remove();
//		}
//	}
//	System.out.println(cc);
}
}
