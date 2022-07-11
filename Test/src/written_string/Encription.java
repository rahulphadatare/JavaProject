package written_string;

import java.util.Arrays;

public class Encription {
public static void main(String[] args) {
	String s="THe SkY iS tHE LImIT";
//	int a=(int)'a';
//	System.out.println(a);
	String str[]=s.split(" ");
	int arr[]=new int[str.length];
	for(int i=0;i<str.length;i++)
	{
		int sum=0;
		for(int j=0;j<str[i].length();j++)
		{
			if(str[i].charAt(j)>='A' && str[i].charAt(j)<='Z')
			{
				sum+=((str[i].charAt(j))-64);
			}
			else if(str[i].charAt(j)>='a' && str[i].charAt(j)<='z')
			{
				sum+=((str[i].charAt(j))-96);
			}
		}
		arr[i]=sum;
		System.out.println(str[i]+"  "+sum);
	}
//	System.out.println(Arrays.toString(arr));
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				String n=str[i];
				str[i]=str[j];
				str[j]=n;
			}
		}
	}
//	System.out.println(Arrays.toString(arr));
//	System.out.println(Arrays.toString(str));
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]+"  "+arr[i]);
	}
}
}
