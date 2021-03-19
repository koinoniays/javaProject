package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/temp.file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");

	}

}
