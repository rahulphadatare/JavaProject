package Test3_constructor;

import java.util.Scanner;

public class One_another_object {
		int id;
		String name;
		One_another_object(int id,String name)
		{
			id=id;
			name=name;
		}
		void copy(One_another_object a)
		{
			id=a.id;
			name=a.name;
			System.out.println(id+" "+name);
		}
//		void setId(int id)
//		{
//			this.id=id;
//		}
//		void setName(String name)
//		{
//			this.name=name;
//		}
		int getId()
		{
			return id;
		}
		String getName()
		{
			return name;
		}
		void display()
		{
			System.out.println(id+" "+name);
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id name");
			int id=sc.nextInt();
			String name=sc.next();
			One_another_object a1=new One_another_object(id,name);
		
//			a1.setId(id);
//			a1.setName(name);
//			One_another_object a2=new One_another_object(a1);
			One_another_object a2=new One_another_object(a1.getId(),a1.getName()+"b");
//			One_another_object a3=new One_another_object(a1.id,a1.name);
			a1.display();
			a2.display();
//			a3.display();
//			a1.copy(a1);
		}
}
