package string;

import java.util.Arrays;

public class Anagram_Sortmethod {
public static void main(String[] args) 
{
		String s1="Apple";
		String s2="ppAle";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1.length==ch2.length)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
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
}

