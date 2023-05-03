package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Havmorwebsite {
	public static void main(String args[]) {
      System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.havmor.com/");

      driver.manage().window().maximize();
      driver.findElement(By.xpath("//*[@id=\"block-flavours\"]/div/section/div[2]/div/div/ul/li[2]/a/img")).click();
        
    }
}