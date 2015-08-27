package TestCases;

import org.junit.Test;
import pageModels.HomePage;

public class LoginTest extends BaseTest
{
	@Test
	public void test()
	{
		HomePage homepage = new HomePage(driver);
		      
		homepage.ClickMyAccountButton();
		homepage.TypeMyUserName("testuser_1");
		homepage.TypeMyPassword("Test@123");       
		homepage.ClickLoginButton();
		       
		// Print a Log In message to the screen
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		homepage.ClickLogoutButton();
	}
}
