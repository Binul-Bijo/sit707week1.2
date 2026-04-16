#package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Binul Bijo
 */
public class LoginFormTest 
{ 

	@Test
	public void testStudentIdentity() {
		String studentId = "s224950824";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Binul Bijo";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Empty Username", status.getErrorMsg());
    }
	
	@Test
    public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, "xyz");
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Empty Username", status.getErrorMsg());
    }
	
	@Test
    public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Empty Username", status.getErrorMsg());
    }
	
	@Test
    public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("abc", null);
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Empty Password", status.getErrorMsg());
    }
	
	@Test
    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("abc", "xyz");
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }
	
	@Test
    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("abc", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }
	
	@Test
    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Empty Password", status.getErrorMsg());
    }
	
	@Test
    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "xyz");
		Assert.assertTrue(status.isLoginSuccess() == false);
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }
	
	@Test
    public void testFailCorrectUsernameAndCorrectPasswordAndEmptyValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		Assert.assertEquals("123456", status.getErrorMsg());
		
		boolean valid = LoginForm.validateCode(null);
		Assert.assertTrue(valid == false);
    }
	
	@Test
    public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		Assert.assertEquals("123456", status.getErrorMsg());
		
		boolean valid = LoginForm.validateCode("abcd");
		Assert.assertTrue(valid == false);
    }
	
	@Test
    public void testPassCorrectUsernameAndCorrectPasswordAndCorrectValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		Assert.assertEquals("123456", status.getErrorMsg());
		
		boolean valid = LoginForm.validateCode("123456");
		Assert.assertTrue(valid == true);
    }
	
}