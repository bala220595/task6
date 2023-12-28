package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To setup the path of chromedriver
		
//		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		
		//To lauch the chrome driver
		
		WebDriver driver=new ChromeDriver();
		
		//To Launch the url
		
		driver.get("https://www.demoblaze.com/");
		
		//To maximize the browser window
		
		driver.manage().window().maximize();
		
		//verify the title of the page
		
		String title=driver.getTitle();
		
		System.out.println("The title of the page is:"+title);
		
		//operation
		
		if (driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on the correct website");
		}			
			else
			{
			System.out.println("Page not landed on the correct website");
	
		}
		

	}

}
