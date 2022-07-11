package collection;

import java.util.ArrayList;

public class Car_Company {

	int cid;
	String cname;
	ArrayList<Car> c;
	Car_Company(int cid,String cname,ArrayList<Car> c)
	{
		this.cid=cid;
		this.cname=cname;
		this.c=c;
	}
	
	public String toString()
	{
		return cid+" "+cname+" "+c;
	}
}
