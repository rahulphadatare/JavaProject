package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Remove_Add {
public static void main(String[] args) {
	
ArrayList<Integer> a1=new ArrayList<Integer>();
	
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	
	System.out.println(a1);
	
//	for(Integer i:a1) // it gives ConcurrentModificationException
//	{
//		if(i==20)  // fail fast iterator
//		{
//			a1.add(200);
//		}
//	}
	
	ListIterator<Integer> l=a1.listIterator();
	while(l.hasNext())
	{
		if(l.next()==20)  // fail safe iterator
		{
			l.remove();
		}
	}
	System.out.println(a1);
}
}
