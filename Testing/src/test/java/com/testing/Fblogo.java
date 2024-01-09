package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

//////////////////////////////////////////////////////////////	
		
//		WebElement logo =driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		if (logo.isDisplayed()) {
//			System.out.println("fb logo is presented");
//		}
//		else
//		{
//			System.out.println("fb logo is not presented");
//
//		}
	
///////////////////////////////////////////////////////////////
		
//		boolean emailfield=driver.findElement(By.id("email")).isEnabled();
//		
//		if (emailfield==true)
//				{
//			System.out.println("textbox is enabled");
//		}
//		else
//		{
//			System.out.println("textbox is not enabled");
//
//		}
//		
///////////////////////////////////////////////////////////////
		
//		WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
//		
//		login.click();
//		
//		boolean selectedbtn=driver.findElement(By.xpath("//button[@name='login']")).isSelected();
//		
//		if (selectedbtn==true)
//			
//		{
//			System.out.println("button is selected");
//		}
//		else
//		{
//			System.out.println("button is not selected");
//
//		}
///////////////////////////////////////////////////////////////////////

		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(4000);
		
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		fname.sendKeys("Balaji");
		Thread.sleep(2000);

		
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("venkat");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("9962269772");

		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Balaji@123");
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		
		boolean radiobtn=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		
		if (radiobtn==true)
		{
		System.out.println("Male button is selected");
		}
		else
		{
			System.out.println("Male button is not selected");

		}
		



		
		
	}

}
