package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calender_data {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = Driver_connection.getconnection(url);
        
		WebElement myframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(myframe);
		System.out.println("Switched to iframe");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.findElement(By.id("datepicker")).click();
		
		String myDate = "20";
		String myMonth = "March";
		String myYear = "2026";
		
		String currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println("current year");
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentyear);
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if(y1 > y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			}
			else{
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if(y1 > y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			} else {
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
	
		List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		for (WebElement date : dates) {
			String dt = date.getText();
			if(dt.equals(myDate)) {
				date.click();
			}
		}
	}
}
