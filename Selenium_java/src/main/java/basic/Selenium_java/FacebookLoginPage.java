package basic.Selenium_java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginPage {
	public static void main(String args[]) {		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("java");
		driver.findElement(By.name("lastname")).sendKeys("core");
		driver.findElement(By.name("reg_email__")).sendKeys("78028009258");
		driver.findElement(By.name("reg_passwd__")).sendKeys("780p80i9lo8");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("18");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("year"));
	    Select years = new Select(year);
		years.selectByIndex(12);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(2).click();
		
		//driver.close();
		//driver.quit();
		
	//	driver.findElement(By.id("email")).sendKeys("pateldimple456@gmail.com ");
	//	driver.findElement(By.id("pass")).sendKeys("7096512010");
	//	driver.findElement(By.name("login")).click();
	//	String msg = driver.findElement(By.className("_9ay7")).getText();
	//	System.out.println(msg);
	}
}
