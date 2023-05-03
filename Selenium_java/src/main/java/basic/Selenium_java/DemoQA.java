package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA 
{
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        driver.findElement(By.id("firstName")).sendKeys("java");
        driver.findElement(By.id("lastName")).sendKeys("selenium");
        driver.findElement(By.id("userEmail")).sendKeys("Dimpy@gmail.com");
        //List<WebElement> gender = driver.findElements(By.name("gender"));
        //gender.get(1).click();
        WebElement day = driver.findElement(By.id("dateOfBirthInput"));
        Select days = new Select(day);
        days.selectByVisibleText("22");
        driver.findElement(By.id("userNumber")).sendKeys("896352352512");
        driver.findElement(By.id("currentAddress")).sendKeys("vastral");
        driver.findElement(By.id("submit")).click();
	}
}









