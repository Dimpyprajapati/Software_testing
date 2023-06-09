package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
		List<WebElement> thead = driver.findElements(By.xpath("//div[@class='nav-progressive-content']/a"));
		for(int i=1; i<=thead.size(); i++) {
			String header = driver.findElement(By.xpath("//div[@class='nav-progressive-content']/a["+i+"]")).getText();
			System.out.print(header+" | ");
		}
		driver.findElement(By.xpath("//div[@class='nav-progressive-content']/a[4]")).click();
	}
}

