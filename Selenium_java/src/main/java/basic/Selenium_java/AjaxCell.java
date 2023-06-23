package basic.Selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxCell {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        WebElement ele = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        
        action.click(ele)
                .keyDown(Keys.SHIFT)
                .sendKeys("learn selenium")
                .keyUp(Keys.SHIFT)
                .pause(Duration.ofSeconds(5))
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
	}

}
