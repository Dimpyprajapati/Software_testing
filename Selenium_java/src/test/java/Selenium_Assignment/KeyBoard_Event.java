package Selenium_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Event {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement ele = driver.findElement(By.id("email"));
        Actions action = new Actions(driver);
        
        action.click(ele)
              .keyDown(Keys.SHIFT)
              .sendKeys("HELLO")
              .keyUp(Keys.SHIFT)
              .pause(Duration.ofSeconds(5))
              .sendKeys(Keys.ARROW_DOWN)
              .contextClick()
              .build()
              .perform();
	}
}
