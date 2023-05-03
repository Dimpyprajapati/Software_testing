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
	    driver.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	  //  driver.close();
	 // driver.quit();
	  }
  }