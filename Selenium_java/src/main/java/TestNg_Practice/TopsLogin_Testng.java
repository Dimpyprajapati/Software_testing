package TestNg_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class TopsLogin_Testng {
	
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() 
	{
		String url =("https://careercenter.tops-int.com/");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
        driver.manage().window().maximize();  
	}
	
	@Parameters({"mobileNumber","password"})
	@Test (dataProvider = "dp")
	public void testlogin(String mobileNumber , String password) 
	{
		WebElement mobileEle = driver.findElement(By.id("mobile"));
		mobileEle.clear();
		mobileEle.sendKeys(mobileNumber);
			
	    WebElement passEle = driver.findElement(By.id("password"));
	    passEle.clear();
	    passEle.sendKeys(password);
	    
	    WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	    btn.click();   
	}	
			
	@DataProvider(name = "dp")
	public static Object[][] passdata() {
		Object o[][] = new Object[1][2];
		
		 o[0][0] = "7802800925";
		 o[0][1] = "7802800925";
	
		 return o;
	}	
}


