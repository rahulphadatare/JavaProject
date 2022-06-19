package inheritance;

import java.util.Scanner;

public class Person_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name contact add gender id sal sub performance(A,B,C,D)");
	String name=sc.next();
	String contact=sc.next();
	String add=sc.next();
	String gender=sc.next();
	int id=sc.nextInt();
	int sal=sc.nextInt();
	String sub=sc.next();
	String performance=sc.next();
	
	Person_Faculty p=new Person_Faculty();
	p.setName(name);
	p.setContact(contact);
	p.setAdd(add);
	p.setGender(gender);
	p.setId(id);
	p.setSal(sal);
	p.setSub(sub);
	p.setPerformance(performance);
	
	p.bonus();
	p.display();
}
}
