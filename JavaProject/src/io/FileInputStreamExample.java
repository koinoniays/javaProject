package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/Dev/git/javaProject/javaProject/src/io/FileExample.java");
		int data = 0;
		int cnt = 0;
		byte[] readBytes = new byte[100];
		while((data = is.read(readBytes)) != -1) {
			System.out.write(data);
			cnt++;
		}
		is.close();
		System.out.println();
		System.out.println(cnt + "นÝบน");
		System.out.println("===============end===============");

	}

}
