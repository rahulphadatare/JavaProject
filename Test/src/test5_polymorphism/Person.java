package test5_polymorphism;

public class Person {
	int age;
	String name,gender;
	Peron_add a;
	void setName(String name)
	{
		this.name=name;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	
	void seta(Peron_add a)
	{
		this.a=a;
	}
	Peron_add geta()
	{
		return a;
	}
	
//	int getAge()
//	{
//		return age;
//	}
//	String getName()
//	{
//		return name;
//	}
//	String getGender()
//	{
//		return gender;
//	}
	
	public String toString()
	{
		return name+" "+gender+" "+age+" "+a;
	}
}
