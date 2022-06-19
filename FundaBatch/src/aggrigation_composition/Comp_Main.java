package aggrigation_composition;

import java.util.Arrays;
import java.util.Scanner;

public class Comp_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	

	Company com[]=new Company[2];
	
	
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter company name "+(i+1));
		String cname=sc.next();
		int totalemp=com.length;
		Comp_Employee emp[]=new 	Comp_Employee[2];
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter employee id name dept sal contact add"+(j+1));
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int sal=sc.nextInt();
			String contact=sc.next();
			String add=sc.next();
			
			Comp_Employee e=new Comp_Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSal(sal);
			e.setContact(contact);
			e.setAdd(add);
			
			emp[j]=e;
		}
		Company c=new Company();
		c.setName(cname);
		c.setTotalemp(totalemp);
		c.setEmp(emp);
		
		com[i]=c;
	}
	//System.out.println(Arrays.toString(com));
	
//	for(Company c:com)
//	{
//		for(Comp_Employee e:c.emp)
//		{
//			if(e.getAdd().equals("pune") && e.getSal()>30000)
//			{
//				System.out.println(c.cname+" "+e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSal()+" "+e.getContact()+" "+e.getAdd());
//			}
//		}
//	}
	for(Company c:com)
		{
			
			for(Comp_Employee e:c.emp)
			{
				int b=0;
				if( e.getSal()>50000)
				{
					b=e.getSal()*15/100;
					System.out.println(c.cname+" "+"old sal "+e.getSal()+" "+"new sal "+(e.getSal()+b));
				}
			}
		}
	
	
	
	
	
	sc.close();
	
	
}
}
