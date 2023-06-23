package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IconTriger_Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        
        driver.findElement(By.id("Icon Trigger")).click();
        driver.manage().window().maximize();
        
        WebElement myFrame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[3]/p/iframe"));
        driver.switchTo().frame(myFrame);
        System.out.println("Switched to myframe");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       driver.findElement(By.className("ui-datepicker-trigger")).click();
        
        String mydate = "15";
        String myyear = "2024";
        String mymonth = "July";
        
        String currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
        System.out.println("Current year");
        int y3 = Integer.parseInt(myyear);
        int y4 = Integer.parseInt(currentyear);
        while (!myyear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
        	if (y3 > y4) {
        		driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
        	} else {
        		driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
        	}
        }
        
        while (!mymonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
        	if (y3 > y4) {
        		driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
        	} else {
        		driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
        	}
        }
        
        List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
        for (WebElement date : dates) {
        	String dt = date.getText();
        	if (dt.equals(mydate)) {
        		date.click();
        	}
		} 
	}
}
