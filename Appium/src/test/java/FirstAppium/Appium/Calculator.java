package FirstAppium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	WebDriver wdriver;
	
	static AppiumDriver driver;
	AndroidDriver aDriver;
	
	public static void main(String[] args) throws InterruptedException{
		try {
			  openCalc();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	public static void openCalc() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//for real device
		dc.setCapability("deviceName", "Redmi 9A");
		dc.setCapability("udid", "ZP49JVBIJVGEHYT8");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10 QP1A.190711.020");
//		dc.setCapability("platformVersion", "10");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		//for emulator
//		dc.setCapability("automationName": "UIAutomator2"); 
//		dc.setCapability("app", "C:\\Users\\jay-pc\\Desktop\\Appium\\myfirstapp.apk");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		URL url = new URL("http://127.0.0.1.4723/wd/hub");
		driver = new AppiumDriver(url, dc);
		
//		driver.findElement(By.id("com.miui.calculator:id/listView")).click();
		WebElement eight = driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
		WebElement div   = driver.findElement(By.id("com.miui.calculator:id/btn_div_s"));
		WebElement two  = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		WebElement eq  = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		WebElement res = driver.findElement(By.id("com.miui.calculator:id/expression"));
		eight.click();
		div.click();
		two.click();
		eq.click();
		String result = res.getText();
		System.out.println("app started "+result);
		Thread.sleep(2000);	
		
	}
}
