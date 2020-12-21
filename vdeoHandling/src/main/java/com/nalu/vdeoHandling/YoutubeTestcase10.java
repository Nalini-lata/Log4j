package com.nalu.vdeoHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YoutubeTestcase10 {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver	= new ChromeDriver();
	driver.get("https://www.youtube.com/");
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
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()= 'Home']")).click();
		Thread.sleep(1000);
		List<WebElement> element	=driver.findElements(By.xpath("//yt-formatted-string[@id='video-title']"));
		for(int i=0;i<=element.size()-1;i++){
			WebElement sortedElement=element.get(i);
			try{
			sortedElement.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//paper-button[@class='style-scope ytd-subscribe-button-renderer']")).click();
			
			}catch(Exception e){
				
			}
			Thread.sleep(1000);
			driver.navigate().back();
			
		}
		
		
		driver.findElement(By.xpath("//img[@id='img' and @class='style-scope yt-img-shadow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	
	}
	@AfterTest
	public void close(){
	 driver.quit();
		
	}
	
*/
}
}
