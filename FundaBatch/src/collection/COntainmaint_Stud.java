package collection;

import java.util.ArrayList;

public class COntainmaint_Stud {

	
	int id;
	String name,dept;
	ArrayList<Integer> m;
	

	COntainmaint_Stud (int id,String name,String dept,ArrayList<Integer> m)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.m=m;
	}
	
	public String toString() {
		return  id +" "+ name + " "+ dept + " "+ m ;
	}
}
