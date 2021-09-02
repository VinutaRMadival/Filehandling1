package com.vco.assaignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader { //class

	public static void main(String[] args)  {  //main driver method
		
		File inputFile=new File("D:\\filewriter.txt");//An abstract representation of file and directory pathnames. 
		FileReader fr=null;//The FileReader is meant for reading streams of characters
		//try block to check exceptions
		try
		{
			fr=new FileReader(inputFile);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
		}
		}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
