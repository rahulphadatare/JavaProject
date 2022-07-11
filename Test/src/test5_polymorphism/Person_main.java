package test5_polymorphism;

import java.util.Scanner;

public class Person_main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter city state country");
	String city=sc.next();
	String state=sc.next();
	String country=sc.next();
	Peron_add a=new Peron_add();
	a.setCity(city);
	a.setState(state);
	a.setCountry(country);
	

	System.out.println("Enter name gender age");
	String name=sc.next();
	String gender=sc.next();
	int age=sc.nextInt();
	Person p=new Person();
	p.setAge(age);
	p.setName(name);
	p.setGender(gender);
	p.seta(a);
	
	System.out.println(p);
}
}
