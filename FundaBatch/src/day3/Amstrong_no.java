package day3;

import java.util.Scanner;

public class Amstrong_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int n=sc.nextInt();
	if (n>=100 && n<=999)
	{
		int n3=n%10;
		int m=n/10;
		int n1=m/10;
		int n2=m%10;
	
		int sum=n1*n1*n1+n2*n2*n2+n3*n3*n3;
		if (n==sum)
		{
			System.out.println("The no is Armstrong no "+n);
		}
		else
			System.out.println("The no is not armstrong no "+n);
	}
	else
		System.out.println("No is not three digit");
	
}
}
