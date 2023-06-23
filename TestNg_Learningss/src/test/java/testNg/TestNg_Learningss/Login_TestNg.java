package testNg.TestNg_Learningss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_TestNg {
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        String url =("https://www.facebook.com/");
        driver.get(url);
        driver.manage().window().maximize();
	}

	@Parameters ({"email", "password"})
	@Test (dataProvider = "dp")
	public void testlogin(String email, String password) {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		
        WebElement passEle = driver.findElement(By.id("pass"));
        passEle.clear();
		passEle.sendKeys(password);
	}	
		
	@DataProvider (name = "dp")
	public static Object[][] passdata() {
		Object o[][] = new Object[4][2];
		
		o[0][0] = "invalidemail@gamil.com";
		o[0][1] = "invalidpass";
		
		o[1][0] = "invalidemail@gamil.com";
		o[1][1] = "validpass";
		
		o[2][0] = "validemail@gamil.com";
		o[2][1] = "invalidpass";
		
		o[3][0] = "validemail@gamil.com";
		o[3][1] = "validpass";
		
		return(o);
	}
}

