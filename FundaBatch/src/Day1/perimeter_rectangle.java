package Day1;

import java.util.Scanner;

public class perimeter_rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what is length and width");
		
		int l=sc.nextInt();
		int w=sc.nextInt();
		int area=l*w;
		int perimeter=(l+w)*2;
		System.out.println("The area of rectangle is ="+area);
		System.out.println("Perimeter of rectangle is ="+perimeter);
	}
}
