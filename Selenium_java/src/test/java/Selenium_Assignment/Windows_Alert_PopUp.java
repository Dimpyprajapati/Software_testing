package Selenium_Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Alert_PopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		WebElement btn = driver.findElement(By.linkText("Click Here"));
		btn.click();
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String s: allwindow) {
			if(!s.equals(mainwindow)) {
				driver.switchTo().window(s);
			}
		}
		
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("guru@gmail.com");
		WebElement Lbtn = driver.findElement(By.name("btnLogin"));
		Lbtn.click();
		
		driver.close();
		driver.switchTo().window(mainwindow);
	//	driver.close();
	
	}
}
