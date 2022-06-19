package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Array= "+Arrays.toString(a));
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if(a[i]<a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("Sorted list= "+Arrays.toString(a));
	System.out.println("Maximum no= "+a[size-2]);
	System.out.println("Minimum no= "+a[1]);
}
}
