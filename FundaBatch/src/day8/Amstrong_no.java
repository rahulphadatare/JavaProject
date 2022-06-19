package day8;

import java.util.Scanner;

public class Amstrong_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		int temp=num;
		int z=temp;
		int c=0;
		int sum=1;
		int m=0;
		while(num!=0)
		{
			int r=num%10;
			
			num=num/10;
			c++;
			
		}
		while(temp!=0)
		{ 
			sum=1;
			int a=temp%10;
		for(int i=0;i<c;i++)
		{
			
			sum*=a;
			
//				System.out.println(sum);
				
			}
		m+=sum;
		temp=temp/10;
		}
		
		
		System.out.println(m);
		if(m==z)
		{
			System.out.println("Amstrong no");
		}
		else
			System.out.println("not");

	}

}
