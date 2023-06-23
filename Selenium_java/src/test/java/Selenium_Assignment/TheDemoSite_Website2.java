package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheDemoSite_Website2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://thedemosite.co.uk/");
        
        WebElement btn = driver.findElement(By.linkText("Contact"));
        btn.click();
        
        WebElement fname = driver.findElement(By.xpath("//*[@id='post-24']/div/div/form/div[1]/input"));
        fname.sendKeys("Krisha");
        WebElement lname = driver.findElement(By.xpath("//*[@id='post-24']/div/div/form/div[2]/input"));
        lname.sendKeys("Shah");
        WebElement email = driver.findElement(By.xpath("//*[@id='post-24']/div/div/form/div[3]/input"));
        email.sendKeys("Krisha@gamil.com");
        WebElement msg = driver.findElement(By.xpath("//*[@id='post-24']/div/div/form/div[4]/textarea"));
        msg.sendKeys("Hello this is first website");
        
        WebElement sbtn = driver.findElement(By.xpath("//*[@id='post-24']/div/div/form/div[7]/button"));
        sbtn.click();
	}
}
