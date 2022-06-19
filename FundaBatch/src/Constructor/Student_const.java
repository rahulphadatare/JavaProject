package Constructor;

import java.util.Scanner;

public class Student_const {
	int id,percentage;
	String name,dept,city,contact;
	
	Student_const(int id, String name, String dept, int percentage, String city, String contact)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.percentage=percentage;
		this.city=city;
		this.contact=contact;
	}
	void grade()
	{
		if(percentage>75)
		{
			System.out.println("First class");
		}
		else if(percentage>65)
		{
			System.out.println("Second class");
		}
		else if(percentage>50)
		{
			System.out.println("Third class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+percentage+" "+city+" "+contact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id name dept percentage city contact");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int percentage=sc.nextInt();
		String city=sc.next();
		String contact=sc.next();
	
		Student_const s1=new Student_const(id,name,dept,percentage,city,contact);
		System.out.println(s1);
		s1.grade();
	}
}
