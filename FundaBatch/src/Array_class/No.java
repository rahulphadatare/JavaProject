package Array_class;
import java.util.Arrays;
import java.util.Scanner;
public class No {
	



	
	public static void main(String[] args) {
		
		
		int m[]= {1,2,3,4,5};
		int k[]= {4,5,6,7,8};
		
		
		
		int b=0;
		int arr3[]=new int[6];
		
		for(int i=0;i<5;i++)
		{
			int c=0;
			for(int j=0;j<5;j++)
			{
				if(m[i] == k[j])
				{
					c++;
				}
			
			}
			if(c==0)
			{
				arr3[b]=m[i];
				b++;
			}
			
		}
		//System.out.println(c);

		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(k));
		System.out.println(Arrays.toString(arr3));
	}
	

}
