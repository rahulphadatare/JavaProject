package day5;

import java.util.Scanner;

public class Day_name_by_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sunday\n2.monday\n3.tuesday\n4.wednesday\n5.thursday\n6.friday\n7.saturday");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Sturday");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
