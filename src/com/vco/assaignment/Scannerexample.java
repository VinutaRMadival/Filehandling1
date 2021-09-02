package com.vco.assaignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("D:\\filewriter.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());

	}

}
