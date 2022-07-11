package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Department_Employee {
	int eid,sal;
	String ename;
	Department_Employee(int eid,String ename,int sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}
	public String toString()
	{
		return eid+" "+ename+" "+sal;
	}
public static void main(String[] args) {
	char c=' ';
	Scanner sc=new Scanner(System.in);
	ArrayList<Department> d=new ArrayList<Department>();
	do
	{
		System.out.println("Enter id,deptname");
		int id=sc.nextInt();
		String name=sc.next();
		ArrayList<Department_Employee> e=new ArrayList<Department_Employee>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id name sal");
			int eid=sc.nextInt();
			String ename=sc.next();
			int sal=sc.nextInt();
			e.add(new Department_Employee(eid,ename,sal));
		}
		d.add(new Department(id,name,e));
		System.out.println("Add next Emp(y/n)");
		c=sc.next().charAt(0);
	}
	while(c=='y');
	
	
	System.out.println(d);
	
	for(Department di:d)
	{
		for(Department_Employee e:di.e)
		{
			if(e.sal==60000)
			{
				System.out.println(e);
			}
		}
	}
		
	
			
}
}
