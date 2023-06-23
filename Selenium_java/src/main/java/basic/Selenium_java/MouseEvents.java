package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        
        WebElement sell = driver.findElement(By.linkText("Sell"));
        WebElement mobile = driver.findElement(By.linkText("Mobiles"));
        WebElement new_releases = driver.findElement(By.linkText("New Releases"));
        WebElement best_sellers = driver.findElement(By.linkText("Best Sellers"));
        
        Actions action = new Actions(driver);
        action.moveToElement(sell).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(mobile).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(new_releases).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(best_sellers).build().perform();
        Thread.sleep(2000);

	}
}
