package day6;

import java.util.Scanner;
//no is not divided by itself or 1
public class Prime_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int b=2, c=0;
	while (b<=a/2)
//		a is divided bcs the cout is get its half and above that value is not divisble bye the value
	{
		if(a%b==0)         
		{
			c++;
			break;
		}
		b++;
	}
	if(c==0)
	{
		System.out.println(a+" is prime no");
	}
	else
	{
		System.out.println(a+" Not prime no");
	}
	
}
}
