package Array_class;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Main_object {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
	
	Student_Uni x[]=new Student_Uni [3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter array 1 id name dept student "+(i+1));
		int id=sc.nextInt();
		String name=sc.next();
		String dept =sc.next();
		Student_Uni s=new Student_Uni(id, name, dept);
		x[i]=s;
	}
	
	Student_Uni y[]=new Student_Uni [3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter array 2 id name dept "+(i+1));
		int id=sc.nextInt();
		String name=sc.next();
		String dept =sc.next();
		Student_Uni s=new Student_Uni(id, name, dept);
		y[i]=s;
	}
	int k=0;
	for(Student_Uni stud:x)
	{
		for(Student_Uni st:y)
		{
			if(stud.id==st.id && stud.name.equals(st.name) && stud.dept.equals(st.dept))
			{
				k++;
			}
		}
	}
	Student_Uni arr3[]=new Student_Uni[6-(k*2)];
	int b=0;
	
	for(Student_Uni stud:x)
	{
		int c=0;
		for(Student_Uni st:y)
		{
			if(stud.id==st.id && stud.name.equals(st.name) && stud.dept.equals(st.dept))
			{
				c++;
			}
		}
		if(c==0)
		{
		arr3[b]=stud;
		b++;
		}
	}
	for(Student_Uni stud:y)
	{
		int c=0;
		for(Student_Uni st:x)
		{
			if(stud.id==st.id && stud.name.equals(st.name) && stud.dept.equals(st.dept))
			{
				c++;
			}
		}
		if(c==0)
		{
		arr3[b]=stud;
		b++;
		}
	}

	System.out.println(Arrays.toString(x));
	System.out.println(Arrays.toString(y));
	System.out.println(Arrays.toString(arr3));
}
}
