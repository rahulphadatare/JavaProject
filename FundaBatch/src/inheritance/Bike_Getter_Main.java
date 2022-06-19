package inheritance;

import java.util.Scanner;

public class Bike_Getter_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter brand model colour milage price weight");
	String brand=sc.next();
	String model=sc.next();
	String colour=sc.next();
	String milage=sc.next();
	int price=sc.nextInt();
	int weight=sc.nextInt();
	
	Bike1_Getter b=new Bike1_Getter();
	b.setBrand(brand);
	b.setModel(model);
	b.setColour(colour);
	b.setMilage(milage);
	b.setPrice(price);
	b.setWeight(weight);
	
	System.out.println(b);
	b.seats();
	b.gear();
	b.speed();
}
}
