package Array_class;

import java.util.Arrays;
import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
Student stud[]=new Student[size];

	for(int i=0;i<size;i++)
	{
		Student s1=new Student();
		System.out.println("Enter id name dept marks");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int marks=sc.nextInt();
		s1.setId(id);
		s1.setName(name);
		s1.setDept(dept);
		s1.setMarks(marks);
//		s1.getId();
//		s1.getName();
//		s1.getDept();
//		s1.getMarks();
		stud[i]=s1;
		
	//	stud[i]=new Student(id,name,dept,mrks);  use parameter constructor
	
		
	}
	for(Student a:stud)
	{
		System.out.println(a);
	}
	//System.out.println(Arrays.toString(stud));
}
}
