package string;

import java.util.Arrays;

public class Remove_Space {
public static void main(String[] args) {
	 
	String s="java is a programming language";
	String str[]=s.split(" ");
	char ch[]=s.toCharArray();
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==' ')
		{
			cnt++;
		}
	}
//	System.out.println(cnt);
	char ch2[]=new char[ch.length-cnt];
	int b=0;
	for(int i=0;i<ch.length;i++)
	{
		
		if(ch[i]!=' ')
		{
			ch2[b]=ch[i];
			b++;
		}
	}
	System.out.println(Arrays.toString(ch2));
	String s1=new String(ch2);
	System.out.println(s1);
}
}
