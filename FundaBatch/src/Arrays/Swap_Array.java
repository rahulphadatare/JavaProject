package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_Array {
	
	void swap(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			int j, c=a[0];
			for( j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
				
			}
			a[j]=c;
		}
		System.out.println(Arrays.toString(a));
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" no");
	int a[]=new int[size];

	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	Swap_Array s=new Swap_Array();
	System.out.println("how many no swap");
	int n=sc.nextInt();
	s.swap(a, n);
}
}
