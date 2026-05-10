package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {

	@Test
	public void testValidLogin() {
		Assert.assertTrue(LoginService.login("Binul", "binul_pass", "2001-10-16"));
	}

	@Test
	public void testWrongUsername() {
		Assert.assertFalse(LoginService.login("wrong", "binul_pass", "2001-10-16"));
	}

	@Test
	public void testWrongPassword() {
		Assert.assertFalse(LoginService.login("Binul", "wrong_pass", "2001-10-16"));
	}

	@Test
	public void testWrongDob() {
		Assert.assertFalse(LoginService.login("Binul", "binul_pass", "2000-01-01"));
	}

	@Test
	public void testEmptyUsername() {
		Assert.assertFalse(LoginService.login("", "binul_pass", "2001-10-16"));
	}

	@Test
	public void testEmptyPassword() {
		Assert.assertFalse(LoginService.login("Binul", "", "2001-10-16"));
	}

	@Test
	public void testEmptyDob() {
		Assert.assertFalse(LoginService.login("Binul", "binul_pass", ""));
	}

	@Test
	public void testNullUsername() {
		Assert.assertFalse(LoginService.login(null, "binul_pass", "2001-10-16"));
	}

	@Test
	public void testNullPassword() {
		Assert.assertFalse(LoginService.login("Binul", null, "2001-10-16"));
	}

	@Test
	public void testNullDob() {
		Assert.assertFalse(LoginService.login("Binul", "binul_pass", null));
	}
}
