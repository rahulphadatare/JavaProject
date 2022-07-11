package collection;

import java.util.*;



public class ArraylistMethod {
public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al1=new ArrayList<Integer>();
	ArrayList<Integer> al2=new ArrayList<Integer>();
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	System.out.println(al);
	
	Iterator<Integer> itr =al.iterator();
	 System.out.println("Iterator");
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	System.out.println("List iterator forward");
	
	
	ListIterator<Integer> litr=al.listIterator();
	while(litr.hasNext())
	{
		System.out.print(litr.next()+" ");
	}
	System.out.println();
    System.out.println("List iterator revers");
    System.out.println();
	
	 litr=al.listIterator(al.size());
	while(litr.hasPrevious())
	{
		System.out.print(litr.previous()+" ");
	}
	
	
	
//	al.add(3,100);
//	System.out.println(al);
//	al.remove(3);
//	System.out.println(al);
//	
//	System.out.println(al.indexOf(50));
//	System.out.println(al.contains(20));
//	
//	al1.add(100);
//	al1.add(200);
//	al1.add(300);
//	
//	al.addAll(al1);
//	System.out.println(al);
//	
//	al.addAll(3,al1);
//	System.out.println(al);
//	
//	al.retainAll(al1);
//	System.out.println(al);
}
}
