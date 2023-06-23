package Selenium_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        
        WebElement CusId = driver.findElement(By.name("cusid"));
        CusId.sendKeys("4529");
        
        WebElement sbtn = driver.findElement(By.name("submit"));
        sbtn.click();
        Alert deleteAlert = driver.switchTo().alert();
        System.out.println(deleteAlert.getText());
        deleteAlert.dismiss();
           
	}
}
