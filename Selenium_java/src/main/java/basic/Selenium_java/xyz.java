package basic.Selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xyz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
		WebElement ele = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
        Actions action = new Actions(driver);
        
        action.click(ele)
              .keyDown(Keys.SHIFT)
              .sendKeys("M")
              .keyUp(Keys.SHIFT)
              .pause(Duration.ofSeconds(5))
              .sendKeys(Keys.ARROW_DOWN)
              .sendKeys(Keys.ENTER)
              .build()
              .perform();
	}
}
