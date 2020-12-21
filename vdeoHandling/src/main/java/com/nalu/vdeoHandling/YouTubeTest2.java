package com.nalu.vdeoHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTubeTest2 {
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
	public void test() throws InterruptedException{
		
		
	driver.findElement(By.xpath("//ytd-masthead/div[@id='container']/div[@id='end']/div[@id='buttons']/ytd-button-renderer[1]/a[1]/paper-button[1]")).click();
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("dummyau1@gmail.com");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Singh@123");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/app-drawer[1]/div[2]/div[1]/div[2]/div[2]/ytd-guide-renderer[1]/div[1]/ytd-guide-section-renderer[1]/div[1]/ytd-guide-collapsible-section-entry-renderer[1]/div[2]/ytd-guide-entry-renderer[1]/a[1]/paper-item[1]/yt-formatted-string[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[3]/div[2]/ytd-topbar-menu-button-renderer[3]/button[1]/yt-img-shadow[1]/img[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/ytd-popup-container[1]/iron-dropdown[1]/div[1]/ytd-multi-page-menu-renderer[1]/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[5]/a[1]/paper-item[1]")).click();
	}
	@AfterTest
	public void close(){
		driver.quit();
		
	}
	

}
