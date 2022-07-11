package written_arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class REverse_direction {
	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(70);
		l.add(30);
		l.add(40);
		l.add(80);
		l.add(50);
		l.add(60);
		System.out.println("Forword Direction:");
		System.out.println(l);
		System.out.println("Reverse Direction:");
	
		
		ListIterator<Integer>itr=l.listIterator(l.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}
}
