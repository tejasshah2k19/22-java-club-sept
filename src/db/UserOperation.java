package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import threadd.FirstThread;

public class UserOperation {

	static void addUser() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter firstName email and password");
		String firstName = scr.next();
		String email = scr.next();
		String password = scr.next();

		try {
			// connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavasep", "root", "root");
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			pstmt.executeUpdate(); // insert update delete -> DML
			System.out.println("record inserted....");
			// query execute
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void deleteUser() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter userId?");
		int userId = scr.nextInt();

		try {
			// connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavasep", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ? ");
			pstmt.setInt(1, userId);
			int record = pstmt.executeUpdate(); // insert update delete -> DML
			if (record == 0) {
				System.out.println("userId not found...Invalid UserID");
			} else {
				System.out.println("record delete...");
			}
			// query execute
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// firstName email password -> scan
		// db save
		deleteUser();
	}
}
