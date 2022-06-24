package string;

import java.util.Arrays;

public class Occurance_All_Char_Of_String {
public static void main(String[] args) {
	
	String s="java is a programming language";
	
	char ch[]=s.toCharArray();
	int n[]=new int[ch.length];
	for(int i=0;i<ch.length;i++)
	{
		int cnt=1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				cnt++;
				n[j]=-1;
			}
		}
		if(n[i]>=0)
		{
			n[i]=cnt;
		}
	
	}
	//System.out.println(Arrays.toString(n));
	for(int i=0;i<ch.length;i++)
	{
		if(n[i]>0 && ch[i]!=' ')
		{
			System.out.println(ch[i]+" occurs "+n[i]+" times");
		}
	}
			
}
}
