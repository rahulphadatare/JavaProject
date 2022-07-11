package Test4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Negative_no {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter "+size+" no");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			//System.out.print(a[i]+" ");
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		for(int i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			//System.out.print(a[i]+" ");
		}
		System.out.println(Arrays.toString(a));
	}
}
