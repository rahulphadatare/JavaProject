package day6;

import java.util.Scanner;

public class Factorial_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int n=sc.nextInt();
	int a = 1, b=1;
	while(a<=n)
	{
	
		b=b*a;
		a++;
		
	}
	System.out.println(b);
}
}
