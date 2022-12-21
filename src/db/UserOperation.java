package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import threadd.FirstThread;

public class UserOperation {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter firstName email and password");
		String firstName = scr.next();
		String email = scr.next();
		String password = scr.next();

		UserBean userx = new UserBean();
		userx.setFirstName(firstName);
		userx.setEmail(email);
		userx.setPassword(password);

		UserDao.addUser(userx);

		// ==================
		System.out.println("Enter userId?");
		int userId = scr.nextInt();
		UserDao.deleteUser(userId);

		// =================

		ArrayList<UserBean> users = UserDao.listUsers();

		for (UserBean user : users) {
			System.out.println(
					user.getUserId() + "\t" + user.getFirstName() + "\t" + user.getEmail() + "\t" + user.getPassword());

		}

		System.out.println(" ----  second ---");
		users.forEach(user -> System.out.println(
				user.getUserId() + "\t" + user.getFirstName() + "\t" + user.getEmail() + "\t" + user.getPassword()));
	}
}
