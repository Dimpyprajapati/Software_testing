package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TopsHomePage {
	public static void main(String[] args) throws InterruptedException {
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
        
        WebElement cources = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
        cources.click();
        WebElement assignment = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[3]/a"));
        assignment.click();
        
        Thread.sleep(2000);
        WebElement resume_builder = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
        resume_builder.click();
        
        WebElement Technical_skill = driver.findElement(By.xpath("//*[@id=\"v-pills-technical-tab\"]"));
        Technical_skill.click();
        Thread.sleep(2000);
        WebElement languages = driver.findElement(By.id("programmingLanguages"));
        languages.sendKeys(",python");
        
        WebElement Education = driver.findElement(By.xpath("//*[@id=\"v-pills-education-tab\"]"));
        Education.click();
        WebElement add_details = driver.findElement(By.xpath("//*[@id=\"v-pills-education\"]/div/div[6]/a"));
        add_details.click();
        Thread.sleep(2000);
        WebElement degree = driver.findElement(By.name("degree"));
        degree.click();
        Select degrees = new Select(degree);
        degrees.selectByValue("5");
        degree.click();
        WebElement clg = driver.findElement(By.id("collegeName"));
        clg.sendKeys("ks school of college");
        WebElement passing_year = driver.findElement(By.name("passing_year"));
        passing_year.click();
        Select years = new Select(passing_year);
        years.selectByValue("2013");
        passing_year.click();
        WebElement result = driver.findElement(By.id("result"));
        result.sendKeys("75");
        WebElement cancelbtn = driver.findElement(By.xpath("//*[@id=\"educationSummery\"]/div/div/div/div[1]/div/button"));
        cancelbtn.click();
        
        WebElement upload_review = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[4]/a"));
        upload_review.click();
        WebElement upload_image = driver.findElement(By.id("reviewImage"));
        upload_image.sendKeys("C:\\Users\\Dimple Prajapati\\Desktop\\wallpaper.jpg");
        WebElement select_dropdown = driver.findElement(By.id("reviewForm"));
        select_dropdown.click();
        Select dds = new Select(select_dropdown);
        dds.selectByValue("google");
        select_dropdown.click();
        WebElement remark = driver.findElement(By.id("sugText"));
        remark.sendKeys("Hii,I am dimple.");
        
        WebElement event = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[7]/a"));
        event.click();
        WebElement left_arrow = driver.findElement(By.xpath("//*[@id=\"events-slider\"]/div[2]/button[1]/div"));
        left_arrow.click();
        WebElement right_arrow = driver.findElement(By.xpath("//*[@id=\"events-slider\"]/div[2]/button[2]/div"));
        right_arrow.click();
        
        
 
	}
}
