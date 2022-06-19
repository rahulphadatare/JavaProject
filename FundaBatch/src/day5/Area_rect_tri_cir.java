package day5;

import java.util.Scanner;

public class Area_rect_tri_cir {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.rectangle \n 2.circle \n 3.trianle");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: System.out.println("Enter length");
	int l=sc.nextInt();
	System.out.println("Enter bredth");
	int b=sc.nextInt();
	int area=l*b;
	System.out.println(area);
	case 2:
		System.out.println("Enter radius");
		int r=sc.nextInt();
		double c=3.14*r;
		System.out.println(c);
		
	case 3:
		
	}
	
	
	
	
}
}
