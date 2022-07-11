package Test1;


//no is not divided by itself or 1
public class P {
public static void main(String[] args) {
	
	
	for(int i=300; i<=400;i++)
	{
		int c=0;
		for(int a=2;a<=i/2;a++)
		{
//			System.out.println(a);
			if(i%a==0)
			{
				c++;
//				System.out.println(i);
			}
		}
		if(c==0)
		System.out.println(i);
	}
}
}

