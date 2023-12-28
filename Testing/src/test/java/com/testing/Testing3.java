package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement searchbox=driver.findElement(By.id("searchInput"));
		
		searchbox.sendKeys("Artificial intelligence");
		
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		
		button.click();
		
		Thread.sleep(2000);
		
		WebElement div=driver.findElement(By.xpath("//a[@href='#History']"));
		
		div.click();
		
		Thread.sleep(2000);
		
		//print the title of the section
		
		String Title =driver.getTitle();
		
		System.out.println("The title of the section is:"+Title);
		
		}

}
