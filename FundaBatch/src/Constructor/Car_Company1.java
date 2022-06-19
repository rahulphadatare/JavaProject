package Constructor;

public class Car_Company1 {
	int cid, year;
	String cname;
	Car1 c1;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void setC(Car1 c1) {
		this.c1 = c1;
	}
	
	public String toString()
	{
		return cid+" "+cname+" "+c1;
	}
}
