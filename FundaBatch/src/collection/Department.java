package collection;

import java.util.ArrayList;

public class Department {

	int id;
	String name;
	ArrayList<Department_Employee> e;
	
	Department(int id,String name,ArrayList<Department_Employee> e)
	{
		this.id=id;
		this.name=name;
		this.e=e;
	}
	
	public String toStirng()
	{
		return id+" "+name+" "+e;
	}
}
