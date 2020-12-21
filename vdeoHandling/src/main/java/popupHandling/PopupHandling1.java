package popupHandling;

import org.openqa.selenium.By;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class PopupHandling1 extends Base {
@Test
	public void popup1() throws InterruptedException{
	driver.findElement(By.xpath("//span[@class='navTopHomeLinks__link']")).click();
	
	driver.findElement(By.id("btnLoginId")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
	
	
	
		
	}
}
