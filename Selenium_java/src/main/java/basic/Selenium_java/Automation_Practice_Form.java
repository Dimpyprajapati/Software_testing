package basic.Selenium_java;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice_Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("Ved");
        WebElement lname = driver.findElement(By.name("lastname"));
        lname.sendKeys("Prajapati");
        
        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(0).click();
        
        List<WebElement> gender1 = driver.findElements(By.name("exp"));
        gender1.get(5).click();
        
        WebElement date = driver.findElement(By.xpath("//div[@id='mainContent']/div[4]/div/form/table/tbody/tr[5]/td[2]/input"));
        date.sendKeys("04/01/2023");
        
        WebElement profession1 = driver.findElement(By.xpath("//div[@id='mainContent']/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input"));
        profession1.click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,150)");
        
        driver.findElement(By.name("photo")).sendKeys("C:\\Users\\Dimple Prajapati\\Desktop\\wallpaper.jpg");
        
        WebElement flavours = driver.findElement(By.xpath("//div[@id='mainContent']/div[4]/div/form/table/tbody/tr[8]/td[2]/span[2]/input"));
        flavours.click();
        
        WebElement continent = driver.findElement(By.name("continents"));
        continent.click();
        Select continents = new Select(continent);
        continents.selectByVisibleText("Australia");
        continent.click();
        System.out.println("continent selected");
        
        WebElement ele = driver.findElement(By.xpath("//div[@id='mainContent']/div[4]/div/form/table/tbody/tr[10]/td[2]/select"));
        ele.click();
        Select select = new Select(ele);
        select.selectByVisibleText("Browser Commands");
        List<WebElement> listofoptions = select.getAllSelectedOptions();
        for(WebElement obj : listofoptions) {
        	System.out.println(obj.getText());
        	
        WebElement cancelbtn = driver.findElement(By.name("submit"));
        cancelbtn.click();
        Alert cancelalert = driver.switchTo().alert();
        System.out.println(cancelalert.getText());
        cancelalert.dismiss();
        
        }
	}
}
