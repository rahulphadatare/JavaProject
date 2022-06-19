package Constructor;

import java.util.Arrays;
import java.util.Scanner;

public class Car_Main1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Car_Company1 a[]=new Car_Company1[5];
	for(int i=0;i<5;i++)
	{
	System.out.println("Enter car id, name, mode, price");
	int id=sc.nextInt();
	String name=sc.next();
	String model=sc.next();
	int price=sc.nextInt();
	
	Car1 c1=new Car1();
	c1.setId(id);
	c1.setName(name);
	c1.setModel(model);
	c1.setPrice(price);
	
	System.out.println("Enter comapny id name year of establish");
	int cid=sc.nextInt();
	String cname=sc.next();
	int year=sc.nextInt();
	
	Car_Company1 b=new Car_Company1();
	b.setCid(cid);
	b.setCname(cname);
	b.setYear(year);
	b.setC(c1);
	
	//System.out.println(b);
	a[i]=b;
	}
	System.out.println(Arrays.toString(a));
}
}
