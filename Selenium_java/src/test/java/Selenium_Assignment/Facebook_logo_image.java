package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_logo_image {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login");
		
		String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
		WebElement image = driver.findElement(By.xpath("//div[@id='content']/div/div/img"));
		image.click();
		
	}
}
