package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main {
public static void main(String[] args) {
	
	ArrayList<Student> a=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	char ch=' ';
	do
	{
		System.out.println("Enter id name dept marks");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int marks=sc.nextInt();
		a.add(new Student(id,name,dept,marks));
		System.out.println("Add next student(y/n)");
		ch=sc.next().charAt(0);
	}
	
	while(ch=='y');
	System.out.println(a);
//	a.add(new Student(100,"raj","elec",70));
//	a.add(new Student(101,"ram","comp",50));
//	a.add(new Student(102,"mahesh","elec",60));
//	a.add(new Student(103,"ganesh","mech",70));
//	a.add(new Student(104,"omkar","elec",70));
//	a.add(new Student(105,"rakesh","mech",70));
//	a.add(new Student(106,"suraj","entc",60));
	
	for(Student s:a)
	{
		if(s.dept.equals("elec") && s.marks>60)
		{
			System.out.println(s);
		}
	}
}
}
