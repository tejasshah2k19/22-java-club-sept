package exceptions;

public class GoogleApi {

	public boolean authenticate(String email, String password) {

		// XXX@XX.XXX

		// XXXX@gmail.com
		// tejas@gmail.com
		// @gmail.com
		// endsWith
		if (email.endsWith("@gmail.com") && email.length() >= 13) {

			if (email.equals("royal@gmail.com") && password.equals("royal123")) {
				return true;
			} else {
				return false;
			}
		} else {
			// InvalidEmailFormatException
			// IllegalArgumentException
			// IllegalArgumentException ex = new IllegalArgumentException("Invalid Email
			// Format");
			// throw ex; // throw new IllegalArgumentException("Invalid Email Format")

			InvalidEmailFormatException ex = new InvalidEmailFormatException("Invalid Email Format");
			throw ex;
		}
	}
}

class InvalidEmailFormatException extends RuntimeException {
	public InvalidEmailFormatException(String msg) {
		super(msg);
	}
}