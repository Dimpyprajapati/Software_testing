package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_ScrollUpDown_FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
    // Scroll by pixel :-
        JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,150)");
        
    // Scroll by element :-
        WebElement element = driver.findElement(By.id("uploadPicture"));
        js.executeScript("arguments[0].scrollIntoView();",element);
        
    // Scroll to bottom(down) :-
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dimple Prajapati\\Desktop\\wallpaper.jpg");
	}
}
