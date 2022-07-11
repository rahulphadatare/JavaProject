package Test1;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	int temp=num;
	for(int i=0;i<=9;i++)
	{
		int count=0;
		while(num!=0)
		{
			int r=num%10;
			if(r==i)
			{
				count++;
			}
			num=num/10;
		}
		num=temp;
		if(count>0)
		System.out.println(i+" "+count);
	}
}
}
