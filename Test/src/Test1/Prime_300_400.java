package Test1;

public class Prime_300_400 {
public static void main(String[] args) {
	int a=2;
	int b=0;
	
	
	for(int i=300;i<=400;i++)
	{
//		System.out.println(i);
		while(a<=i/2)
		{
			a++;
//			System.out.println(i);
			if((i/2)%a==0)
			{
				b++;
//				System.out.println(b);
				
			}
			
//			System.out.println(a);
			if(b==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
}
