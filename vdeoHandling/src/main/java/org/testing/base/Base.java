package org.testing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver	= new ChromeDriver();
	//driver.get("https://www.youtube.com/");
	driver.get("http://52.21.36.72:8080/");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);	
}
	@AfterTest
	public void close(){
	 //driver.quit();
		
	}
	
}