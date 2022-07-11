package inheritance;

import java.util.Scanner;

public class Person_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Person per[]=new Person[2];
	for(int j=0;j<2;j++)
	{
		System.out.println("Enter id name contact add");
		int id=sc.nextInt();
		String name=sc.next();
		String contact=sc.next();
		String add=sc.next();
		
		Person_Idproof idp[]=new Person_Idproof[2];
		for(int k=0;k<2;k++)
		{
			System.out.println("Enter name number validity");
			String iname=sc.next();
			String number=sc.next();
			String validity=sc.next();
			
			Person_Idproof i=new Person_Idproof();
			i.setName(iname);
			i.setNumber(number);
			i.setValidity(validity);
			
			idp[k]=i;
					
		}
		Person p=new Person();
		p.setId(id);
		p.setName(name);
		p.setContact(contact);
		p.setAdd(add);
		p.setI(idp);
		
		per[j]=p;
	}
	
	for(Person p:per)
	{
		for(Person_Idproof i:p.i)
		{
			if(i.getName().equals("adhar") && p.getAdd().equals("pune"))
					{
				System.out.println(p.getId()+" "+p.getName()+" "+i.getValidity()+" "+i.getName()+" "+p.getAdd());
					}
					
		}
	}
}
}
