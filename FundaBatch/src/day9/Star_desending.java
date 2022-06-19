package day9;

import java.util.Scanner;

public class Star_desending {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	
	for(int i=r;i!=0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
}
