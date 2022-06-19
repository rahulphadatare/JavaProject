package Array_class;

public class Student_Uni {
	int id;
	String name,dept;
	Student_Uni(int id, String name, String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString() {
		return id+" "+name+" "+dept;
	}
			
}
