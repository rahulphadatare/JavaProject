package Array_class;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Uni_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String x[]=new String [3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter array 1 id name dept student "+(i+1));
		int id=sc.nextInt();
		String name=sc.next();
		String dept =sc.next();
		Student_Uni s=new Student_Uni(id, name, dept);
		x[i]=id+" "+name+" "+dept;
	}
	
	String y[]=new String [3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter array 2 id name dept "+(i+1));
		int id=sc.nextInt();
		String name=sc.next();
		String dept =sc.next();
		Student_Uni s=new Student_Uni(id, name, dept);
		y[i]=id+" "+name+" "+dept;
	}
	int k=0;
	for(int i=0;i<3;i++)
	{
		
		for(int j=0;j<3;j++)
		{
			if(x[i].equals(y[j]))
			{
				k++;
			}
			
		}
	}
	String arr3[]=new String[6-(k*2)];
	int b=0;
	
	for(int i=0;i<3;i++)
	{
		int c=0;
		for(int j=0;j<3;j++)
		{
			if(x[i].equals(y[j]))
			{
				c++;
				k++;
			}
		
		}
		if(c==0)
		{
			arr3[b]=x[i];
			b++;
		}
		
	}
	
	for(int i=0;i<3;i++)
	{
		int c=0;
		for(int j=0;j<3;j++)
		{
			if(y[i].equals(x[j]))
			{
				c++;
			}
		
		}
		if(c==0)
		{
			arr3[b]=y[i];
			b++;
		}
		
	}
	//System.out.println(c);

	System.out.println(Arrays.toString(x));
	System.out.println(Arrays.toString(y));
	System.out.println(Arrays.toString(arr3));
}
}
