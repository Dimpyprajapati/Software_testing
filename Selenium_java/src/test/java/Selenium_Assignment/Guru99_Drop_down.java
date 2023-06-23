package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_Drop_down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        
        WebElement country = driver.findElement(By.name("country"));
        country.click();
        Select countrys = new Select(country);
        countrys.selectByIndex(15);
        country.click();
        System.out.println("country selected");
        
	}
}
