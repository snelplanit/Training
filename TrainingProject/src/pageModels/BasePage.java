package pageModels;

import org.openqa.selenium.WebDriver;

public abstract class BasePage
{
	protected WebDriver d;
	public BasePage(WebDriver driver) 
	{
		this.d = driver;
		d.switchTo().defaultContent();
		d.manage().timeouts().setScriptTimeout(60, null);
	}
	
}
