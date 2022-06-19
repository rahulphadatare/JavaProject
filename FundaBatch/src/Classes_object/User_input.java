package Classes_object;

import java.util.Scanner;

public class User_input {
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

	}
	
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks+" "+sport;
	}
	
public static void main(String[] args) {
	int id,mark;
	String name,dept,sport;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter : id,name,dept,mark,sport");
	id=sc.nextInt();
	name=sc.next();
	dept=sc.next();
	mark=sc.nextInt();
	sport=sc.next();
	
	User_input s1=new User_input();
	s1.data(id, name, dept, mark, sport);
	System.out.println(s1);

}
}
