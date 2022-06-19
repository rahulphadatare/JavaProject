package day9;

import java.util.Scanner;

public class Abcd_pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
//	char c='a';
	
	
	for(int i=0;i<r;i++)
	{
		char c='a';
		for(int j=0;j<=i;j++)
		{
			System.out.print(c);
			c++;
		}
		System.out.println();
	}
}
}
