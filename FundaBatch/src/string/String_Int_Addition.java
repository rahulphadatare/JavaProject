package string;

import java.util.Arrays;

public class String_Int_Addition {
public static void main(String[] args) {
	
	String s="a5v5f8d6d4b2e3w2a6h9";
	
	char ch[]=s.toCharArray();
//	System.out.println(Arrays.toString(ch));
	int sum=0;
//	char a=(char)5;
//	System.out.println(a);
	
	for(int i=0;i<ch.length;i++)
	{
		for(int j=48;j<58;j++)
		{
			if(ch[i]==j)
			{
				sum+=(j-48);
				//System.out.println(sum);
			}
		}
	}
	System.out.println("total sum of array intiger digit is: "+sum);
}
}
