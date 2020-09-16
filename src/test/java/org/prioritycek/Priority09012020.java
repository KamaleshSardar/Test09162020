package org.prioritycek;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority09012020 {

	static WebDriver driver;

	@BeforeClass
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterClass
	public void quitBrowser() {
		driver.quit();
		}
	
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(priority=-333)
	public void testCase1() {
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("jssskamalesh@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("qwertyuiop");
		WebElement login= driver.findElement(By.id("u_0_b"));
		login.click();
	}
	
	@Test(priority=-444)
	public void testCase2() {
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("jssskamalesh@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("qwertyuiop");
		WebElement login= driver.findElement(By.id("u_0_b"));
		login.click();
	}
	
	@Test (priority=44)
	public void testCase3() {
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("jssskamalesh@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("qwertyuiop");
		WebElement login= driver.findElement(By.id("u_0_b"));
		login.click();
	}
	
	@Test
	public void testCase4() {
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("jssskamalesh@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("qwertyuiop");
		WebElement login= driver.findElement(By.id("u_0_b"));
		login.click();
	}
	
	@Test
	public void testCase5() {
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("jssskamalesh@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("qwertyuiop");
		WebElement login= driver.findElement(By.id("u_0_b"));
		login.click();
	}
	
}
