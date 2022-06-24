package string;

public class Avrage_of_digit_in_string {
public static void main(String[] args) {
	
	String s="a5v5f8d6d4b2e3w2a6h9";
	
	String s1="";
	int sum=0;
	int cnt=0;
	for(int i=0;i<s.length();i++)
	{
		for(char j='0';j<='9';j++)
		{
			if(s.charAt(i)==j)
			{
				sum+=(j-48);
				cnt++;
			}
		}
	}
	System.out.println(sum);
	System.out.println("Avrage of digit is "+sum/cnt);
	
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		s1+=s.charAt(i);
//	}
//	System.out.println(s1);
	
	
	
}
}
