package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReadDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("d://temp//club.txt");
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		fw.write("Royal Education India\n");
		fw.close();

		System.out.println("Done...");

		FileReader fr = new FileReader(f);

		while (true) {
			int b = fr.read();// first character -- byte value --> ASCII -> UNICODE { 2 byte }
			if (b == -1) {
				break;
			}
			System.out.print((char) b);

		}

		fr.close();
	}
}
//royaledu 
//royal
//edu 