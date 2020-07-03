package org.com.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	public Login (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String username, String pass) throws InterruptedException
	{
		WebElement signin=driver.findElement(By.cssSelector(pr.getProperty("signin")));
		signin.click();
		Thread.sleep(6000);
		
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.cssSelector(pr.getProperty("email")));
		email.sendKeys(username);
		
		WebElement nextbutton1=driver.findElement(By.xpath(pr.getProperty("nextbutton1")));
		nextbutton1.click();
		
		Thread.sleep(6000);
		
		WebElement password=driver.findElement(By.cssSelector(pr.getProperty("password")));
		password.sendKeys(pass);
		
		WebElement nextbutton2=driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		nextbutton2.click();
		
		Thread.sleep(6000);
	}

}
