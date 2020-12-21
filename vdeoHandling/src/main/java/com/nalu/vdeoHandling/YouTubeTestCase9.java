package com.nalu.vdeoHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTubeTestCase9 {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver	= new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=Ay5Kb2aPgYI");
	driver.manage().window().maximize();
	Thread.sleep(1000);	
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();
		
		driver.findElement(By.xpath("//input[@type='email'and @class='whsOnd zHQkBf']")).sendKeys("dummyau1@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'and @type='password']")).sendKeys("Singh@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//yt-formatted-string[text()='style-scope ytd-video-primary-info-renderer']")).click();
		
		driver.findElement(By.xpath("//img[@id='img' and @class='style-scope yt-img-shadow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	
	}
	@AfterTest
	public void close(){
	 driver.quit();
		
	}
	

}
