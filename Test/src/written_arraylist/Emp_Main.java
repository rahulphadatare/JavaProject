package written_arraylist;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Emp_Main {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	LinkedList<Emp> e=new LinkedList<Emp>();
	System.out.println("Enter id name dept");
	for(int i=0;i<6;i++)
	{
		
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		e.add(new Emp(id,name,dept));
		
	}
	System.out.println(e);
	String dept = null;
	for(int i=0;i<e.size();i++)
	{
		if(e.get(i).id==10)
		{
			dept=e.get(i).dept;
		}
	}
	
	ListIterator<Emp> l=e.listIterator();
	while(l.hasNext())
	{
		Emp em=l.next();
		if(em.dept.equals(dept)) 
		{
			l.remove();
		}
	}
	
	
//	ListIterator<Emp> l=e.listIterator();
//	while(l.hasNext())
//	{
//		if(l.next().dept.equals(e.get(8).dept)) 
//		{
//			l.remove();
//		}
//	}
	System.out.println(e);
	
	
	

	
}
}
