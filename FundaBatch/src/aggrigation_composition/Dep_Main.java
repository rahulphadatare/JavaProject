package aggrigation_composition;

import java.util.Arrays;
import java.util.Scanner;
public class Dep_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dep d[]=new Dep[3];
		
		
		for(int i=0;i<2;i++)
		{
			System.out.println("enter department id name"+(i+1));
			int did=sc.nextInt();
			String dname=sc.next();
			Dep_Stud s[]=new Dep_Stud[5];
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter student id name marks contact"+(j+1));
				int id=sc.nextInt();
				String name=sc.next();
				int marks=sc.nextInt();
				String contact=sc.next();
				
				Dep_Stud d1=new Dep_Stud();
				d1.setId(id);
				d1.setName(name);
				d1.setMarks(marks);
				d1.setContact(contact);
				
				s[j]=d1;
				
			}
			//System.out.println(Arrays.toString(s));
			Dep d2=new Dep();
			d2.setDid(did);
			d2.setDname(dname);
			d2.setS(s);
			//System.out.println(d2.s);
			d[i]=d2;
		}
		System.out.println(Arrays.toString(d));
		
		for(Dep d1:d)
		{
			for(Dep_Stud s1:d1.s)
			{
				if(s1.marks>60)
				{
					System.out.println(d1.did+" "+s1.name+" "+s1.marks);
				}
			}
		}
	}
	}


