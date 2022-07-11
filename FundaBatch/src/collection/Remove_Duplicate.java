package collection;

import java.util.ArrayList;

public class Remove_Duplicate {
public static void main(String[] args) {
	
	ArrayList<Integer> a= new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(1);
	a.add(3);
	a.add(5);
	a.add(1);
	a.add(3);
	a.add(7);
	a.add(6);
	a.add(1);
	
	System.out.println(a);
	ArrayList<Integer> b= new ArrayList<Integer>();
	
	for(int i=0;i<a.size();i++)
	{
		if(!b.contains(a.get(i)))
		{
			b.add(a.get(i));
		}
	}
	System.out.println(b);
	
//	for(int i=0;i<a.size();i++)
//	{
//		int cnt=0;
//		for(int j=0;j<a.size();j++)
//		{
//			if(a.get(i)==a.get(j) && j<i)
//			{
//				break;
//			}
//			else if(a.get(i)==a.get(j) && j>=i)
//			{
//				cnt++;
//			}
//		}
//		if(cnt!=0)
//		{
//			b.add(a.get(i));
//		}
//	}
//	System.out.println(b);
}
}
