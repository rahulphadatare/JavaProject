package day7;

public class Addition_odd {
public static void main(String[] args) {
	int sum=0;
	
	for(int i=1;i<=10;i++)
	{
		if(i%2==1)
		{
			sum=sum+i;
		}
	}
	System.out.println("Addition of odd= "+sum);
}
}
