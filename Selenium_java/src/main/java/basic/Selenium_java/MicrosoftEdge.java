package basic.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge 
 {
	public static void main(String args[]) 
	 {
		System.out.println("Hello World");
		System.setProperty("webdriver.edge.driver","D:\\Edge Driver\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    
	  //  driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	  //  driver.close();
	 // driver.quit();
	  }
  }
