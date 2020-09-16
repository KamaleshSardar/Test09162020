package org.paraopt;

import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OptionParameter09072020 {
	@BeforeMethod
	public void start() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	public void end() {
		Date date = new Date();
		System.out.println(date);
	}
	
	WebDriver driver;
	
	@Test
	public void testCase1(String username, String password) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(username);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
		logIn.click();
	}
}
