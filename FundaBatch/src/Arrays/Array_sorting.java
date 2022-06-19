package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sorting {
public static void main(String[] args) {
//	int a[]= {20, 50, 70, 80, 40, 30};
//	int b=a.length;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	int a[] =new int [size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		System.out.println(a[i]+" ");
	}
	
	
	for(int i=0;i<size;i++)//quick sort
	{
		for(int j=i+1;j<size;j++)
		{
		if(a[i]>a[j])
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			
		}
		}
	}
	System.out.println("Quick sort "+Arrays.toString(a));
	
	
	for(int i=0;i<size;i++)//bubble sort
	{
		for(int j=0;j<size-1;j++)
		{
		if(a[j]>a[j+1])
		{
			int t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
			
		}
		}
	}
	System.out.println("Bubble sort "+Arrays.toString(a));
	
	Arrays.sort(a);
	System.out.println("Array.sort "+Arrays.toString(a));
}
}
