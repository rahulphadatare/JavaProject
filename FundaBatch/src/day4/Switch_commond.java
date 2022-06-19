package day4;

import java.util.Scanner;

public class Switch_commond {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter 1 for add, 2 for sub, 3 for mul, 4 for div");
	int c=sc.nextInt();
	switch(c)
	{
	case 1: int add=a+b;
		System.out.println("Addition is ="+add);
		break;
	case 2: int sub=a-b;
		System.out.println("Substraction is ="+sub);
		break;
	case 3: int mul=a*b;
		System.out.println("Multiplication is ="+mul);
		break;
	case 4: int div=a/b;
		System.out.println("Division is ="+div);
		break;
	default:
		System.out.println("Invalid selection");
		
	}
}
}
