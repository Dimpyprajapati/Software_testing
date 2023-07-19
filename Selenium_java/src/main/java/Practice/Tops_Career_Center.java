package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tops_Career_Center {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://careercenter.tops-int.com/");
        
        driver.manage().window().maximize();
        
        WebElement Mnumber = driver.findElement(By.id("mobile"));
        Mnumber.sendKeys("7802800925");
        WebElement password = driver.findElement(By.id("password"));
        password .sendKeys("7802800925");
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
        btn.click();
        
        WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]"));
        btn2.click();
        WebElement personal_detail = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[1]/a"));
        personal_detail.click();
        
    //    JavascriptExecutor js = (JavascriptExecutor)driver;
    //    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
     //   WebElement state = driver.findElement(By.xpath("//*[@id=\"select2-district-container\"]"));
     //   Actions action = new Actions(driver);
     //   action.click(state)
     //         .sendKeys("Rajkot")
     //         .keyUp(Keys.SHIFT);
        
        WebElement profile_image = driver.findElement(By.id("profileImage"));
        profile_image.click();
        profile_image.sendKeys("C:\\Users\\Dimple Prajapati\\Desktop\\wallpaper.jpg");
        
        
        WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]"));
        btn3.click();
        WebElement logOut =driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a"));
        logOut.click();
        
	}

}
