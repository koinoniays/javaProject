package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		int data = 0;
		char[] readChars = new char[100];
		FileReader fr = new FileReader("c:/Dev/git/javaProject/javaProject/src/io/FileReaderExample.java");
		FileWriter fw = new FileWriter("c:/Temp/Dir/File2.txt");
		while((data = fr.read(readChars)) != -1) {
			String readLines = new String(readChars);
//			System.out.print(new String(readChars));
			fw.write(readLines);
		}
		fw.flush();
		fw.close();
		fr.close();
		System.out.println("end...");
			
			
		
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while((readCharNo=fr.read(cbuf)) != -1) {
//			String data = new String(cbuf, 0, readCharNo);
//			System.out.println(data);
//		}
//		fr.close();

	}

}
