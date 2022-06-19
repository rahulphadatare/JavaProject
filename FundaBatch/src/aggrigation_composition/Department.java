package aggrigation_composition;

import java.util.Arrays;

public class Department {
	int did;
	String dname;
	Dept_Student s[];
	Department(int did, String dname, Dept_Student s[])
	{
		this.did=did;
		this.dname=dname;
		this.s=s;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(s);
	}
}
