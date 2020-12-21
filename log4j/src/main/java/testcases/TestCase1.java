package testcases;


import org.testng.Assert;

public class TestCase1 {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver	= new ChromeDriver();
		driver.get("https://www.youtube.com");
		TakeLogs.logs("TestCase1", "Is Successfull");
		*/
		Assert.assertEquals("A", "A");
		
	}

}
