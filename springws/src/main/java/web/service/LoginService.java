package web.service;

/**
 * Business logic to handle login functions.
 * 
 * Student: Binul Bijo
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * 
	 * @param username
	 * @param password
	 * @param dob
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {

		if ("binul".equals(username)
				&& "binul_pass".equals(password)
				&& "2001-01-01".equals(dob)) {

			return true;
		}

		return false;
	}
}