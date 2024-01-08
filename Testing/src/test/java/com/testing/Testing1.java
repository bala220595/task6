package com.testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		
		// To setup the path of gecko driver
		
//		WebDriverManager.firefoxdriver().setup();
		
		System.setProperty("webdriver.gecko.driver","D://Driver//geckodriver.exe");
		
		//To launch firefox driver 
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		
		//Enter the website URL
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		driver.navigate().back();
				
		String url= driver.getCurrentUrl();
		
		System.out.println("The current url is:"+url);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
