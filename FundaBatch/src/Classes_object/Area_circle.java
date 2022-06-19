package Classes_object;

import java.util.Scanner;

public class Area_circle {
	
	int square(int r)
	{
		return r*r;
	}
	void area(int r)
	{
		
		double c= 3.14*square(r);
		System.out.println("Area of circle: "+c);
	}
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radious");
	int rd=sc.nextInt();
	Area_circle c1=new Area_circle();
//	c1.area(rd);
	c1.square(rd);
	
}
}
