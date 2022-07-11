package Moc;

import java.util.Scanner;

public class Employee {
   int id,sal;
   String name,dept;
   
//   Employee(int id, String name, String dept, int sal)
//   {
//	   this.id=id;
//	   this.name=name;
//	   this.dept=dept;
//	   this.sal=sal;
//   }
   
   void setId(int id)
   {
	   this.id=id;
   }
   int getId()
   {
	   return id;
   }
   void setName(String name)
   {
	   this.name=name;
   }
   String getName()
   {
	   return name;
   }
   void setDept(String dept)
   {
	   this.dept=dept;
   }
   String getDept()
   {
	   return dept;
   }
   void setSal(int sal)
   {
	   this.sal=sal;
   }
   int getSal()
   {
	   return sal;
   }
   
   public String toString()
   {
	   return id+" "+name+" "+dept+" "+sal;
   }
   
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter id name dept sal");
	   int id=sc.nextInt();
	   String name=sc.next();
	   String dept=sc.next();
	   int sal=sc.nextInt();
	   
	 //  Employee e2=new Employee(id, name, dept, sal);
	   Employee e1=new Employee();
	   e1.setId(id);
	   e1.setName(name);
	   e1.setDept(dept);
	   e1.setSal(sal);
	   
	   System.out.println(e1);
	  // System.out.println(e2);
}
}
