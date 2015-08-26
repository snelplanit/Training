package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.UICommon;

public class HomePage extends BasePage
{
	static WebDriver d;

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	public void ClickMyAccountButton()
	{
		UICommon.ClickElement(MyAccount, d);
	}
	
	public void TypeMyUserName()
	{
		UICommon.setElement("testuser_1", Username, d);
	}
	
	public void TypeMyPassword()
	{
		UICommon.setElement("Test@123", Password, d);
	}
	
	public void ClickLoginButton()
	{
		UICommon.ClickElement(Login, d);
	}
	
	public void ClickLogoutButton()
	{
		UICommon.ClickElement(Logout, d);
	}
	
	//Search Criteria
    By MyAccount = By.xpath(".//*[@id='account']/a");	
    By Username = By.id("log");
    By Password = By.id("pwd");
    By Login = By.id("login");
    By Logout = By.xpath(".//*[@id='account_logout']/a");
    
}