package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Containment {
public static void main(String[] args) {
	
	ArrayList<COntainmaint_Stud> a=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	char ch=' ';
	do
	{
		System.out.println("Enter id name dept");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		
		ArrayList<Integer> m=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a marks");
			int m1=sc.nextInt();
			m.add(m1);
		}
		a.add(new COntainmaint_Stud(id,name,dept,m));
		System.out.println("Add next student(y/n)");
		ch=sc.next().charAt(0);
	}
	
	while(ch=='y');
	
	for(COntainmaint_Stud s:a)
	{
		int sum=0;
		for(Integer m:s.m)
		{
			sum+=m;
		}
		double per =sum/s.m.size();
		System.out.println(s.name+" "+per);
	}
}
}
