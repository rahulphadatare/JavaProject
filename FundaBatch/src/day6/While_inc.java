package day6;

import java.util.Scanner;

public class While_inc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a starting no");
	int s=sc.nextInt();
	System.out.println("Enter end no");
	int e=sc.nextInt();
	while(s<=e)
	{
		System.out.print(s+" ");
		s++;
	}
	System.out.println("done");
}
}
