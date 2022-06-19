package Arrays;

import java.util.Arrays;

public class Negative_Positive {
public static void main(String[] args) {
	int a[]= {-1,5,7,-4,3,-2,11,-9};
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int b=a[i];
				a[i]=a[j];
				a[j]=b;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
