package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.facebook.com/");
		
		WebElement Newaccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		Newaccount.click();
		
		Thread.sleep(1000);
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		
		Firstname.sendKeys("Balaji");
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		
		Lastname.sendKeys("venkat");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		email.sendKeys("9962269772");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        
		password.sendKeys("Balaji@123");
		
		 Select dayDropdown = new Select(driver.findElement(By.id("day")));
		 
	     Select monthDropdown = new Select(driver.findElement(By.id("month")));
	     
	     Select yearDropdown = new Select(driver.findElement(By.id("year")));
	     
	     dayDropdown.selectByVisibleText("22");
	     
	     monthDropdown.selectByVisibleText("May"); 

	     yearDropdown.selectByVisibleText("1995");
	     
		WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
		
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		signup.click();
		
		Thread.sleep(1000);
		
		String title=driver.getTitle();
		
		System.out.println("successfully registered on facebook");
		
		if (driver.getTitle().equals(title))
		{
			System.out.println("User logged in successfully");

		}
		else
		{
			System.out.println("User not logged in successfully");

		}
		
	}

}

OUTPUT:

SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Starting ChromeDriver 120.0.6099.109 (3419140ab665596f21b385ce136419fde0924272-refs/branch-heads/6099@{#1483}) on port 11928
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jan 09, 2024 6:59:08 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
successfully registered on facebook
User logged in successfully
