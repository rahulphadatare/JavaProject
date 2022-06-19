package aggrigation_composition;

import java.util.Arrays;

public class Company {
	int totalemp;
	String cname;
	Comp_Employee emp[];
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public String getName() {
		return cname;
	}
	public void setName(String cname) {
		this.cname = cname;
	}
	public Comp_Employee[] getEmp() {
		return emp;
	}
	public void setEmp(Comp_Employee emp[] ) {
		this.emp = emp;
	}
	
	public String toString()
	{
		return cname+" "+totalemp+" "+Arrays.toString(emp);
	}
}
