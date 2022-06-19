package Array2D;

import java.util.Arrays;
import java.util.Scanner;

import Array_class.main;

public class Array2d_example {
   
	void display(int a[][],int r, int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	void addition(int a[][],int r,int c)
	{
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.println("sum of array is= "+sum);
	}
	void multiplication(int a[][],int r,int c)
	{
		int sum=1;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum*=a[i][j];
			}
		}
		System.out.println("multiplication of array is= "+sum);
	}
	void additionofrow(int a[][],int r,int c)
	{
		
		for(int i=0;i<r;i++)
		{
			int sum=0;
			for(int j=0;j<c;j++)
			{
				sum+=a[i][j];
				
			}
			System.out.println("sum of "+(i+1)+" row is= "+sum);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and col");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter "+(r*c)+" no");
		int a[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		Array2d_example a1=new Array2d_example();
		a1.display(a, r, c);
		a1.addition(a, r, c);
		a1.multiplication(a, r, c);
		a1.additionofrow(a, r, c);
	}
}
