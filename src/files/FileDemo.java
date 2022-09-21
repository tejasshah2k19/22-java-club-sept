package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		// File ->class
		// java.io.File

		// below line will not create any file
		// it just link the f object with data.txt
		// so we can perform an operation
		File f = new File("D:\\Temp\\data2022.txt"); // f -> link -> d:\\temp\\data.txt
		// read -> runtime error
		// write -> automatically it will create for us
		System.out.println("exists() => "+f.exists());// data.txt present? -> boolean -> true
		System.out.println("createNewFile() => "+ f.createNewFile()); // boolean -> file created -> true
		// file not created -> false

		
		File dir = new File("d:\\Temp\\sepclub\\");
		System.out.println("sepclub present ? "+dir.exists());
		dir.mkdir();//create 
		
		
		File odd = new File(dir,"odd.txt");
		odd.createNewFile(); //sepclub folder 
		
		
		File even = new File("d://temp//even.txt");
		even.delete(); //boolean
		
	
		File x = new File("d://temp//abc.txt");
		x.isHidden(); // boolean 
		x.canRead(); //boolean 
		x.canWrite();//boolean 
		
	
	
	}
}
