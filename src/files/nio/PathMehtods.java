package files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMehtods {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://temp//names.txt");

		System.out.println(p.getFileName());
		System.out.println(p.getNameCount());
		System.out.println(p.getName(0));
		System.out.println(p.getRoot());

		// Files method

		System.out.println(Files.isReadable(p));
		System.out.println(Files.isWritable(p));
		System.out.println(Files.isExecutable(p));

		System.out.println(Files.getLastModifiedTime(p));

		// Attributes
//									BasicFileAttributes
//			
//		PosixFileAttributes									DosFileAttributes

		BasicFileAttributes bfa = Files.readAttributes(p, BasicFileAttributes.class);
		System.out.println(bfa.creationTime());
		System.out.println(bfa.lastAccessTime());
		System.out.println(bfa.lastModifiedTime());
		System.out.println(bfa.isDirectory());

	}
}
