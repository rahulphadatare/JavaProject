package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_of_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	int a[]=new int [size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		//System.out.print(a[i]+" ");
	}
	int copy[]=new int[size];
	for(int i=0;i<size;i++)
	{
		copy[i]=a[i];
	}
	System.out.println("User array "+Arrays.toString(a));
	System.out.println("copy array "+Arrays.toString(copy));
}
}
