package org.com.TestScripts;

import org.com.Base.BaseClass;
import org.com.Pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends BaseClass {

	@Test
	public void testCompreEmailId() throws InterruptedException {

		Login l = new Login(driver, pr);
		String expectedEmailId = "selenium.shyamala@gmail.com";
		l.signin(expectedEmailId, " testing@123");

		WebElement avatar = driver.findElement(By.xpath(pr.getProperty("avatarImage")));
		avatar.click();

		Thread.sleep(6000);
		
		WebElement emailWebEle = driver.findElement(By.xpath(pr.getProperty("profileEmail")));
		String actualEmailId = emailWebEle.getText();

		Assert.assertEquals(actualEmailId, expectedEmailId, "Asserstion Failed - EmailID Mismatched");

	}

}
