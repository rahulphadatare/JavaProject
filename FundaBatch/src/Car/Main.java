package Car;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id, name, year, price, brandname");
	int id=sc.nextInt();
	String name=sc.next();
	int year=sc.nextInt();
	int price=sc.nextInt();
	String brandname=sc.next();
	Car c1=new Car();
	c1.setId(id);
	c1.setName(name);
	c1.setYear(year);
	c1.setPrice(price);
	c1.setBrandname(brandname);
	System.out.println(c1);
	
	Discount d1=new Discount();
	System.out.println("Enter installment method of pay");
	int installment=sc.nextInt();
	String mpay=sc.next();
	d1.discount(installment, mpay, c1);
	
}
}
