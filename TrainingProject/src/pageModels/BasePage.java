package pageModels;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	static protected WebDriver d;
	
	public BasePage(WebDriver driver) 
	{
		d = driver;
		d.switchTo().defaultContent();
		d.manage().timeouts().setScriptTimeout(60, null);
	}
	
}
