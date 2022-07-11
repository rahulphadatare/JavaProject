package Test1;

import java.util.Scanner;

public class Base_index_calculate_power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter base no");
	int base=sc.nextInt();
	System.out.println("Enter index no");
	int index=sc.nextInt();
	int a=0;
	int power=1;
	while(a<index)
	{
		
		power*=base;
		
		a++;
		
	}
	System.out.println(power);
}
}
