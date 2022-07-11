package collection;

import java.util.ArrayList;

public class Avrage {
public static void main(String[] args) {
	
	ArrayList<Float> a=new ArrayList<Float>();
	
	a.add(70.40f);
	a.add(70.80f);
	a.add(81.25f);
	a.add(91.15f);
	a.add(67.11f);
	
	float sum=0;
	for(Float f:a)
	{
		sum+=f;
	}
	
	System.out.println("Avrage is = "+sum/a.size()+"%");
	
}
}
