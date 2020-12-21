package dataDriven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testing.base.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class YouTubeLogin extends Base{
	int count=1;
	
	@Test(dataProvider= "dataProvider1")
	
	public void dataProvider(String user, String password) throws InterruptedException{
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();
		
		if(count!=1){
			
			driver.findElement(By.xpath("//div[@class='UXurCe']")).click();
		}
        Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email'and @class='whsOnd zHQkBf']")).sendKeys(user);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'and @type='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")).click();
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//img[@id='img' and @class='style-scope yt-img-shadow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
		
		driver.navigate().back();
		count++;
		
		
	}
	
	
	@DataProvider
	public Object[][] dataProvider1() throws BiffException, IOException{
	
	File f= new File("");
	Workbook wb= Workbook.getWorkbook(f);
	Sheet st= wb.getSheet(1);

	int r =st.getRows();

	int c=	st.getColumns();
	Object[][] ob	= new Object[r][c];
	
	for(int i= 0; i<r; i++){
		
		for(int j= 0;j<c; j++){
			
		Cell cl	=st.getCell(j, i);
		ob[i][j]=cl.getContents();
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	return ob;
		
	}

}
