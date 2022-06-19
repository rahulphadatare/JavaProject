package Classes_object;

import java.util.Scanner;

public class Employee {
	int id,sal;
	String name,dept,designation,rating;
//	char rating;
	void data(int i, String n, String d, String ds,String r, int s )
	{
		id=i;
		name=n;
		dept=d;
		designation=ds;
		sal=s;
		rating=r;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+designation+" "+sal+" "+rating);
	}
	void bonus()
	{
		if(rating.equals("A"))
				{
			sal=sal*15/100;
			System.out.println("bonus "+sal);
				}
		else if(rating.equals("B"))
		{
			sal=sal*10/100;
			System.out.println("bonus "+sal);
		}
		else if(rating.equals("C"))
		{
			sal=sal*5/100;
			System.out.println("bonus "+sal);
		}
		else if(rating.equals("B"))
		{
			System.out.println("no bonus");
		}
				
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+designation+" "+sal+" "+rating;
	}
public static void main(String[] args) {
	int id,sal;
	String name,dept,designation,rating;
	Scanner sc=new Scanner(System.in);
	
	Employee e1=new Employee();
	System.out.println("Enter: id,name,dept,designation,sal,rate");
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	designation=sc.next();
	sal=sc.nextInt();
	rating=sc.next();
	e1.data(id, name, dept, designation, rating, sal);
	
	

	Employee e2=new Employee();
	System.out.println("Enter: id,name,dept,designation,sal,rate");
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	designation=sc.next();
	sal=sc.nextInt();
	rating=sc.next();
	e2.data(id, name, dept, designation, rating, sal);
	
	Employee e3=new Employee();
	System.out.println("Enter: id,name,dept,designation,sal,rate");
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	designation=sc.next();
	sal=sc.nextInt();
	rating=sc.next();

	e3.data(id, name, dept, designation, rating, sal);
	
	Employee e4=new Employee();
	System.out.println("Enter: id,name,dept,designation,sal,rate");
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	designation=sc.next();
	sal=sc.nextInt();
	rating=sc.next();
	e4.data(id, name, dept, designation, rating, sal);
	
	Employee e5=new Employee();
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	designation=sc.next();
	sal=sc.nextInt();
	rating=sc.next();
	e5.data(id, name, dept, designation, rating, sal);
	
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);

	System.out.println(e5);
}
	
	


}
