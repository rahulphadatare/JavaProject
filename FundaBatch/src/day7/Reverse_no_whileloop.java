package day7;

import java.util.Scanner;

public class Reverse_no_whileloop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	int sum=0;
	
	while(num!=0)
	{
		int r=num%10;
		sum=sum*10+r;
		num=num/10;
	}
	System.out.println("Reverse is= "+sum);
}
}
