package Moc;

import java.util.Arrays;

public class Ocuurance {


public static void main(String [] args)
{
int arr[]={1,2,1,4,5,7,-1,-1,-2};
int arr1[]=new int[arr.length];
for(int i=0;i<arr.length;i++)
{
	int cnt=1;
  for(int j=i+1;j<arr.length;j++)
  {
     if(arr[i]==arr[j])
     {
	cnt++;
      arr1[j]=-1; 
     }
  }
  
  //System.out.println(Arrays.toString(arr1));
  if(arr1[i]>=0)
  {
     arr1[i]=cnt;
  }

  if(arr1[i]>=0)
  {
    System.out.println(arr[i]+" "+cnt);
  }
  //System.out.println(Arrays.toString(arr));
 // System.out.println(Arrays.toString(arr1));

//	for(int i=0;i<arr.length;i++)
//	{
//		int cnt=1;
//		for(int j=i+1;j<arr.length;i++)
//		{
//			if(arr[i]==arr[j])
//			{
//				cnt++;
//				arr[j]=-1;
//			}
//		}
//		if(arr[i]!=-1)
//		{
//			System.out.println(arr[i]);
//		}
//	}
}
}
}
