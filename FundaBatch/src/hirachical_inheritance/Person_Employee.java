package hirachical_inheritance;

public class Person_Employee extends Person {
	int id,sal,pf;
	String dept;
	
	void setEmpData(int id,int sal,String dept)
	{
		this.id=id;
		this.sal=sal;
		this.dept=dept;
	}
	
	void pf()
	{
		pf=sal*15/100;
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+sal+" "+dept+" "+pf);
	}
}
