package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_form 
{
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
	//	driver.manage().window().maximize();
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("selenium");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("patel");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("78025639685");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("USA");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("melvan");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("selenium@gamil.com");
		
		List<WebElement> Gender = driver.findElements(By.id("q26"));
		Gender.get(1).click();
	}
}
