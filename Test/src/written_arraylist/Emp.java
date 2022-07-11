package written_arraylist;

public class Emp {

	int id;
	String name,dept;
	Emp(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
}
