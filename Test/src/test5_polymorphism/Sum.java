package test5_polymorphism;

import java.util.Scanner;



public class Sum {
	double series(double n)
	{
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum+=1/i;
		}
//		while(n!=0)
//		{
//			sum+=1/n;
//			n--;
//		}
		System.out.println("Sum= "+sum);
		return sum;
	}
	double series(double a, double n)
	{
		double sum,total=0,b=1;
		for(int i=1;i<=n;i++)
		{
			sum=1;
			for(int j=1;j<=b+1;j++)
			{
				sum*=a;
			}

			total+=b/sum;
			b+=3;
			
		}
		
//		for(double i=0;i<n;i++)
//		{
//			total+=b/a*(b+1);
//			b+=3;
//		}
		System.out.println("Series of a and n= "+total);
		return total;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sum s=new Sum();
		System.out.println("Enter a no");
		double n=sc.nextDouble();
		s.series(n);
		
		System.out.println("Enter 2 no");
		n=sc.nextDouble();
		double a=sc.nextDouble();
		s.series(a, n);
	}
}
