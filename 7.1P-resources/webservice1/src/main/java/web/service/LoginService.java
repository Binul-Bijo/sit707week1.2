package web.service;

/**
 * Business logic to handle login functions.
 */
public class LoginService {

	public static boolean login(String username, String password, String dob) {

		if (username == null || password == null || dob == null) {
			return false;
		}

		if (username.trim().isEmpty() ||
			password.trim().isEmpty() ||
			dob.trim().isEmpty()) {
			return false;
		}

		return "Binul".equals(username)
				&& "binul_pass".equals(password)
				&& "2001-10-16".equals(dob);
	}
}
