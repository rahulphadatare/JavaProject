package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collenction_Hetrogeneric {
public static void main(String[] args) {
	
	ArrayList a1=new ArrayList();
	
	a1.add(50);
	a1.add(60);
	a1.add(80);
	a1.add("raj");
	a1.add(54.5f);
	a1.add("roy");
	a1.add(new Stud(100,"ram",60));
	a1.add(new Stud(101,"sham",80));
	
	
	//System.out.println(Arrays.toString(a1));
	System.out.println(a1);
	for(Object o:a1)
	{
		String s=o.getClass().getName();
		if(s.equalsIgnoreCase("Collection.Stud"))
		{
		System.out.println(o);
		}
	}
}
}
