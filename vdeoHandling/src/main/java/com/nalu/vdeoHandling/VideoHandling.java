package com.nalu.vdeoHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver	= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	List<WebElement> element=driver.findElements(By.id("video-title"));
	for(int i= 0;i<=element.size();i++){
		WebElement abc=element.get(i);
		abc.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	}

}
