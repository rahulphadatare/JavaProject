package constructor_inheritance;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Son s=new Son();
	System.out.println("Enter grandfather name middel name last name");
	String fn=sc.next();
	String mn=sc.next();
	String ln=sc.next();
	s.setGdata(fn, mn, ln);
	
	System.out.println("Enter father name");
		fn=sc.next();
	s.setFdata(fn);
	
	System.out.println("Enter son name");
		fn=sc.next();
	s.setSdata(fn);
	
	s.display();
	
}
}
