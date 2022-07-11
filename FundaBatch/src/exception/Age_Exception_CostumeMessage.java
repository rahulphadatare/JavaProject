package exception;

public class Age_Exception_CostumeMessage {

	void validation(int age) throws Age_Exception
	{
		if(age<18)
		{
			throw new Age_Exception("age is less, you can't ride");
		}
		else if(age>60)
		{
			throw new Age_Exception("age is more, you can't ride");
		}
		else
		{
			System.out.println("njoy your ride");
		}
	}
	
	public static void main(String[] args) {
		
		Age_Exception_CostumeMessage a=new Age_Exception_CostumeMessage();
		int age=65;
		try
		{
			a.validation(age);
		} catch (Age_Exception e)
		{
			e.printStackTrace();
		}
		
	   System.out.println("done");
	}
}
