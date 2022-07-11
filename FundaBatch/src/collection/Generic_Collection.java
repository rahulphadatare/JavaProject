package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_Collection {
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
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no");
	int no=sc.nextInt();
	int cnt=0;
	for(Integer i:a1)
	{
		if(no==i)
		{
			cnt++;
		}
	}
	System.out.println("Occurance of "+no+" is "+cnt);
	
//	for(int i=0;i<a1.size();i++)
//	{
//		 cnt=0;
//		for(int j=0;j<a1.size();j++)
//		{
//			if(a1.get(i).equals(a1.get(j)) && j<i)
//			{
//				break;
//			}
//			if(a1.get(i).equals(a1.get(j)) && j>=i)
//			{
//				cnt++;
//			}
//		}
//		if(cnt!=0)
//		{
//			System.out.println(a1.get(i)+" "+cnt);
//		}
//	}
}
}
