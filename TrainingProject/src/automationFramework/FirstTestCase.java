package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageModels.HomePage;

public class FirstTestCase {

   private static WebDriver driver = null;
 
   public static void main(String[] args) {
       
       driver = new FirefoxDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("http://www.store.demoqa.com");

       HomePage homepage = new HomePage(driver);  //This instantiates the homepage (only done once)
      
       homepage.ClickMyAccountButton();
       homepage.TypeMyUserName();
       homepage.TypeMyPassword();       
       homepage.ClickLoginButton();
       
       // Print a Log In message to the screen
       System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

       homepage.ClickLogoutButton();

       // Close the driver
       driver.quit();

   }

}
