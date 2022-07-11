package test5_polymorphism;

public class Student {
	int roll;
	String sname;
	Student_Department d;
	Student(int roll, String sname, Student_Department d)
	{
		this.roll=roll;
		this.sname=sname;
		this.d=d;
	}
	
	public String toString()
	{
		return roll+" "+sname+" "+d;
	}
}
