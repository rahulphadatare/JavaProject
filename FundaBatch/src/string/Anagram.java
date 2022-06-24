package string;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String s1="Apple";
	String s2="ppAle";
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	if(ch1.length==ch2.length)
	{
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]>ch1[j])
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
				if(ch2[i]>ch2[j])
				{
					char temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{
				cnt++;
			}
		}
		if(cnt==ch1.length)
		{
			System.out.println("Both arrays are Anagram");
		}
		else
		{
			System.out.println("Both arrays are not Anagram");
		}
	}
	else
	{
		System.out.println("Both arrays are not Anagram");
	}
	
	//System.out.println(Arrays.toString(ch1));
	//System.out.println(Arrays.toString(ch2));
}
}
