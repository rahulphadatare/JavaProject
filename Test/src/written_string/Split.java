package written_string;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	
	String s="HELLO$WORLD";

	char ch[]=s.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='$')
		{
			ch[i]=' ';
		}
	}
	s=new String(ch);
//	System.out.println(s);
	
	String str[]=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
		
			
	
	
}
}
