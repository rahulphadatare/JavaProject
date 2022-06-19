package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Shift_left_2digit {
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
	
	int n1=a[0];  // a[0]=1    n1=1
	int n2=a[1];  // a[1]=2    n2=2
	for(int i=0;i<size-2;i++)  // i=0     i=1   i=2  i=3
	{
			a[i]=a[i+2];     //a[0]=a[2]   a[0]=3   a[1]=a[3] a[1]=4  a[2]=a[4]=5
	}
	a[size-2]=n1; //a[3]=1
	a[size-1]=n2; //a[4]=2
	System.out.println(Arrays.toString(a));
}
}
