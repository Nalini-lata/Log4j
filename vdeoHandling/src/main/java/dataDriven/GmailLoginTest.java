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

public class GmailLoginTest extends Base{
	
	int count=0;
	
	@Test(dataProvider="dataProvider2")
	public void test(String user, String password) throws InterruptedException{
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();
		System.out.println(count);
		if(count!=0){
			
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
	public Object[][] dataProvider1(){
		Object[][] ob1= new Object[2][2];
		ob1[0][0]="user1";
		ob1[0][1]= "password1";
		ob1[1][0]= "user2";
		ob1[1][1]= "password2";
		
		return ob1;
		
	}
	
	
	@DataProvider
	public Object[][] dataProvider2() throws BiffException, IOException{
		File f= new File("C:\\Users\\nalini.lata\\Desktop\\testing.xls");
		Workbook wk= Workbook.getWorkbook(f);
		Sheet st= wk.getSheet(1);
		int row=st.getRows();
		int col=st.getColumns();
		Object[][] ob1= new Object[row][col];
		for(int i= 0; i< row;i++){
			for(int j=0;j<col;j++){
			Cell cl	=st.getCell(j, i);
			ob1[i][j]=cl.getContents();
			
			
		}
		
		}
		
		
		return ob1;
		
	}
	

}
