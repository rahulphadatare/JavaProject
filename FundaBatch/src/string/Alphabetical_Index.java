package string;

public class Alphabetical_Index {
public static void main(String[] args) {
	
	String s="the quick brown fox jumps over the lazy dog";
	char ch[]=s.toCharArray();
	System.out.println("Alphabet  Index no");
	for(char j='a';j<='z';j++)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(j==ch[i])
			{
				System.out.println("   "+j+"    =    "+i);
			}
		}
	}
	
	

//	char chh='a';
//	for(int j=0;j<=26;j++)
//	{
//		if(chh<='z')
//		{
//		for(int i=0;i<ch.length;i++)
//		{
//			if(chh==ch[i])
//			{
//				System.out.println(chh+" = "+i);
//			}
//		}
//		chh++;
//		}
//	}
	
	
}
}
