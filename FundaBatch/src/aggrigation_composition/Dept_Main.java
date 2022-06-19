package aggrigation_composition;

import java.util.Arrays;
import java.util.Scanner;

public class Dept_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Department d[]=new Department[2];
	
	
	for(int i=0;i<2;i++)
	{
		System.out.println("enter department id name"+(i+1));
		int did=sc.nextInt();
		String dname=sc.next();
		Dept_Student s[]=new Dept_Student[2];
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter student id name marks contact"+(j+1));
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			String contact=sc.next();
			
			s[j]=new Dept_Student(id,name,marks,contact);
			
		}
		d[i]=new Department(did,dname,s);
	}
	//System.out.println(Arrays.toString(d));
	
	for(Department d1:d)
	{
		for(Dept_Student s1:d1.s)
		{
			if(s1.marks>50)
			{
				System.out.println(d1.did+" "+s1.name+" "+s1.marks);
			}
		}
	}
}
}

