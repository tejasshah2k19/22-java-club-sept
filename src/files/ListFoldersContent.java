package files;

import java.io.File;

public class ListFoldersContent {

	public static void main(String[] args) {
		File f = new File("d://temp");

		String details[] = f.list();// String[]

		System.out.println("content of the " + f.getAbsolutePath());
		for (int i = 0; i < details.length; i++) {
			System.out.println(details[i]);
		}

		System.out.println("content of the " + f.getAbsolutePath());
		for (String x : details) {
			System.out.println(x);
		}

	}
	// java pointer --> read write -->
	// A.java
}
