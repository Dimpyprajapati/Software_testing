package basic.Selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
       public static void main(String args[]) 
       {
    	   System.out.println( " Hello World " );
		   System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.get("https://www.flipkart.com/");
		   
		   String title = driver.getTitle();
		   System.out.println(title);
		   String url = driver.getCurrentUrl();
		   System.out.println(url);
		   
		  // driver.close();
		  // driver.quit();
	} 
}
