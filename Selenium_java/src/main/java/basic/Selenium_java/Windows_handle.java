package basic.Selenium_java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		Set<String> allwindows =driver.getWindowHandles();
		for (String s:allwindows) {
			if(!s.equals(mainwindow)) {
				driver.switchTo().window(s);
			}
		}
		
		String email = ("guru@gmail.com");
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.close();
		//driver.switchTo().window(mainwindow);
		//driver.close();
		driver.quit();
		
	
		
		
		
	}

}
