package Test1;

import java.util.Scanner;

public class Product_digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	int sum=1;
	while(num!=0)
	{
		int r=num%10;
		sum=r*sum;
		num=num/10;
	}
	System.out.println("Addition is= "+sum);
}
}
