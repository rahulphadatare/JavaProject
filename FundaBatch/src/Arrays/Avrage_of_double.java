package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Avrage_of_double {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	double a[]=new double[size];
	double sum=0,total=0;
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextDouble();
		sum+=a[i];
	}
	total=sum/size;
	System.out.println("a[]= "+Arrays.toString(a));
	System.out.println(total);
	
}

}
