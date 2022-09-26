package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterAgain {

	public static void main(String[] args) throws IOException {

		File f = new File("23-9-2022.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("royaleducation1\n");
		fw.write("royaleducation2\n");
		fw.write("royaleducation3");

		fw.close();

//		int fileSize = (int)f.length(); //long 
//		char c[] = new char[fileSize];
//
//		FileReader fr = new FileReader(f);
//		fr.read(c);// read single char -> int
//					// read multiple char char[]
//		fr.close();
//		System.out.println(c);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();
			//eof => -1 
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();

	}

}
