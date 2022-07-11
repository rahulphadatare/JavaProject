package Moc;

import java.util.Scanner;

public class Test {
	
public static void main(String[] args) {
	int arr[]= {4,8,7,5,6,3,2,10};
	//System.out.println(arr.length);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no");
	int num=sc.nextInt();
	int b[]=new int[arr.length-1];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==12)
			{
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}
}
