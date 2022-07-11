package test5_polymorphism;

public class Student_Department {
		int id;
		String name;
	Student_Department(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public String toString()
	{
		return id+" "+name;
	}
}
