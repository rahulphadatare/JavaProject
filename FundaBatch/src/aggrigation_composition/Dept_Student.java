package aggrigation_composition;

public class Dept_Student {
	int id,marks;
	String name, contact;
	
	Dept_Student(int id,String name, int marks, String contact)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.contact=contact;
	}
	

	
	
	public String toString()
	{
		return id+" "+name+" "+marks+" "+contact;
	}
}
