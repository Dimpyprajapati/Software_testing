package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_datepicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        
        driver.findElement(By.id("DropDown DatePicker")).click();
        driver.manage().window().maximize();
        
        WebElement myframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));
		driver.switchTo().frame(myframe);
        System.out.println("Switched to myframe");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        driver.findElement(By.id("datepicker")).click();
        
        WebElement month = driver.findElement(By.className("ui-datepicker-month"));
        Select months = new Select(month);
        months.selectByIndex(8);
        
        WebElement year = driver.findElement(By.className("ui-datepicker-year"));
        Select years = new Select(year);
        years.selectByValue("2018");
        
        String mydate = "12";
        List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
        for (WebElement date : dates) {
        	String dt = date.getText();
           	if (dt.equals(mydate)) {
           		date.click();
           	}
        }
	}
}
