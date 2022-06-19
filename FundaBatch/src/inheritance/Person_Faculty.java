package inheritance;

public class Person_Faculty extends Person {
	int id,sal;
	String sub,performance;
	int b=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	void bonus()
	{
		switch(performance)
		{
		case "A":
		{
			b=sal*20/100;
			break;
		}
		case "B":
		{
			b=sal*15/100;
			break;
		}
		case "C":
		{
			b=sal*10/100;
			break;
		}
		case "d":
		{
			b=sal*5/100;
			break;
		}
		}
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+sub+" "+performance+" "+sal+" "+(sal+b));
	}
}
