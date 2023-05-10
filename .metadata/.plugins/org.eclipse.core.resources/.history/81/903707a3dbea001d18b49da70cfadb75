package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticform 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://cosmocode.io/automation-practice-webtable/");
    
   //static parent to child class :- 
    WebElement currency = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[3]/td[4]"));
    String data = currency.getText();
    System.out.println(data);
    
    WebElement capital = driver.findElement(By.xpath("//table/tbody/tr[27]/td[3]"));
    String data1 = capital.getText();
    System.out.println(data1);
    
    }
}