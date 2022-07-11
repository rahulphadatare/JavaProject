package string;

import java.util.Arrays;

public class Example {
public static void main(String[] args) {
	String s="java is a programming language";
	String ch[]=s.split(" ");
	System.out.println("length of string is: "+ch.length);
	System.out.println("lenght of string character is: "+s.length());
	
	System.out.println(s.toUpperCase());
	
	String m="HELLO0WORLD";
	String a[]=m.split("07");
	System.out.println(Arrays.toString(a));
	
	
	System.out.println(s.startsWith("j"));
}
}
