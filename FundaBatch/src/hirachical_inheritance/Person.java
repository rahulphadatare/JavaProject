package hirachical_inheritance;

public class Person {
	String name,contact,add;
	
	void setPersonData(String name, String contact,String add)
	{
		this.name=name;
		this.contact=contact;
		this.add=add;
	}
	
	 void display()
	{
		System.out.println(name+" "+contact+" "+add);
	}
}
