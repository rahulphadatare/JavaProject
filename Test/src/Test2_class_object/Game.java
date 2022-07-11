package Test2_class_object;

import java.util.Scanner;

public class Game {
	String country;
	void country(String c)
	{
		country=c;
	}
	void game()
	{
		switch(country)
		{
		case "India":
			System.out.println("The national game of India is Hockey");
			break;
		
		case "China":
		
			System.out.println("The national game of China is Table Tennis");
			break;
		
		case "Bangladesh":
		
			System.out.println("The national game of Bangladesh is Table Kabaddi");
			break;
		
		case "Italy":
		
			System.out.println("The national game of Italy is Table Football");
			break;
		
		case "United State":
		
			System.out.println("The national game of United State is Table Baseball");
			break;
		
		default:
		
			System.out.println("Invalid Country");
			break;
		
		
		}
	}
	
	
public static void main(String[] args) {
	String country;
	Scanner sc=new Scanner(System.in);
	Game c1=new Game();
	System.out.println("Enter Country name: ");
	country=sc.next();
	c1.country(country);
	c1.game();
	
	Game c2=new Game();
	System.out.println("Enter Country name: ");
	country=sc.next();
	c2.country(country);
	c2.game();
	
	Game c3=new Game();
	System.out.println("Enter Country name: ");
	country=sc.next();
	c3.country(country);
	c3.game();
	
	Game c4=new Game();
	System.out.println("Enter Country name: ");
	country=sc.next();
	c4.country(country);
	c4.game();
	
	Game c5=new Game();
	System.out.println("Enter Country name: ");
	country=sc.next();
	c5.country(country);
	c5.game();
}
}
