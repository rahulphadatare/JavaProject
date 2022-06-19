package Constructor;

import java.util.Arrays;
import java.util.Scanner;

public class Car_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Car_Company a[]=new Car_Company[5];
	for(int i=0;i<5;i++)
	{
	System.out.println("Enter car id, name, mode, price");
	int id=sc.nextInt();
	String name=sc.next();
	String model=sc.next();
	int price=sc.nextInt();
	
	Car c=new Car(id,name,model,price);
	
	System.out.println("Enter comapny id name year of establish");
	int cid=sc.nextInt();
	String cname=sc.next();
	int year=sc.nextInt();
	
	Car_Company b=new Car_Company(cid,cname,year,c);
	//System.out.println(b);
	a[i]=b;
	}
	System.out.println(Arrays.toString(a));
}
}
