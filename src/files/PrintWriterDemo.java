package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d://temp//test.txt");
		PrintWriter pw = new PrintWriter(f);

		pw.write("royal");
		pw.println("edu");
		pw.println("ahmedabad");

		pw.close();
		System.out.println("done");

	}
}
