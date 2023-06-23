package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Event {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        
        WebElement Home = driver.findElement(By.linkText("Home"));
        WebElement cruises = driver.findElement(By.linkText("Cruises"));
        WebElement vacations = driver.findElement(By.linkText("Vacations"));
        WebElement flights = driver.findElement(By.linkText("Flights"));
        
        Actions action = new Actions(driver);
        action.moveToElement(Home).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(cruises).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(vacations).build().perform();
        Thread.sleep(2000);
        
        action.moveToElement(flights).build().perform();
        Thread.sleep(2000);
        
	}
}
