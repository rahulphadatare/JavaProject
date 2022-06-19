package Day1;

import java.util.Scanner;

public class Area_triangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter height and base");
	int h=sc.nextInt();
	int b=sc.nextInt();
	int area=h*b/2;
	System.out.println("Area of traiangle is ="+area);
}
}
