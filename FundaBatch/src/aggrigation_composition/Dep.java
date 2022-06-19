package aggrigation_composition;

import java.util.Arrays;

public class Dep {
	int did;
	String dname;
	Dep_Stud s[];
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Dep_Stud[] getS() {
		return s;
	}
	public void setS(Dep_Stud[] s) {
		this.s = s;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(s);
	}
}
