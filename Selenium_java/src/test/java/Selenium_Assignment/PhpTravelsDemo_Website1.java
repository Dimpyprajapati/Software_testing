package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsDemo_Website1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        
        WebElement fname = driver.findElement(By.name("first_name"));
        fname.sendKeys("Ved");
        WebElement lname = driver.findElement(By.name("last_name"));
        lname.sendKeys("Patel");
        WebElement bname = driver.findElement(By.name("business_name"));
        bname.sendKeys("Computer Engineer");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Ved@gmail.com");
        
        WebElement num1 = driver.findElement(By.id("numb1"));
        System.out.println(num1.getText());
        String numM1 = num1.getText();
        
        WebElement num2 = driver.findElement(By.id("numb2"));
        System.out.println(num2.getText());
        String numM2 = num2.getText();
        
        Integer number1 = Integer.parseInt(numM1);
        Integer number2 = Integer.parseInt(numM2);
        
        WebElement res = driver.findElement(By.id("number"));
        int newNum = number1 + number2;
        res.sendKeys(String.valueOf(newNum));
          
        WebElement btn = driver.findElement(By.id("demo"));
        btn.click();
        
	}
}
