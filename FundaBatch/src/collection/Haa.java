package collection;
import java.util.*;
public class Haa {
	public static void main(String[] args) {
		
	
ArrayList<Integer> al=new ArrayList<>() ;
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.print(al+" ");
	ArrayList<Integer> al1=new ArrayList<>();
	for(int i=0;i<al.size();i++)
	{
		 int cnt=0;
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
			
			al1.add(al.get(i));
		}
   }
	System.out.println(al1);
}
}
