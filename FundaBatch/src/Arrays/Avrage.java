package Arrays;

import java.util.Scanner;

public class Avrage {
public static void main(String[] args) {
	int size=10;
	float a[]=new float[size];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter "+ size+" element");
	float sum=0;
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextFloat();
		System.out.print(a[i]+" ");
		sum+=a[i];
	}
	System.out.println();
	float total=sum/size;
	System.out.println(total);
}
}
