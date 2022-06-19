package day8;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=a;i>=1;i--)
	{
		for(j=1;j<=a-i;j++)
		{
			System.out.print(" ");
		}
	
		
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		for(j=i-1;j>0;j--)
		{
			System.out.print(j);
		}
	
		System.out.println();
	}
}
}
