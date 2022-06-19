package Day1;

import java.util.Scanner;

public class Leep_year {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente a year");
	int year=sc.nextInt();
	if (year%4==0)
		System.out.println("The year is leep year");
	else
		System.out.println("The year is not leep year");
}
}
