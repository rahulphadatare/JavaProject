package Test1;

import java.util.Scanner;

public class Krishnamurthi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int b=a;
	int sum=0;
	while(a!=0)
	{
		int r=a%10;
		sum=(r*r*r)+sum;
		a=a/10;
		
//		System.out.println(sum);
		
	}
	
//	System.out.println(b);
	if(b==sum)
	{
		System.out.println("Krishnamurthi no");
	}
	else
	{
		System.out.println("NOt Krishnamurthi no");
	}
	
	
}
}
