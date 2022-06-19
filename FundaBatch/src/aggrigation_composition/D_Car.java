package aggrigation_composition;

public class D_Car {
	int id;
	String cname;
	Driver_Aggri_Comp d;
	D_Car(int id,String cname)
	{
		this.id=id;
		this.cname=cname;
	//	this.d=new d(int id, String name);
	}
	
	public String toString()
	{
		return id+" "+cname;
	}
}
