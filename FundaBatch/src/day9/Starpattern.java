package day9;

import java.util.Scanner;

public class Starpattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	int j;
	for(int i=0;i<=r;i++)   // column
	{
		for(j=r-i; j>0;j--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)  //row  
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
