package Arrays;

import java.util.Arrays;

public class Reverse_array {
public static void main(String[] args) {
	int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
	int b=a.length;
	int c=b;
	int d;
	//for(int i=0;i<c/2;i++)
	//for(int i=0,j=c;i<b/2;i++,j--)
	//{
//		 d=a[i];
//		a[i]=a[c];
//		a[c]=d;
//		c--;
	
		//a[i]+=a[j];
		//a[j]=a[i]-a[j];
		//a[i]=a[i]-a[j];
		
		//c--;
		//System.out.print(a[i]+" ");
		//System.out.println();
		//System.out.print(a[j]+" ");
		
//	}
	for(int i=0;i<b;i++)
	{
		a[i]+=a[b-1];
		a[b-1]=a[i]-a[b-1];
		//System.out.print(a[b-1]+" ");
		a[i]=a[i]-a[b-1];
		b--;
	}
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+" ");
//	}
	System.out.println("Reverse array is \n"+Arrays.toString(a));//utility class
	
}
}
