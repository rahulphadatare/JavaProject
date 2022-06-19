package Arrays;

import java.util.Scanner;

public class Equal_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter size");
	int size1=sc.nextInt();
	System.out.println("Enter "+ size1+" element");
	int a[]=new int[size1];
	
	for(int i=0;i<size1;i++)
	{
		a[i]=sc.nextInt();
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Enter size");
	int size2=sc.nextInt();
	System.out.println("Enter "+size2+" element");
	int b[]=new int[size2];
	for(int i=0;i<size2;i++)
	{
		b[i]=sc.nextInt();
		System.out.print(a[i]+" ");
	}
	System.out.println();
int c=0;
	if(size1==size2)
	{
		for(int j=0;j<size1;j++)
		{
			if(a[j]==b[j])
			{
				//System.out.println("match");
				c++;
			}
			else
			{
				System.out.println("Miss match element");
			}
		}
		if (c==size1)
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("Miss match");
		}
	}
	else
	{
		System.out.println("Miss match size");
	}
}
}
