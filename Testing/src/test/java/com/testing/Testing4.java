package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//set up the path
		
		WebDriverManager.chromedriver().setup();
		
		//Create an object for the browser
		
		WebDriver driver = new ChromeDriver();
		
		//deleting all cookies
		
		driver.manage().deleteAllCookies();
				
		//maximize the window
		
		driver.manage().window().maximize();
				
		//set up Url
		
		driver.get("http://www.snapdeal.com");
		
		Thread.sleep(2000);
				
		//Select locators
		
		WebElement SignIn=driver.findElement(By.xpath("//div[@class='accountInner']"));
				
		SignIn.click();
        
		Thread.sleep(2000);
		
  		WebElement login=driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
  		
		login.click();

        Thread.sleep(3000);
        
        driver.switchTo().frame("loginIframe");
        
		WebElement mobile=driver.findElement(By.xpath("//input[@id='userName']"));
		
        Thread.sleep(3000);
		
		mobile.sendKeys("9962269772");
		
		WebElement continues=driver.findElement(By.xpath("//button[@id='checkUser']"));
				
		continues.click();
		
        Thread.sleep(3000);
		
		String title=driver.getTitle();
		
		System.out.println("The title of the page is:"+title);

//		driver.close();
		
		if (driver.getTitle().equals(title))
		
		{
			
			System.out.println("The User logged in successfully");
		}
		else
		{
			System.out.println("The User is not logged in successfully");
			
		}
	}
}
