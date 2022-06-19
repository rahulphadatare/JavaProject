   package day7;

import java.util.Scanner;

public class Menudriven_dowhile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch='n';
	do
	{
	System.out.println("1. Addition \n2. Substraction\n3. Mutiplication\n4. Division\nEnter choice");
	int a=sc.nextInt();
	System.out.println("Enter 2 no");
	int b=sc.nextInt();
	int c=sc.nextInt();
	switch(a)
	{
	case 1:System.out.println("Addition="+(b+c));
	break;
	case 2:System.out.println("Substraction="+(b-c));
	break;
	case 3:System.out.println("Multiplication="+(b*c));
	break;
	case 4:System.out.println("Division="+(b/c));
	break;
	default:System.out.println("INvalid selction");
	}
	System.out.println("Do you want continue (y/n)");
	ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
}
}
