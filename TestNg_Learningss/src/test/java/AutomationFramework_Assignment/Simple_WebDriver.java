package AutomationFramework_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_WebDriver {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://itera-qa.azurewebsites.net/Login");

}
