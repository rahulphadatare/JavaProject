package Test4_Arrays;

import java.util.Scanner;

// sum of main daigonal no
public class Sum_of_daigonal {
 
	  void display(int a[][],int r,int c)
	  {
		  for(int i=0;i<r;i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  System.out.print(a[i][j]+"  ");
			  }
			  System.out.println();
		  }
		  System.out.println();
	  }
	 
	  
	  void daigonal(int a[][],int r, int c)
	  { 
		  
		  int sum=0;
		  for(int i=0;i<r;i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  if(i==j)
				  {
					 sum+=a[i][j] ;
				  }
			  }
		  }
		  System.out.println("Sum of main daigonal "+sum);
	  }
	  
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+" no");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		Sum_of_daigonal s=new Sum_of_daigonal();
		s.display(a, r, c);
		s.daigonal(a, r, c);
	}
	 
}
