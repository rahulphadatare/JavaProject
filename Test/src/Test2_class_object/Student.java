package Test2_class_object;

import java.util.Scanner;

public class Student {
	int id, m1, m2, m3, marks, percentage;
	String name, dept;
	void data(int i, String n, int m_1, int m_2, int m_3, String d)
	{
		id=i;
		name=n;
		m1=m_1;
		m2=m_2;
		m3=m_3;
		dept=d;
	}
	void marks()
	{
		marks=m1+m2+m3;
		System.out.println("Marks= "+marks);
	}
	void percentage()
	{
		percentage=marks*100/300;
		System.out.println("Percentage= "+percentage+"%");
	}
	void result()
	{
		if(percentage>=80)
		{
			System.out.println("1st Class");
		}
		else if(percentage>=65)
		{
			System.out.println("2st Class");
		}
		else if(percentage>=50)
		{
			System.out.println("3st Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public String toString()
	{
		return id+" "+name+" "+m1+" "+m2+" "+m3+" "+dept;
	}
	
	
public static void main(String[] args) {
	int id,m1,m2,m3;
	String name,dept;
	Scanner sc=new Scanner(System.in);
	Student s1=new Student();
	System.out.println("Enter: id, name, m1, m2, m3, dept");
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
	s1.data(id, name, m1, m2, m3, dept);
	System.out.println(s1);
	s1.marks();
	s1.percentage();
	s1.result();
	
	Student s2=new Student();
	System.out.println("Enter: id, name, m1, m2, m3, dept");
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
	s2.data(id, name, m1, m2, m3, dept);
	System.out.println(s2);
	s2.marks();
	s2.percentage();
	s2.result();
	
	Student s3=new Student();
	System.out.println("Enter: id, name, m1, m2, m3, dept");
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
	s3.data(id, name, m1, m2, m3, dept);
	System.out.println(s3);
	s3.marks();
	s3.percentage();
	s3.result();
}
}
