package Constructor;

import java.util.Scanner;

public class Getter_Setter {
	int id, percentage;
	String name, dept, city, contact;
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}
	void setPercentage(int percentage)
	{
		this.percentage=percentage;
	}
	void setCity(String city)
	{
		this.city=city;
	}
	void setContact(String contact)
	{
		this.contact=contact;
	}
	int getPercentage()
	{
		return percentage;
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
		Getter_Setter s1=new Getter_Setter();
		s1.setId(id);
		s1.setName(name);
		s1.setDept(dept);
		s1.setPercentage(percentage);
		s1.setCity(city);
		s1.setContact(contact);
		System.out.println(s1);
		s1.grade();
	}
}
