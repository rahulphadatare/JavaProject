package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class String_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" string");
	String a[]=new String[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.next();
	}
	a[2]=null;
	System.out.println("String array= "+Arrays.toString(a));
	
	
}
}
