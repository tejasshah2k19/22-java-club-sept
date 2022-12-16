package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {

		// java -> db
		// connection ?
		// vendor db -> driver file -> jar

		// mysql - driver
		// url
		// username
		// password

		// right click project -> java build path ->
		// lib -> add jar -> lib / mysql.jar
		// orderandexport -> select all -> apply close

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjavasep";
			String userName = "root";
			String password = "root";
			// 1 - load driver
			Class.forName(driver);
			// 2 connection
			Connection con = DriverManager.getConnection(url, userName, password);

			if (con != null) {
				System.out.println("dbConnected");
			} else {
				System.out.println("dbNotConnected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
