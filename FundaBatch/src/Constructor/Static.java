package Constructor;

import java.util.Scanner;

public class Static {
int id,marks;
String name,dept;
static String clgname="ABC";
 
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
void setMarks(int marks)
{
	this.marks=marks;
}
 public String toString()
 {
	 return id+" "+name+" "+dept+" "+marks+" "+clgname;
 }
 
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id name dept marks");
	int id=sc.nextInt();
	String name=sc.next();
	String dept=sc.next();
	int marks=sc.nextInt();
	Static s1=new Static();
	s1.setId(id);
	s1.setName(name);
	s1.setDept(dept);
	s1.setMarks(marks);
	System.out.println(s1);
}
}
