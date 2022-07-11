package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_ReadWrite {
public static void main(String[] args) throws IOException {
	//FileInputStream fin=null;
	FileOutputStream fon=null;
	try
	{
		fon =new FileOutputStream("E://txt");
		String s="new java";
		for(int i=0;i<s.length();i++)
		{
			fon.write((int)s.charAt(i));
		}
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	// try with resources
	// only when te type is autoclosable
	try (FileInputStream fin= new FileInputStream("E://txt"))
	{
		//fin= new FileInputStream("C:\\Users\\LENOVO\\Desktop");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
	}
	 
	catch (FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch (IOException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("input stram is closed");
		//fin.close();
	}
	

	
}
}
