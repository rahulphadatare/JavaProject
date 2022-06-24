package string;

public class String_Word_Printing {
public static void main(String[] args) {
	
	String s1="Hello";
	String s2="Bye";
	String s3="Hi";
	
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	char ch3[]=s3.toCharArray();
//	int j=0;
//	int k=0;
	for(int i=0;i<ch1.length;i++)
	{
		System.out.print(ch1[i]);
		if(i<ch2.length)
		{
			System.out.print(ch2[i]);
			//j++;
		}
		if(i<ch3.length)
		{
			System.out.print(ch3[i]);
			//k++;
		}
			System.out.println();
	}

	
}
}
