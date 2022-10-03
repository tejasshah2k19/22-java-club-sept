package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public static void main(String[] args)throws IOException {
		File f = new File("d:\\temp\\abc.txt");
		//write 
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write('r');
		fos.write('o');
		fos.write('y');
		fos.write('a');
		fos.write('l');
		
		fos.close();
		

		FileInputStream fis = new FileInputStream(f);

		while (true) {
			int b = fis.read();// first character -- byte value --> ASCII -> UNICODE { 2 byte }
			if (b == -1) {
				break;
			}
			System.out.print((char) b);
		}

		fis.close();

		

	
	}
}
