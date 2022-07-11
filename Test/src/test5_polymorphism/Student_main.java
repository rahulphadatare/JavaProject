package test5_polymorphism;

import java.util.Scanner;

public class Student_main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter department id name");
	int id=sc.nextInt();
	String name=sc.next();
	Student_Department d=new Student_Department(id,name);
	
	System.out.println("Enter roll name");
	int roll=sc.nextInt();
	String sname=sc.next();
	Student s=new Student(roll,sname,d);
	
	System.out.println(s);
}
}
