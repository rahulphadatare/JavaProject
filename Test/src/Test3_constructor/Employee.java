package Test3_constructor;

import java.util.Scanner;

public class Employee {
		private int id,sal;
		private String name;
		 Employee(){}
		void setId(int id)
		{
			this.id=id;
		}
		void setName(String name)
		{
			this.name=name;
		}
		void setSal(int sal)
		{
			this.sal=sal;
		}
		 Employee(int id, String name, int sal)
		{
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		void display()
		{
			System.out.println(id+" "+name+" "+sal);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id,name,sal");
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();
			Employee e1=new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setSal(sal);
			e1.display();
		
			
			System.out.println("Enter id,name,sal");
			id=sc.nextInt();
			name=sc.next();
			sal=sc.nextInt();
			Employee e2=new Employee(id,name,sal);
//			e2.Employee(id, name, sal);
			e2.display();
		}
}
