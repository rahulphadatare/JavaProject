package day9;

import java.util.Scanner;

public class Nump {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=0;i<=a;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
