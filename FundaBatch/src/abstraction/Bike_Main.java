package abstraction;

import java.util.Scanner;

public class Bike_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bike_Bullet b=new Bike_Bullet();
	System.out.println("Enter bike price colour brand");
	int price=sc.nextInt();
	String colour=sc.next();
	String brand=sc.next();
	b.setBike(price, colour, brand);
	System.out.println("Enter bike engine modelno paymentm(full,half)");
	String engine=sc.next();
	String modelno=sc.next();
	String payment=sc.next();
	b.setBullet(engine, modelno, payment);
	b.dislay();
	b.mirror();
	b.wheelNo();
	b.gears();
	b.seats();
	b.fetures();
	b.discount();
	
	System.out.println();
	
	Bike_JawaPerk j=new Bike_JawaPerk();
	System.out.println("Enter bike price colour brand");
	price=sc.nextInt();
	colour=sc.next();
	brand=sc.next();
	j.setBike(price, colour, brand);
	System.out.println("Enter bike engine modelno paymentm(full,half)");
	engine=sc.next();
	modelno=sc.next();
	payment=sc.next();
	j.setBullet(engine, modelno, payment);
	j.dislay();
	j.mirror();
	j.wheelNo();
	j.gears();
	j.seats();
	j.fetures();
	j.discount();
}
}
