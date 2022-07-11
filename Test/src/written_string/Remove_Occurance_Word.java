package written_string;

import java.util.Arrays;

public class Remove_Occurance_Word {
public static void main(String[] args) {
	
	String s="java int java char java string java array java code";
	
	String str[]=s.split(" ");
	
	for(int i=0;i<str.length;i++)
	{
		if(str[i].equals("java"))
		{
			str[i]="";
		}
	}
	System.out.println(Arrays.toString(str));

	
}
}
