package Arrays;

import java.util.Scanner;

public class Replace_0with1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=0;i<size;i++)
	{
		if(a[i]==0)
		{
			a[i]=1;
		}
		System.out.print(a[i]+" ");
	}
	
}
}
