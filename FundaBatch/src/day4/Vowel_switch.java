package day4;

import java.util.Scanner;

public class Vowel_switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		int ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
		    break;
		default:
			System.out.println("consonant");
		
		}
			
}
}