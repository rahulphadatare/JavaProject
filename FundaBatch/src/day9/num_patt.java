package day9;

import java.util.Scanner;

public class num_patt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	int n;
	for(int i=0;i<=r;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(j);
			
		}

		
		System.out.println();
	}
}
}
