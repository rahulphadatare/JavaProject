package Array_class;

public class Student {

	int id,marks;
	String name,dept;
	
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
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	String getDept()
	{
		return dept;
	}
	int getMarks()
	{
		return marks;
	}
	
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	
	
	
	
}
