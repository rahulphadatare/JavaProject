package string;

import java.util.Arrays;

public class Remove_Char {
public static void main(String[] args) {
	
	String s="java is a programming language";
	
	char ch[]=s.toCharArray();
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a')
		{
			cnt++;
		}
	}
	char ch1[]=new char[ch.length-cnt];
	int b=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!='a') 
		{
			ch1[b]=ch[i];
			b++;
		}
	}
	
	//System.out.println(Arrays.toString(ch));
	String ss=new String(ch1);
	System.out.println(ss);
	
	
	

	
}
}
