package org.testing.testscripts;

import org.openqa.selenium.By;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC1 extends Base {
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();
		
		driver.findElement(By.xpath("//input[@type='email'and @class='whsOnd zHQkBf']")).sendKeys("dummyau1@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'and @type='password']")).sendKeys("Singh@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='img' and @class='style-scope yt-img-shadow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	

	}}
