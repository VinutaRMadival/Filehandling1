package com.vco.assaignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {  //create a class bufferwriter

	public static void main(String[] args) {
		FileWriter filewrite;
		//try block to check exceptions
		try
		{
			filewrite=new FileWriter("D:\\bufferedwriter.txt");
			BufferedWriter bufferwrite=new  BufferedWriter(filewrite);
			System.out.println("buffered starts writing");
			bufferwrite.write("welcome all of you"+" ");
			bufferwrite.write("have a nice day");
			bufferwrite.close();
			System.out.println("writtern successfully");
			
		}
		catch(IOException expt)
		{
			expt.printStackTrace();
		}
	}

}
