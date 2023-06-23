package basic.Selenium_java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ShiftRight;

public class DemoQA {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        driver.findElement(By.id("firstName")).sendKeys("java");
        driver.findElement(By.id("lastName")).sendKeys("selenium");
        driver.findElement(By.id("userEmail")).sendKeys("Dimpy@gmail.com");
        
        List<WebElement> gender = driver.findElements(By.xpath("//*[@name='gender']/following-sibling::label"));
        gender.get(1).click();
        
        driver.findElement(By.id("userNumber")).sendKeys("896352352512");
        
        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select months = new Select(month);
        months.selectByIndex(9);
        
        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select years = new Select(year);
        years.selectByValue("1987");
        
        String mydate = "15";
        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']/div[2]/div/div"));
        for(WebElement date : dates) {
       	String dt = date.getText();
          if (dt.equals(mydate)) {
				date.click();
			}
        }
        
        WebElement ele = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
        Actions action = new Actions(driver);
        
        action.click(ele)
              .keyDown(Keys.SHIFT)
              .sendKeys("M")
              .keyUp(Keys.SHIFT)
              .pause(Duration.ofSeconds(5))
              .sendKeys(Keys.ARROW_DOWN)
              .sendKeys(Keys.ENTER)
              .build()
              .perform();
              
              
    
   //     driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
   //     driver.findElement(By.id("currentAddress")).sendKeys("vastral");
   //     driver.findElement(By.id("submit")).click();
	}
}









