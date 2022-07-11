package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write {
public static void main(String[] args) throws IOException {
	FileReader fr=null;
	FileWriter fw=null;
	
	try {
		fw=new FileWriter("E://txt");
		fw.write("java is programming language");
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		System.out.println("writer is closed");
		fw.close();
	}
	
	try {
		fr=new FileReader("E://txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		System.out.println("reader is closed");
		fr.close();
	}
	
	System.out.println("Done");
}
}
