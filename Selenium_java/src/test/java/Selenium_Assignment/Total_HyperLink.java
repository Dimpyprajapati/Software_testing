package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_HyperLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        
        driver.manage().window().maximize();
        
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total links on webpage :");
        System.out.println(linkElements.size());
        
        for(WebElement el : linkElements) {
        	System.out.println(el.getText());
        } 	
	}
}
