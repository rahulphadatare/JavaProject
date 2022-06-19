package Arrays;

import java.util.Scanner;

public class Add_even_odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
//	int a[]= {1, 2, 3, 4, 5, 6};// literals
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+" ");
//	}
	int size;
	System.out.println("Enter size of Array");
	size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter "+size+" element");
	int sum=0;
	int t=0;
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for (int i=0;i<size;i++)
	{
		if(a[i]%2==0)
		{
			sum+=a[i];
		}
		else
		{
			t+=a[i];
		}
		
	}
	System.out.println("Addition of even no "+sum);

	System.out.println("Addition of odd no "+t);
}
}
