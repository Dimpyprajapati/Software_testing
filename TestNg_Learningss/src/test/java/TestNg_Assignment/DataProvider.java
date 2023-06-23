package TestNg_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        String url =("https://www.saucedemo.com/");
        driver.get(url);
        driver.manage().window().maximize();
		
	}
	
	@Parameters ({"Username", "Password"})
	@Test (dataProvider = "create")
	public void testlogin(String Username, String Password) {
		WebElement emailEle = driver.findElement(By.id("user-name"));
		emailEle.clear();
		emailEle.sendKeys(Username);
		
        WebElement passEle = driver.findElement(By.id("password"));
        passEle.clear();
		passEle.sendKeys(Password);
		
		WebElement btn = driver.findElement(By.id("login-button"));
		btn.click();
		
		driver.close();
	}
	
	@org.testng.annotations.DataProvider (name = "create")
	public static Object[][] passdata() {
		Object o[][] = new Object[4][2];
		
		o[0][0] = "standard_user";
		o[0][1] = "secret_sauce";
		
		o[1][0] = "locked_out_user";
		o[1][1] = "secret_sauce";
		
		o[2][0] = "problem_user";
		o[2][1] = "secret_sauce";
		
		o[3][0] = "performance_glitch_user";
		o[3][1] = "secret_sauce";
		
		return(o);
	}
}

