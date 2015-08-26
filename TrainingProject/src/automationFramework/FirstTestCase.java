package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.UICommon;
import pageModels.HomePage;

public class FirstTestCase {

   private static WebDriver driver = null;
 
   public static void main(String[] args) {

       //Search Criteria
       //By MyAccount = By.xpath(".//*[@id='account']/a");
	   HomePage homepage = new HomePage(driver);  //This instantiates the homepage
	   homepage.ClickMyAccountButton();
       By Username = By.id("log");
       By Password = By.id("pwd");
       By Login = By.id("login");
       By Logout = By.xpath(".//*[@id='account_logout']/a");     
       
       // Create a new instance of the Firefox driver
       driver = new FirefoxDriver();

       //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       //Launch the Online Store Website
       driver.get("http://www.store.demoqa.com");

       // Find the element that's ID attribute is 'account'(My Account) 
       //driver.findElement(MyAccount).click();
       //UICommon.ClickElement(MyAccount, driver);
       homepage.ClickMyAccountButton();
       
       // Find the element that's ID attribute is 'log' (Username)
       // Enter Username on the element found by above desc.
       //driver.findElement(Username).sendKeys("testuser_1");
       UICommon.setElement("testuser_1", Username, driver);

       
       // Find the element that's ID attribute is 'pwd' (Password)
       // Enter Password on the element found by the above desc.
       //driver.findElement(Password).sendKeys("Test@123");
       UICommon.setElement("Test@123", Password, driver);

       // Now submit the form. WebDriver will find the form for us from the element 
       //driver.findElement(Login).click();
       UICommon.ClickElement(Login, driver);


       // Print a Log In message to the screen
       System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
       
       // Find the element that's ID attribute is 'account_logout' (Log Out)
       //driver.findElement (Logout).click();
       UICommon.ClickElement(Logout, driver);

       // Close the driver
       driver.quit();

   }

}
