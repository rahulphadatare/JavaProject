package Constructor;

import java.util.Scanner;

public class Theater {
	String name,movie, address, m1, m2, m3;
	int  noseat;
	Theater()
	{
		m1="Pawankhind";
		m2="RRR";
		m3="Beast";
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	String getName()
	{
		return name;
	}
	void setMovie(String movie)
	{
		this.movie=movie;
	}
	String getMovie()
	{
		return movie;
	}
	void SetNoseat(int noseat)
	{
		this.noseat=noseat;
	}
	int getNoseat()
	{
		return noseat;
	}
	
	public String toString()
	{
		return "Theater name= \n 1) name=7* Address=7* complex Satara, Contact=000000 \n 2) name=Rajlakshmi Address=Rajpath marg Rajwada Contact=000000";
	}
	void Theter()
	{
		int noseat=getNoseat();
		String name=getName();
		String movie=getMovie();
		int price=0;
		if(name.equals("7*"))
		{
			
			
			if(movie.equals("Pawankhind"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 100, golden 150, daimond 200");
			}
			else if(movie.equals("RRR"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 150, golden 180, daimond 230");
			}
			else if(movie.equals("Beast"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 120, golden 140, daimond 190");
			}
		}
		if(name.equals("Rajlakshmi"))
		{
			
			
			if(movie.equals("Pawankhind"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 80, golden 120, daimond 150");
			}
			else if(movie.equals("RRR"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 160, golden 200, daimond 260");
			}
			else if(movie.equals("Beast"))
			{
				System.out.println("Shows 9am, 12pm, 3pm, 9pm");
				System.out.println("silve 70, golden 100, daimond 140");
			}
		}
		//System.out.println("No of seat is "+noseat+" Total amount= "+price);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Theater t=new Theater();
		
		System.out.println(t);
		System.out.println("Select theater 7*/Rajlakshmi");
		String name=sc.next();
		t.setName(name);
		System.out.println("Movies= Pawankhind/RRR/Beast");
		String movie=sc.next();
		t.setMovie(movie);
		//System.out.println("Enter No of seats");
		//int noseat=sc.nextInt();
		//t.SetNoseat(noseat);
		t.Theter();
				
	}
	
	

}
