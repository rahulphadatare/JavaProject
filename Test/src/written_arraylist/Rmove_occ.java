package written_arraylist;

import java.util.ArrayList;

public class Rmove_occ {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		ArrayList<String>al2=new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{int cnt=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)==al.get(j) && j<i)
				{
					break;
				}
				
				else if(al.get(i)==al.get(j) && j>=i)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				al2.add(al.get(i));
			}
		}
		System.out.println(al2);
	}
}
