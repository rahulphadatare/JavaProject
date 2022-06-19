package Constructor;

public class Car_Company {
	int cid, year;
	String cname;
	Car c;
	Car_Company(int cid, String cname, int year, Car c)
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
