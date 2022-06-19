package Array2D;

import java.util.Scanner;

public class Array_shifting_r_c {

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
	
	void d2(int a[][],int c,int r)
	{
		System.out.println("Transpose");
		int b[][]=new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter "+(r*c)+" no");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		Array_shifting_r_c a1=new Array_shifting_r_c();
		a1.display(a, r, c);
		a1.d2(a, c, r);
	}
}
