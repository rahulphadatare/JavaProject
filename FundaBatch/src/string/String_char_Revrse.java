package string;

public class String_char_Revrse {
public static void main(String[] args) {
		
	String s="java is a programming language";
	char ch[]=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
}
}
