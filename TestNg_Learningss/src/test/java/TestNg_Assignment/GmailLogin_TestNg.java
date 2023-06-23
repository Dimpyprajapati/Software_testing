package TestNg_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailLogin_TestNg {
	
	static WebDriver driver;
	@BeforeClass
	public static void openbrowser() {
		String url = ("https://www.gmail.com/");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		driver.findElement(By.id("identifierId")).sendKeys("pmv110319@gmail.com);");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//div[@id='passwordNext]")).click();
	}
	
	@AfterClass
	public void Quit() {
		driver.quit();
	}
}
