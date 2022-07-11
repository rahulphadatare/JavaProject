package Moc;

import java.util.Arrays;

public class HH {
	public static void main(String[] args) {
		
	
  int a[]= {1,2,3,4,5,6,7,8};
  int n=4;
  for(int i=0;i<n;i++)
  {
	  int j, b=a[0];
	  for( j=0;j<a.length-1;j++)
	  {
		  a[j]=a[j+1];
	  }
	  a[j]=b;
  }
  
  System.out.println(Arrays.toString(a));
}
}
