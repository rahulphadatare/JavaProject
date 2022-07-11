package written_string;

import java.util.Scanner;

public class Find_No_Alph_Symb {
public static void main(String[] args) {
//	int c=(int)'';
//	System.out.println(c);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	
	char ch[]=s.toCharArray();
	int alc=0;
	int noc=0;
	int spc=0;
	for(int i=0;i<ch.length;i++)
	{
		
		for(char j='a';j<='z';j++)
		{
			if(ch[i]==j)
			{
				alc++;
			}
		}
		for(char k='0';k<='9';k++)
		{
			if(ch[i]==k)
			{
				noc++;
				spc++;
			}
			
		}
//		for(int l=1;l<48;l++)
//		{
//			if(ch[i]==l)
//			{
//				spc++;
//			}
//		}
	}
	
	System.out.println("No of alphabet: "+alc);
	System.out.println("No of digit: "+noc);
//	System.out.println("No of special char: "+((alc*10)-(spc*10)));
	System.out.println("No of special char: "+((s.length())-(alc+noc)));
	

//	for(int i=0;i<ch.length;i++)
//	{
//		if(ch[i]>='a' && ch[i]<='z')
//		{
//			alc++;
//		}
//		else if(ch[i]>='0' && ch[i]<='9')
//		{
//			noc++;
//		}
//		else
//		{
//			spc++;
//		}
//		
//	}
//	System.out.println("Total number of Alphabets:"+alc);
//	System.out.println("Total number of Digits:"+noc);
//	System.out.println("Total number of Special Character:"+spc);
}
}

