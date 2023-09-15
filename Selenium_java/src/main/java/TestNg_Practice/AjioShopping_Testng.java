package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AjioShopping_Testng {
	static WebDriver driver;
	static String url = ("https://www.ajio.com/");
	@BeforeClass
	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
  		driver = new ChromeDriver();
  		driver.get(url);
  		driver.manage().window().maximize();
	}

	@AfterClass
	public void quit() 
	{
		driver.quit();	
	}
}
