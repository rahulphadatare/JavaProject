package Test1;

import java.util.Scanner;

public class Krishna {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	int temp=num;
	int count=1;
	int m=0;
	while(num!=0)
	{
		int r=num%10;
		while(r!=0)
		{
//			System.out.println(r);
			count*=r;
			r--;
//			System.out.println(count);
		}
		m+=count;
//		System.out.println(m);
		count=1;
		num=num/10;
	}
//	num=temp;
	if(temp==m)
	{
		System.out.println("No is krishnamurthi");
	}
	else
		System.out.println("No is not krishnamurthi");
	
}
}
