package basic.Selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_loginpage_forloop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
		String email1 = "selenium@@gmail.com";
		String pass1 = "66656gfr545u";
		String email2 = "patelmeet402@gmail.com";
		String pass2 = "65465655hbghh";
		String email3 = "selenium@@gmail.com";
		String pass3 = "7096512010";
		String email4 = "patelmeet402@gmail.com";
		String pass4 = "7096512010";
		
		for(int i=1; i<=4; i++) {
			
			if(i==1) {
				driver.findElement(By.id("email")).sendKeys(email1);
				driver.findElement(By.id("pass")).sendKeys(pass1);
				driver.findElement(By.name("login")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String msg = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[5]")).getText();
				System.out.println(msg);
				driver.findElement(By.xpath("//*[@id=\"u_0_6_gi\"]/div/i")).click();
				driver.close();
			}
			else if (i==2) {
				driver.findElement(By.id("email")).sendKeys(email2);
				driver.findElement(By.id("pass")).sendKeys(pass2);
				driver.findElement(By.name("login")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String msg = driver.findElement(By.xpath("//*[@id=\\\"facebook\\\"]/body/div[3]/div[2]/div/div/div/div/div[5]")).getText();
				System.out.println(msg);
				driver.close();
			}
			else if (i==3) {
				driver.findElement(By.id("email")).sendKeys(email3);
				driver.findElement(By.id("pass")).sendKeys(pass3);
				driver.findElement(By.name("login")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String msg = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[5]")).getText();
				System.out.println(msg);
				driver.close();
			}
			else if (i==4) {
				driver.findElement(By.id("email")).sendKeys(email4);
				driver.findElement(By.id("pass")).sendKeys(pass4);
				driver.findElement(By.name("login")).click();
			//	String msg = driver.findElement(By.className("_9ay7")).getText();
			//	System.out.println(msg);
				
			}
		}
	}
}

