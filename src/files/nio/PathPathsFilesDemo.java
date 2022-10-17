package files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathPathsFilesDemo {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://temp//path.txt");

		if (Files.exists(p)) {
			System.out.println("Already created");
		} else {
			Files.createFile(p);
		}

		
		Path names = Paths.get("d://temp//names.txt");
		Path namesBackup = Paths.get("d://temp//names_backup.txt");
		
		Files.copy(names,namesBackup,StandardCopyOption.REPLACE_EXISTING);
		
		long size  = Files.size(names);
		System.out.println(size);
		
		System.out.println("done");

		Path dir = Paths.get("d://temp//abcdef");
//		Files.createDirectory(dir);
		
		Path dir2 = Paths.get("d://temp//abcdef//abc//def//xyz");
//		Files.createDirectories(dir2);
		
		Files.delete(dir);
		Files.deleteIfExists(dir); 
		
	
	
	
	}
}
