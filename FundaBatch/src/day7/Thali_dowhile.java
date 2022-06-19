package day7;

import java.util.Scanner;

public class Thali_dowhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char h='n';
	do
	{
	System.out.println("1. Maharastrian thali\n2. Punjabi thali\n3. Gujrati thali\n4. Rajasthani thali");
	int choice = sc.nextInt();
	switch (choice) {
	case 1:
		System.out.println("Maharashtrian Thali 200");
		System.out.println("How many thali u want");
		int t = sc.nextInt();
		int total = t * 200;
		System.out.println("Total bill is= " + total);
		break;
	case 2:
		System.out.println("Punjabi Thali 300");
		System.out.println("How many thali u want");
		int a = sc.nextInt();
		int to = a * 300;
		System.out.println("Total bill is= " + to);
		break;
	case 3:
		System.out.println("Gujrati Thali 250");
		System.out.println("How many thali u want");
		int b = sc.nextInt();
		int m = b * 250;
		System.out.println("Total bill is= " + m);
		break;
	case 4:
		System.out.println("Rajsthani Thali 100");
		System.out.println("How many thali u want");
		int c = sc.nextInt();
		int n = c * 100;
		System.out.println("Total bill is= " + n);
		break;
	default:
		System.out.println("Invalid choice");
	
	}
	System.out.println("Do this continue (y/n)");
	h=sc.next().charAt(0);
	}while(h=='y' || h=='Y');
}
}
