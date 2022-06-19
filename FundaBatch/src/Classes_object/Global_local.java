package Classes_object;

public class Global_local {
	int id, mark;
	String name, dept;
	void student(int id , String name, int mark, String dept)
	{
		this.id=id;
		this.mark=mark;
		this.name=name;
		this.dept=dept;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+mark+" "+dept);
	}
	
	
	
public static void main(String[] args) {
	int id=100;
	int mark=50;
	String name="ram";
	String dept="elect";
	Global_local s1=new Global_local();
	s1.student(id, name, mark, dept);
	s1.display();
}
}
