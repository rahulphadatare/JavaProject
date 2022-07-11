package Moc;

import java.util.Arrays;

public class Even_odd {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				//System.out.print(a[i]+" ");
				b[c]=a[i];
				c++;

			}
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				//System.out.print(a[i]+" ");
				b[c]=a[i];
				c++;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}
