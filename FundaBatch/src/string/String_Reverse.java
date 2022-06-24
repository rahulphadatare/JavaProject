package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_Reverse {
public static void main(String[] args) {
	

	String s="java is a programming language";
	
	String str[]=s.split(" ");
	
	//for(int i=0;i<str.length/2;i++)
	for(int i=0;i<str.length;i++)
	{
//		String temp=str[i];
//		str[i]=str[str.length-(i+1)];
//		str[str.length-(i+1)]=temp;
		System.out.print(str[str.length-(i+1)]+" ");
	}
	System.out.println("\n");
	//System.out.println(Arrays.toString(str));
	
	
	char ch[]=s.toCharArray();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter char");
	char a=sc.next().charAt(0);
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==a)
		{
			count++;
		}
	}
	System.out.println("The count of given char is: "+count);

}
}
