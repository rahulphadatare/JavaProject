package string;

import java.util.Arrays;

public class Upper_Lower_withoutmethod {
public static void main(String[] args) {
	
	String s="java is programming laguage";
	
	char ch[]=s.toCharArray();
//	System.out.println((int)'a');
//	System.out.println((int)'A');
	
	for(int i=0;i<ch.length;i++)
	{
		int a=(int)ch[i];
		ch[i]=(char)(a-32);
	}
	System.out.println(Arrays.toString(ch));
	
	
}
}
