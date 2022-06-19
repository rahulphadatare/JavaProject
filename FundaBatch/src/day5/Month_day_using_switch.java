package day5;

import java.util.Scanner;

public class Month_day_using_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month no");
		int no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("Jan and days is " + 31);
			break;
		case 2:
			System.out.println("Feb and days is " + 28+ " or "+29);
			break;
		case 3:
			System.out.println("Mar and days is " + 31);
			break;
		case 4:
			System.out.println("Apr and days is " + 30);
			break;
		case 5:
			System.out.println("May and days is " + 31);
			break;
		case 6:
			System.out.println("Jun and days is " + 30);
			break;
		case 7:
			System.out.println("Jul and days is " + 31);
			break;
		case 8:
			System.out.println("Aug and days is " + 31);
			break;
		case 9:
			System.out.println("Sep and days is " + 30);
			break;
		case 10:
			System.out.println("Oct and days is " + 31);
			break;
		case 11:
			System.out.println("Nov and days is " + 30);
			break;
		case 12:
			System.out.println("Dec and days is " + 31);
			break;
		default:
			System.out.println("Invalid selection");
		}
	}
}
