package Test1;

import java.util.Scanner;

public class Frequency_digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int a1=0, a2=0, a3=0, a4=0, a5=0, a6=0, a7=0, a8=0, a9=0, a0=0;
	while(a!=0)
	{
		int b=a%10;
		if(b==1)
		{
			
			a1++;
		}
		else if(b==2)
		{
			
			a2++;
		}else if(b==3)
		{
			 
			a3++;
		}else if(b==4)
		{
			
			a4++;
		}else if(b==5)
		{
			
			a5++;
		}else if(b==6)
		{
		
			a6++;
		}else if(b==7)
		{
			
			a7++;
		}else if(b==8)
		{
			 
			a8++;
		}else if(b==9)
		{
			 
			a9++;
		}else if(b==0)
		{
			
			a0++;
		}
		a=a/10;
	}
	System.out.println("1= "+a1);
	System.out.println("2= "+a2);
	System.out.println("3= "+a3);
	System.out.println("4= "+a4);
	System.out.println("5= "+a5);
	System.out.println("6= "+a6);
	System.out.println("7= "+a7);
	System.out.println("8= "+a8);
	System.out.println("9= "+a9);
	System.out.println("0= "+a0);
	
}
}
