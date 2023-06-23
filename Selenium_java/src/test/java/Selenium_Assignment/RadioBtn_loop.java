package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn_loop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        
        List<WebElement> radio = driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));
        
        for(int i=0; i<radio.size(); i++) 
        {
        	WebElement local_radio = radio.get(i);
      
        	String value = local_radio.getAttribute("value");
       	
        	System.out.println("Values from radio buttons are ======>>>>> " + value);
        }
	}
}
