package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRegister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        
        driver.findElement(By.id("ap_customer_name")).sendKeys("Java");
        driver.findElement(By.id("ap_phone_number")).sendKeys("546465654654");
        driver.findElement(By.id("ap_email")).sendKeys("jd@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("dd552ddfd");
        driver.findElement(By.id("continue")).click();
	}

}
