package Arrays;

public class Find_missing_no {
	public static void main(String[] args) {
		int a[]= {1,2,4,6,8,10,12,15};
		//int b=a.length;
		int b=15;
		int c=1;
		int d=0;
		
//	while(c<b)
//	{
//		if(a[c]-a[d]==1)
//		{
//			
//		}
//		else
//		{
//			//System.out.println(a[c]+" ");
//			//System.out.print(a[c]-1+" ");
//			//System.out.print(a[d]+" ");
//			
//			System.out.print(a[d]+1+" ");
//			
//		}
//		c++;
//		d++;
//	}
		while(c<=b)
		{
			if(a[d]==c)
			{
				d++;
				c++;
			}
			else if(a[d]!=c)
			{
				System.out.print(c+" ");
				c++;
			
			}
			
		}
			
		}
	
	}



