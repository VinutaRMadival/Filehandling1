package com.vco.assaignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader {//create a class bufferedreader

	public static void main(String[] args) {
		File inputFile=new File("D:\\read\\file handling2.txt");//creating the object of File class and passing the path of file.
		BufferedReader buffer=null;
		try
		{
			buffer=new BufferedReader(new FileReader(inputFile));//passing input file as object
			String line;
			while((line=buffer.readLine())!=null)  //reading a line of text through readLine() method
		        System.out.println(line);
			

		}
		catch(FileNotFoundException e)    //using multiple catch blocks to handle the exception
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
					buffer.close();     //closing the bufferedreader class
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		
	}

}

