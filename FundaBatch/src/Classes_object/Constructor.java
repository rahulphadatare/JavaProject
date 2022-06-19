package Classes_object;

import java.util.Scanner;

public class Constructor {
	
	int id,salary;
	String firstname,lastname,dept,des;
	Constructor(){}
	
	void setId(int id)
	{
		this.id=id;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	void setFirstname(String firstname)
	{
		this.firstname=firstname;
	}
	void setLastname(String lastname)
	{
		this.lastname=lastname;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}
	void setDes(String des)
	{
		this.des=des;
	}
	
	public String toString()
	{
		return id+" "+firstname+" "+lastname+" "+salary+" "+dept+" "+des;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id, firstname, lastname,salary, dept,des");
		int id=sc.nextInt();
		String firstname=sc.next();
		String lastname=sc.next();
		int salary=sc.nextInt();
		String dept=sc.next();
		String des=sc.next();
		
		Constructor c1=new Constructor();
		c1.setId(id);
		c1.setFirstname(firstname);
		c1.setLastname(lastname);
		c1.setSalary(salary);
		c1.setDept(dept);
		c1.setDes(des);
		System.out.println(c1);
	}
	
	
	
	
	
	
	
	
	
	
}
