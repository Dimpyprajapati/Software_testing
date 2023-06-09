package basic.Selenium_java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_testing_website {
	 public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Alerts.html");
         
         WebElement btn = driver.findElement(By.xpath("//div[@id='OKTab']/button"));
         btn.click();
         System.out.println("Button clicked");
         Alert btnAlert = driver.switchTo().alert();
         btnAlert.accept();
         
         
         WebElement tag = driver.findElement(By.linkText("Alert with OK & Cancel"));
         tag.click();
         WebElement cancelalert = driver.findElement(By.xpath("//div[@id='CancelTab']/button"));
         cancelalert.click();
         Alert cancelAlert = driver.switchTo().alert();
         System.out.println(cancelAlert.getText());
         cancelAlert.dismiss();
        		 
        		 
         WebElement tag1 = driver.findElement(By.linkText("Alert with Textbox"));
         tag1.click();
         WebElement inputbtn = driver.findElement(By.xpath("//div[@id='Textbox']/button"));
         inputbtn.click();
         Alert tagAlert = driver.switchTo().alert();
         System.out.println(tagAlert.getText());
         tagAlert.sendKeys("Automation testing user");
         tagAlert.accept();
         
    }
}
