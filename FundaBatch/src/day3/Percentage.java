package day3;

import java.util.Scanner;

public class Percentage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter percentage you got");
	int p=sc.nextInt();
	if (p>=75)
		System.out.println("Distinction");
	else if (p>=60)
		System.out.println("First class");
	else if(p>=50)
		System.out.println("Second class");
	else
		System.out.println("Fail");
}
}
