package Test3_constructor;

import java.util.Scanner;

public class No {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int n=sc.nextInt();
	int i,j;
	for(i=n;i>=1;i--)
	{
		for(j=i-1;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(j=i;j<=n;j++)
		{
			System.out.print(j);
		}
		for(j=n-1;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
