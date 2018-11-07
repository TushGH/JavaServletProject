package test;

import model.user;
import model.UserErrormsgs;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
class userTest {

	user user1;
	UserErrormsgs UErrorMsgs;
	@Before
	public void setUp() throws Exception {
		user1 = new user();
		UErrorMsgs = new UserErrormsgs();
	}
	@FileParameters("/src/test/Registration_TestCases.csv")
	@Test
	public void test(int testcaseno,String UserName,String FirstName,String Address,String UtaId,String License,String Email,String Password,String Phone,
String UserError,String FirstError,String AdError,String IdError,String LicenseError,String EmailError,String PassError,String PhoneError) {
		user1.setuser(UserName, Password, FirstName, "user", License, "1995-04-05", Email, Phone, Address, UtaId, "Yes");
		user1.validateUser(user1, UErrorMsgs);
		assertEquals(UserError,UErrorMsgs.getUsernameError());
		assertEquals(FirstError,UErrorMsgs.getFirstNameError());
		assertEquals(AdError,UErrorMsgs.getAddressError());
		assertEquals(LicenseError,UErrorMsgs.getLicenseError());
		assertEquals(EmailError,UErrorMsgs.getEmailError());
		assertEquals(PassError,UErrorMsgs.getPasswordError());
		assertEquals(IdError,UErrorMsgs.getUtaidError());
		assertEquals(PhoneError,UErrorMsgs.getPhonenoError());
		//fail("Not yet implemented");
	}

}
