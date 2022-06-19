package Classes_object;

public class Student {
	int id,marks;
	String name,dept,sport;
	void data(int i, String n, String d, int m, String s)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
		sport=s;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks+" "+sport);
//		System.out.println(name);
//		System.out.println(dept);
//		System.out.println(marks);
		
	}
	void sportm()
	{
		if(sport.equals("Badminton"))
		{
			marks=marks+4;
			System.out.println(marks);
		}
		else if(sport.equals("hocky"))
		{
			marks=marks+3;
			System.out.println(marks);
		}
		else if(sport.equals("khokho"))
		{
			marks=marks+5;
			System.out.println(marks);
		}
		else {
			
		}
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks+" "+sport;
	}
	
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	
	s1.data(21, "rahul", "elec", 60, "hocky");
//	System.out.println(s1);
	s1.display();
	s1.sportm();

	s2.data(25, "raj", "comp", 45, "Badminton");
	s2.display();
	s2.sportm();

	s3.data(55, "joy", "civil", 79,"khokho");
	s3.display();
	s3.sportm();
	
	System.out.println(s1);
}
}
