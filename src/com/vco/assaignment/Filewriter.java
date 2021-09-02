package com.vco.assaignment;

import java.io.FileWriter;

public class Filewriter {

	public static void main(String[] args) {//main method
		//try block to check exceptions
		try
		{
			FileWriter fw=new FileWriter("D:\\filewriter.txt");
			fw.write("java is object oriented programming language");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("success......");

	}

}
