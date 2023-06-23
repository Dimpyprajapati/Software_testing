package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        
        WebElement ele = driver.findElement(By.xpath("//select[@id='second']"));
        ele.click();
        Select select = new Select(ele);
       
        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        
        List<WebElement> listofoptions = select.getAllSelectedOptions();
        for(WebElement obj : listofoptions) {
        	System.out.println(obj.getText());
        }   
	}
}
