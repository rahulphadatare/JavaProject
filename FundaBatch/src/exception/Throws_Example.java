package exception;

public class Throws_Example {

	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("String is null");
		}
		return s.length();
	}
	
	public static void main(String[] args) {
		
		Throws_Example t=new Throws_Example();
		
		System.out.println(t.getStringLength("Program"));
		try
		{
		System.out.println(t.getStringLength(null));
		}
		catch(NullPointerException e)
		{// but using throw or throws exicution will hold/trminated so we cannot use here
			//throw new NullPointerException("String is null..... pls enter");
			e.printStackTrace();
		}
		System.out.println(t.getStringLength("Java is a"));
		System.out.println(t.getStringLength("aaaaaa"));
	}
}
