package Day1;

import java.util.Scanner;

public class Swap_without_third_char {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;  // 2+3=5
		b=a-b;  // 5-3=2
		a=a-b;  // 5-2=3
		System.out.println(a);
		System.out.println(b);
}
}
