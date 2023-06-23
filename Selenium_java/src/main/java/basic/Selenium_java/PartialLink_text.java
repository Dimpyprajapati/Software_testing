package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
        System.out.println(links.size());
        links.get(1).click();
    //    for(WebElement link : links) {
    //    	System.out.println(link.getText());
    //    }
        
	}
}
