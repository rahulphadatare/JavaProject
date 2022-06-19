package movie_containment;

import java.util.Arrays;

public class Movie {
	int mid, boxofficecollection;
	String mname;
	Actor a[];
	public Actor[] act;
	public int getId() {
		return mid;
	}
	public void setId(int mid) {
		this.mid = mid;
	}
	public int getBoxofficecollection() {
		return boxofficecollection;
	}
	public void setBoxofficecollection(int boxofficecollection) {
		this.boxofficecollection = boxofficecollection;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Actor[] getA() {
		return act;
	}
	public void setA(Actor act[]) {
		this.act = act;
	}
	
	public String toString()
	{
		return mid+" "+mname+" "+boxofficecollection+" "+Arrays.toString(a);
	}
	
}
