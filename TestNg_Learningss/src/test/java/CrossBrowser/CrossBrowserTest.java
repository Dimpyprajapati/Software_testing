package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Parameters ("browser")
	@Test
	public void test(String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		
		if(browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\Edge Driver\\edgedriver_win64 (1)");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
		
		if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver-v0.33.0-macos-aarch64");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
	}
}
