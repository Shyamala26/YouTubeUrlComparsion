package org.com.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatedPages {
	
	ChromeDriver driver;
	Properties pr;
	
	public RepeatedPages(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void videoplay() throws InterruptedException
	{
		List<WebElement> videoplay=driver.findElements(By.id(pr.getProperty("videoplay")));
		for(WebElement video_play : videoplay)
		{
			video_play.click();
			System.out.println("Here is the Play Video Title: "+video_play.getText());
			break;
		}
		
	}

}
