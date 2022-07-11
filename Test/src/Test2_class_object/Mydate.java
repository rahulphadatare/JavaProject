package Test2_class_object;

import java.util.Scanner;

public class Mydate {
	int date, month, year, d1, d2, m1, m2;
	
	void data(int d, int m, int y)
	{
		date=d;
		month=m;
		year=y;
	}
	void date()
	{
		if(date>0 && date<=31 && month>0 && month<=12)
		{
		if(date<10 && month<10)
		{
			d1=0;
			d2=date;
			m1=0;
			m2=month;
		}
		else
		{
		d1=date/10;
		d2=date%10;
		m1=month/10;
		m2=month%10;
		}
		}
		else
		{
			System.out.println("Date or Month Invalid");
		}
		System.out.println(d1+""+d2+"/"+m1+""+m2+"/"+year);
	}
	
	public String toString()
	{
		return date+" "+month+" "+year;
	}
	
public static void main(String[] args) {
	int date, month, year;
	Scanner sc=new Scanner(System.in);
	
	Mydate d1=new Mydate();
	System.out.println("Enter: date, month, year");
	date=sc.nextInt();
	month=sc.nextInt();
	year=sc.nextInt();
	d1.data(date, month, year);
	System.out.println(d1);
	d1.date();
	
	Mydate d2=new Mydate();
	System.out.println("Enter: date, month, year");
	date=sc.nextInt();
	month=sc.nextInt();
	year=sc.nextInt();
	d2.data(date, month, year);
	System.out.println(d2);
	d2.date();
	
	Mydate d3=new Mydate();
	System.out.println("Enter: date, month, year");
	date=sc.nextInt();
	month=sc.nextInt();
	year=sc.nextInt();
	d3.data(date, month, year);
	System.out.println(d3);
	d3.date();
}
}
