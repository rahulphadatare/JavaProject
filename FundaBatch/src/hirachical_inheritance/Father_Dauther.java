package hirachical_inheritance;

public class Father_Dauther extends Father {
	String vehical;
	
	void setDautherData(String vehical)
	{
		this.vehical=vehical;
	}
	
	public String toString()
	{
		return name+" "+surname+" "+age+" "+vehical;
	}
}
