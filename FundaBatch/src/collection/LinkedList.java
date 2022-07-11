package collection;

import java.util.Iterator;

public class LinkedList {
public static void main(String[] args) {
	
	java.util.LinkedList<Integer> ll=new java.util.LinkedList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	
	Iterator<Integer> itr=ll.descendingIterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	//System.out.println(ll);
}
}
