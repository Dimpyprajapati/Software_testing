package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(WebElement w:frames) {
			System.out.println(w);
		}
		
	//	WebElement f1 = driver.findElement(By.id("frame1"));
	//	driver.switchTo().frame(f1);
	//	String msg = driver.findElement(By.id("sampleHeading")).getText();
	//	System.out.println(msg);
		
	//	WebElement f2 = driver.findElement(By.id("frame2"));
	//	driver.switchTo().frame(f2);
	//	String msg2 = driver.findElement(By.id("sampleHeading")).getText();
	//	System.out.println(msg2);
		
	//	WebElement f3 = driver.findElement(By.xpath("/html/body/iframe[1]"));
	//	driver.switchTo().frame(f3);
		
	//	WebElement f4 = driver.findElement(By.xpath("/html/body/iframe[2]"));
	//	driver.switchTo().frame(f4);
		
	//	WebElement f5 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
	//	driver.switchTo().frame(f5);
		
	//	WebElement f6 = driver.findElement(By.id("aswift_0"));
	//	driver.switchTo().frame(f6);
		
		WebElement f7 = driver.findElement(By.xpath("/html/body/iframe[3]"));
		driver.switchTo().frame(f7);
		
	//	WebElement f8 = driver.findElement(By.id("google_esf"));
	//	driver.switchTo().frame(f8);
		
	}
}
