package hirachical_inheritance;

public class Person_Main {
public static void main(String[] args) {
	
	Person_Student s=new Person_Student();
	s.setPersonData("raj", "55662214", "satara");
	s.setStudData(100, 68, "elect");
	s.grade();
	s.display();
	
	Person_Employee e=new Person_Employee();
	e.setPersonData("ram", "86992166", "pune");
	e.setEmpData(101, 60000, "HR");
	e.pf();
	e.display();
}
}
