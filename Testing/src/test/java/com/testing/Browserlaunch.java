package com.testing;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static void main(String[] args) {
		
		//Take input from the user to select the browser 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser you want to open");
		String browserchoice=sc.nextLine().toLowerCase();
		
		//Chrome/CHROME/cHrome->chrome
		//initialize the browser driver
		
		WebDriver driver=null;
		
		if(browserchoice.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserchoice.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		else
		{
			System.out.println("invalid browser");
			System.exit(1);
		}
		
		//open the google website
		
		driver.get("http://www.google.com");
		
	}
}


