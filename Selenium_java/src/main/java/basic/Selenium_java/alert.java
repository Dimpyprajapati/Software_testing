package basic.Selenium_java;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://demoqa.com/alerts");
         
        // First alert -->
         WebElement btn = driver.findElement(By.id("alertButton"));
         btn.click();
         System.out.println("btn clicked");
         Alert alert = driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.accept();
         
        // Second alert -->
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement timebtn = driver.findElement(By.id("timerAlertButton"));
         timebtn.click();
         wait.until(ExpectedConditions.alertIsPresent());
         Alert timealert = driver.switchTo().alert();
         System.out.println(timealert.getText());
         timealert.accept();
         
        // Third alert -->
         WebElement cancelbtn = driver.findElement(By.id("confirmButton"));
         cancelbtn.click();
         Alert cancelAlert = driver.switchTo().alert();
         System.out.println(cancelAlert.getText());
         cancelAlert.dismiss();
         
         // Forth alert --> not running alert_testng_website class is running.
      //   WebElement textbtn = driver.findElement(By.id("promtButton"));
      //   textbtn.click();
      //   Alert textAlert = driver.switchTo().alert();
      //   textAlert.sendKeys("Hello Selenium");
      //   textAlert.accept();

	}
}
