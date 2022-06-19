package Day1;

import java.util.Scanner;

public class Three_digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int s=0;
	if (n>=100 && n<=999)
		{
		int l=n%10;
		int a=n/10;
		int f=a/10;
		int m=a%10;
		
		int sum=m+f+l;
		System.out.println("The no is three digit no "+n);
		System.out.println("THe sum is ="+sum);
		}
	else
		System.out.println("The no is not three digit no "+n);
	
}
}
