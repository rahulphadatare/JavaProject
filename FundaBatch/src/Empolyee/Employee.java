package Empolyee;

public class Employee {

	int id, sal;
	String name,dept,location;
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}
	void setSal(int sal)
	{
		this.sal=sal;
	}
	void setLocation(String location)
	{
		this.location=location;
	}
	
	String getDept()
	{
		return dept;
	}
	int getSal()
	{
		return sal;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+sal+" "+location;
	}
	
	
}
