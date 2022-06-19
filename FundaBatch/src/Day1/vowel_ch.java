package Day1;

import java.util.Scanner;

public class vowel_ch {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter a char");
	char ch=sc.next().charAt(0);
	if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		System.out.println("The char is vowel");
	else
		System.out.println("The char is not vowel");
	
}
}
