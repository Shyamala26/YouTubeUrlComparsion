package org.com.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogOut {
	
	ChromeDriver driver;
	Properties pr;
	public LogOut(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signout() throws InterruptedException
	{
	WebElement logoutbutton=driver.findElement(By.id(pr.getProperty("logoutbutton")));
	logoutbutton.click();
	Thread.sleep(7000);
	
	Actions ac=new Actions(driver);
	for(int i=0;i<=6;i++)
	{
		ac.sendKeys(Keys.TAB).perform();
	}
	ac.sendKeys(Keys.ENTER).perform();

}

}
