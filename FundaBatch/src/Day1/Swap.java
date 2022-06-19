package Day1;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	
	
}
}
