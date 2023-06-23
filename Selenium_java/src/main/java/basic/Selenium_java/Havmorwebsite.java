package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Havmorwebsite {
	public static void main(String args[]) {
      System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.havmor.com/");

    //  driver.manage().window().maximize();
      driver.findElement(By.xpath("//div[@class='views-element-container']/div/div/ul/li[3]")).click();
      	
    }
}
