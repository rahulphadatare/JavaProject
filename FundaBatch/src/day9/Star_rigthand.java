package day9;

import java.util.Scanner;

public class Star_rigthand {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	int j, i;
	for(i=0;i<=r;i++)
	{
//		--r;
//		System.out.println(r);
		for(j=r-i;j>=0;j--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}

}
}
