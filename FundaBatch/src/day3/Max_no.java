package day3;

import java.util.Scanner;

public class Max_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if (a>=b && a>c)
		System.out.println("The max no is ="+a);
	else if (b>=a && b>=c)
		System.out.println("The max no is ="+b);
	else
		System.out.println("The max no is ="+c);
}
}
