package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UICommon {

	public static WebElement GetElement(By searchBy, WebDriver d)
	{
	WebElement elem = d.findElement(searchBy);
	return elem;
	}

	public static void ClickElement(By searchBy, WebDriver d)
	{
	WebElement elem = GetElement(searchBy, d);
	elem.click();
	}

	public static void setElement(String value, By searchBy, WebDriver d)
	{
	WebElement elem = GetElement(searchBy, d);
	elem.sendKeys(value);
	}
 }
