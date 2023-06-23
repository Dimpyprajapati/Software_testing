package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        
        WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
        driver.switchTo().frame(iframe);
        
        WebElement from = driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
        WebElement to = driver.findElement(By.id("trash"));
        
        Actions action = new Actions(driver);
        action.clickAndHold(from).moveToElement(to).release().build().perform();
	}

}
