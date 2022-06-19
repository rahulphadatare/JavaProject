package day6;

public class Even_odd_while {
public static void main(String[] args) {
	int i=0, n=10;
	while(i<=n)
	{
		
	i++;
		if (i%2==0)
		{
			System.out.print(i+" ");
		}
		
	}
	while(i<n)
	{
		i++;
		if(i%2==1)
		{
			
			System.out.print(i+" ");
		}
	}
}
}