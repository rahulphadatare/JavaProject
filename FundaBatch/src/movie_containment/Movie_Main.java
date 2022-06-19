package movie_containment;

import java.util.Scanner;

public class Movie_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Movie mov[]=new Movie[2];
	
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter movie id name boxofficeclollection ");
		int mid=sc.nextInt();
		String mname=sc.next();
		int boxofficecollection=sc.nextInt();
		
		Actor act[]=new Actor[2];
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter actor id name birthyear add");
			int id=sc.nextInt();
			String name=sc.next();
			int birthyear=sc.nextInt();
			String add=sc.next();
			
			Actor a=new Actor();
			a.setId(id);
			a.setName(name);
			a.setBirthyear(birthyear);
			a.setAdd(add);
			
			act[j]=a;
		}
		Movie m=new Movie();
		m.setId(mid);
		m.setMname(mname);
		m.setBoxofficecollection(boxofficecollection);
		m.setA(act);
		
		mov[i]=m;
	}
	
	for(Movie m:mov)
	{
		for(Actor a:m.act)
		{
			if(a.getName().equals("salman")&& m.getBoxofficecollection()>5000000)
			{
				System.out.println(m.getMname()+" "+a.getName()+" "+a.getBirthyear()+" "+m.getBoxofficecollection());
			}
		}
	}
}
}
