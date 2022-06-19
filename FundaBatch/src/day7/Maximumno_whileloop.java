package day7;

import java.util.Scanner;

public class Maximumno_whileloop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	int sum=0;
	
	while(num!=0)
	{
		int r=num%10;
		if(r>sum)
		{
			sum=r;
		}
		num=num/10;
	}
	System.out.println(sum);
}
}
