package org.com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	//public ChromeOptions option;
	//public DesiredCapabilities capa;
	@BeforeMethod
	public void browserlaunch() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Shyamala\\SeeleniumTestingClass\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		File f=new File("../YouTubeFrameWorkScreenShot/xpaths.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
	    
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Options option=driver.manage();
		Window win=option.window();
		win.maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);	
	}

	
	@AfterMethod
	public void browserclose() throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
	}

}
