package Empolyee;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	Employee emp[]=new Employee[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("Employee "+(i+1));
		System.out.println("Enter id name dept sal location");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int sal=sc.nextInt();
		String location=sc.next();
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSal(sal);
		e.setLocation(location);
		
		emp[i]=e;
	}
	
	for(Employee a:emp)
	{
		if(a.getDept().equals("HR") && a.getSal()>30000)
		{
			System.out.println(a);
		}
	}
}
}
