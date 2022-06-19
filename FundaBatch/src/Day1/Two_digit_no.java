package Day1;

import java.util.Scanner;

public class Two_digit_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if (n>=10 && n<=99)
		{
		int l=n%10;
		int f=n/10;
		int sum=l+f;
		
		System.out.println("the no is two digit no "+n);
		System.out.println("The sum is="+sum);
		}
	
	else
		{
		
		System.out.println("the no is not two digit no "+n);
		}
}
}
