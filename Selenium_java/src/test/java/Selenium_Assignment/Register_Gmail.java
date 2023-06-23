package Selenium_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
		
        WebElement fname = driver.findElement(By.name("firstName"));
        fname.sendKeys("Dimple");
        WebElement lname = driver.findElement(By.name("lastName"));
        lname.sendKeys("Prajapati");
        WebElement btn = driver.findElement(By.xpath("//div[@id='collectNameNext']/div/button/span"));
        btn.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
        WebElement day = driver.findElement(By.name("day"));
        day.sendKeys("26");
        
        WebElement month = driver.findElement(By.id("month"));
        Select months = new Select(month);
		months.selectByVisibleText("April");
		
		WebElement year = driver.findElement(By.name("year"));
        year.sendKeys("1996");
        
        WebElement Gender = driver.findElement(By.id("gender"));
        Select gender = new Select(Gender);
		gender.selectByValue("2");
		
		WebElement btn2 = driver.findElement(By.xpath("//div[@id='birthdaygenderNext']/div/button"));
		btn2.click();
		
//		List<WebElement> genderRbtn = driver.findElements(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[1]/div"));
//        genderRbtn.get(1).click();
      
//		WebElement mail = driver.findElement(By.name("Username"));
//		mail.sendKeys("pdimple");
//		List<WebElement> genderRbtn = driver.findElements(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[1]/div"));
//        genderRbtn.get(3).click();
//        WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
//		btn3.click();
 

	}
}
