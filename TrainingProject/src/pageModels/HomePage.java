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
	
	//Search Criteria
    By MyAccount = By.xpath(".//*[@id='account']/a");	
 
}