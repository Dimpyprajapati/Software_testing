package TestNg_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Without_login_Testng {
	static WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		String url = ("https://demo.guru99.com/test/newtours/reservation.php");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
  		driver = new ChromeDriver();
  		driver.get(url);
  		driver.manage().window().maximize();
     }
	
	@Test
	public void testlogin() {
		List<WebElement> trip1 = driver.findElements(By.name("tripType"));
		trip1.get(1).click();
		
		WebElement passenger = driver.findElement(By.name("passCount"));
		Select passengers = new Select(passenger);
		passengers.selectByValue("3");
		
		WebElement Departing_From = driver.findElement(By.name("fromPort"));
		Select forms = new Select(Departing_From);
		forms.selectByValue("London");
		
		WebElement on = driver.findElement(By.name("fromMonth"));
		Select ons = new Select(on);
		ons.selectByValue("9");
		WebElement onday = driver.findElement(By.name("fromDay"));
		Select ondays = new Select(onday);
		ondays.selectByValue("26");
		
		WebElement arriving_in = driver.findElement(By.name("toPort"));
		Select arriving_ins = new Select(arriving_in);
		arriving_ins.selectByValue("San Francisco");
		
		WebElement returning = driver.findElement(By.name("toMonth"));
		Select returnings = new Select(returning);
		returnings.selectByValue("11");
		WebElement today = driver.findElement(By.name("toDay"));
		Select todays = new Select(today);
		todays.selectByValue("31");
		
		List<WebElement>serviceClass = driver.findElements(By.name("servClass"));
		serviceClass.get(2).click();
		
		WebElement airline = driver.findElement(By.name("airline"));
		Select airlines = new Select(airline);
		airlines.selectByVisibleText("Blue Skies Airlines");
		
		WebElement btn = driver.findElement(By.name("findFlights"));
		btn.click();
		
		WebElement btn1 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img"));
		btn1.click();
		
	}
	
//   @AfterClass
//   public void quit() 
//	 {
//	   driver.quit();
//   }
	
}

	


