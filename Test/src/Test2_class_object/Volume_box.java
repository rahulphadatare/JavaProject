package Test2_class_object;

import java.util.Scanner;

public class Volume_box {
	double length, width, height,volume;
	
	void box(double l, double w, double h)
	{
		length=l;
		width=w;
		height=h;
	}
	 void volume()
	{
		 volume= (length*width*height);
		
	}
	public String toString()
	{
		return("Volume= "+(length*width*height));
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Volume_box b1=new Volume_box();
	System.out.println("Enter length width  height");
	double len=sc.nextDouble();
	double wid=sc.nextDouble();
	double hei=sc.nextDouble();
	b1.box(len,wid,hei);
//	b1.volume();
	System.out.println(b1);
	
	Volume_box b2=new Volume_box();
	System.out.println("Enter length width  height");
	 len=sc.nextDouble();
	 wid=sc.nextDouble();
	 hei=sc.nextDouble();
	b2.box(len,wid,hei);
	b2.volume();
	
	Volume_box b3=new Volume_box();
	System.out.println("Enter length width  height");
	 len=sc.nextDouble();
	 wid=sc.nextDouble();
	 hei=sc.nextDouble();
	b3.box(len,wid,hei);
	b3.volume();
	
	Volume_box b4=new Volume_box();
	System.out.println("Enter length width  height");
	 len=sc.nextDouble();
	 wid=sc.nextDouble();
	 hei=sc.nextDouble();
	b4.box(len,wid,hei);
	b4.volume();
}
}
