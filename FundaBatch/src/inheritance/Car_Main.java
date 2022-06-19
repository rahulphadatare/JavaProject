package inheritance;

import java.util.Scanner;

public class Car_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Car_M c=new Car_M();
	System.out.println("Enter name modelname year");
	String name=sc.next();
	String brand=sc.next();
	int lunchyear=sc.nextInt();
	c.setCarData(name, brand, lunchyear);
	
	
	System.out.println("Enter id price payment method installment");
	int id=sc.nextInt();
	int price=sc.nextInt();
	String paym=sc.next();
	int inst=sc.nextInt();
	c.setMdata(id, price, paym, inst);
	c.discount();
	c.display();
}
}
