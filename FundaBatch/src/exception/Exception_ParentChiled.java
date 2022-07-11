package exception;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.CompletionException;

public class Exception_ParentChiled {
	class A
	{
		void display() throws ArithmeticException
		{
			System.out.println("");
		}
	}
	class B extends A
	{// if parent class have runtime exception child class have exception or not its not mandetory but we can not write compile time exception in chiled class
	 // if parent have compile time exception child only have same exception or other runtime exception
		// but do not have any other compile time exception
		void display() throws NullPointerException
		{
			System.out.println("");
		}
	}
	
	
	
	
	
	
public static void main(String[] args) {
	
}
}
