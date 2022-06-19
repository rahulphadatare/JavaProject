package day5;

import java.util.Scanner;

public class Odd_even_by_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		switch (n % 2) {
		case 0:
			System.out.println("No is even");
			break;
		default:
			System.out.println("No is odd");
		}
	}
}
