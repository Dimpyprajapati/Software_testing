package TestNg_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLogin_testNg {
	
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		String url =("https://www.facebook.com/");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();  
	}
	
	@Parameters({"email","password"})
	@Test (dataProvider = "dp")
	public void testlogin(String email,String password) {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		
        WebElement passEle = driver.findElement(By.id("pass"));
        passEle.clear();
        passEle.sendKeys(password); 
        
        WebElement btn = driver.findElement(By.name("login"));
        btn.click();
        
	}	
		
	@DataProvider (name = "dp")
	public static Object[][] passdata() {
		Object o[][] = new Object[1][2];
		
		o[0][0] = "selenium@gmail.com";
		o[0][1] = "s123";
		
		return o;
	}

	
}

		



