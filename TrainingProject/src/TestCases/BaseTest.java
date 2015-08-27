package TestCases;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		// Close the driver
		driver.quit();
	}

}
