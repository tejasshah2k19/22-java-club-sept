package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

//sql query
public class UserDao {
	static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavasep", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	static void addUser(UserBean user) {

		try {
			// connection
			Connection con = getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			pstmt.executeUpdate(); // insert update delete -> DML
			System.out.println("record inserted....");
			// query execute
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void deleteUser(int userId) {

		try {
			// connection

			Connection con = getConnection();
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

	// executeUpdate()

	static ArrayList<UserBean> listUsers() {

		ArrayList<UserBean> users = new ArrayList<UserBean>();
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			ResultSet rs = pstmt.executeQuery(); // select -

			while (rs.next()) { // 1 2 3 .... false

				UserBean user = new UserBean();
				user.setUserId(rs.getInt("userId"));
				user.setFirstName(rs.getString("firstName"));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString("password"));
				users.add(user);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
}
