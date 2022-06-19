package Arrays;

public class Duplicate_no {
public static void main(String[] args) {
	int a[]= {1, 5, 4, 7, 11, 5, 3, 1, 7,7,7, 7 , 7};
	int b[]=new int[a.length];
	int c=0;
	for(int i=0;i<a.length;i++) 
	{
		
		c=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				c++;
				b[j]=1;
				//System.out.println("Duplicates= "+a[i]);
			}
		}
		if(b[i]==1 )
		{
			b[i]=c;
		}
	
	}
	for(int i=0;i<a.length;i++)
	{
		if(b[i]>0&& b[i]<2)
		{
			System.out.println("Duplicates= "+a[i]);
		}
	}
	
}
}
