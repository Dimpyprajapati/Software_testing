package TestNg_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TopsHome_Testng 
    {
	static WebDriver driver;
	@BeforeClass
	public static void openbrowser() {
		String url = ("https://careercenter.tops-int.com/dashboard");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Parameters({"mobileNumber","password"})
	@Test (dataProvider = "dp")
	public void testlogin(String mobileNumber , String password) throws InterruptedException 
	{
		WebElement mobileEle = driver.findElement(By.id("mobile"));
		mobileEle.clear();
		mobileEle.sendKeys(mobileNumber);
			
	    WebElement passEle = driver.findElement(By.id("password"));
	    passEle.clear();
	    passEle.sendKeys(password);
	    
	    WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	    btn.click(); 
	    
	    WebElement resume = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
	    resume.click();
	    
	    WebElement skill = driver.findElement(By.xpath("//*[@id=\"v-pills-technical-tab\"]"));
	    skill.click();
	    WebElement languages = driver.findElement(By.name("programming_languages"));
	    languages.sendKeys("selenium");
	    WebElement databases = driver.findElement(By.id("databases"));
	    databases.sendKeys("Mysql,MongoDB");
	    WebElement webservers = driver.findElement(By.id("webServers"));
	    webservers.sendKeys("Apache");
	    WebElement software = driver.findElement(By.id("softwares"));
	    software.sendKeys("Jira,Git");
	    WebElement systems = driver.findElement(By.name("systems"));
	    systems.sendKeys("Linux,Window,Mac");
	    
	    WebElement education = driver.findElement(By.xpath("//*[@id=\"v-pills-education-tab\"]"));
	    education.click();
	    WebElement add_Edu = driver.findElement(By.xpath("//*[@id=\"v-pills-education\"]/div/div[6]/a"));
	    add_Edu.click();
	    Thread.sleep(2000);
	    WebElement degree = driver.findElement(By.name("degree"));
	    degree.click();
	    Select degrees = new Select(degree);
	    degrees.selectByValue("5");
	    degree.click();
	    WebElement clg = driver.findElement(By.name("college_name"));
	    clg.sendKeys("Madhav_International_Clg");
	    WebElement year = driver.findElement(By.id("passingYear"));
	    year.click();
	    Select years = new Select(year);
	    years.selectByValue("2013");
	    year.click();
	    WebElement result = driver.findElement(By.id("result"));
	    result.sendKeys("85");
	    WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"educationSummery\"]/div/div/div/div[1]/div/button"));
	    btn1.click();
	  
	}	
			
	@DataProvider(name = "dp")
	public static Object[][] passdata() {
		Object o[][] = new Object[1][2];
			
		 o[0][0] = "7802800925";
		 o[0][1] = "7802800925";
			
		 return o;
	}	
}
