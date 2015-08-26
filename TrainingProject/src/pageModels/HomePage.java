package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.UICommon;

public class HomePage extends BasePage 
{
	//Search Criteria
    By MyAccount = By.xpath(".//*[@id='account']/a");	
    By Username = By.id("log");
    By Password = By.id("pwd");
    By Login = By.id("login");
    By Logout = By.xpath(".//*[@id='account_logout']/a");
	
	static WebDriver d;

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	public void ClickMyAccountButton()
	{
		UICommon.ClickElement(MyAccount, d);
	}
	
	public void TypeMyUserName(String string)
	{
		UICommon.setElement(null, Username, d);
	}
	
	public void TypeMyPassword(String string)
	{
		UICommon.setElement(null, Password, d);
	}
	
	public void ClickLoginButton()
	{
		UICommon.ClickElement(Login, d);
	}
	
	public void ClickLogoutButton()
	{
		UICommon.ClickElement(Logout, d);
	}
	    
}