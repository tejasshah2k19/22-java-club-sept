package exceptions;

public class GoogleApi {

	public static void main(String[] args) {
		checkEmailAndPassword("tejas", "12345");
		System.out.println("finish...");
	}

	public static boolean checkEmailAndPassword(String email, String password) throws EmailException {

		if (!email.contains("@")) {
			throw new EmailException("Invalid Format Of Email");
		}
		return true;

	}
}
