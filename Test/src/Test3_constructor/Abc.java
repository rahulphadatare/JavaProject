package Test3_constructor;

import java.util.Scanner;

public class Abc {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int a=sc.nextInt();
		int i,j;
		
		for(i=a;i>=1;i--)
		{
			char c='A';
			for(j=i;j>=1;j--)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		for(i=1;i<=a;i++)
		{
			char b='A';
			for(j=1;j<=i;j++)
			{  
				
				System.out.print(b);
				b++;
			}
			System.out.println();
		}
	}
	

}
