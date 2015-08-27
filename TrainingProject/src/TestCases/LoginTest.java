package TestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageModels.HomePage;

public class LoginTest
{

	private static WebDriver driver = null;
	@Test
	public void test()
	{
		//fail("Not yet implemented");
		       
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		HomePage homepage = new HomePage(driver);  //This instantiates the homepage (only done once)
		      
		homepage.ClickMyAccountButton();
		homepage.TypeMyUserName("testuser_1");
		homepage.TypeMyPassword("Test@123");       
		homepage.ClickLoginButton();
		       
		// Print a Log In message to the screen
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		homepage.ClickLogoutButton();

		// Close the driver
		driver.quit();

	}
}
