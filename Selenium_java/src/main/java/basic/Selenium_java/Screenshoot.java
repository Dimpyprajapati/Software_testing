package basic.Selenium_java;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot {
	public static void getscreenshoot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        File dest = new File(path);
        
        try {
        	FileUtils.copyFile(source, dest);
        	System.out.println("Screen shoot Taken");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://topsint.com/topserp/index.php");
        
        driver.findElement(By.name("btn_login")).click();
        getscreenshoot(driver,"C:\\Users\\Dimple Prajapati\\Ss\\err.png");
        
	}
}
