package Junit_framework;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

@RunWith (Parameterized.class)
public class J_004_LoginTest {
	
	String email;
	String password;
	
	public J_004_LoginTest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url =("https://www.facebook.com/");
        driver.get(url);
        driver.manage().window().maximize();  
	}
	
	@Test
	public void testlogin() {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		
        WebElement passEle = driver.findElement(By.id("pass"));
        passEle.clear();
        passEle.sendKeys(password); 
	}	
		
	@Parameters
	public static List<Object[]> passdata() {
		Object o[][] = new Object[4][2];
		
		o[0][0] = "invalidemail@gamil.com";
		o[0][1] = "invalidpass";
		
		o[1][0] = "invalidemail@gamil.com";
		o[1][1] = "validpass";
		
		o[2][0] = "validemail@gamil.com";
		o[2][1] = "invalidpass";
		
		o[3][0] = "validemail@gamil.com";
		o[3][1] = "validpass";
		
		return Arrays.asList(o);
	}
}
