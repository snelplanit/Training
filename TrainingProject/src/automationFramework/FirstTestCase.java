package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

   private static WebDriver driver = null;

   public static void main(String[] args) {

       //Search Criteria
       By MyAccount = By.xpath(".//*[@id='account']/a");
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
       driver.findElement(MyAccount).click();

       // Find the element that's ID attribute is 'log' (Username)
       // Enter Username on the element found by above desc.
       driver.findElement(Username).sendKeys("testuser_1"); 

       // Find the element that's ID attribute is 'pwd' (Password)
       // Enter Password on the element found by the above desc.
       driver.findElement(Password).sendKeys("Test@123");

       // Now submit the form. WebDriver will find the form for us from the element 
       driver.findElement(Login).click();

       // Print a Log In message to the screen
       System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
       
       // Find the element that's ID attribute is 'account_logout' (Log Out)
       driver.findElement (Logout).click();

       // Close the driver
       driver.quit();

           }

   }
