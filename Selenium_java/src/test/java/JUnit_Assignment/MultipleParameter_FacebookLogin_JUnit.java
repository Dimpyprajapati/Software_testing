package JUnit_Assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Selenium_java.Driver_connection;

@RunWith(Parameterized.class)
public class MultipleParameter_FacebookLogin_JUnit {

	    String email;
		String password;
		
		public MultipleParameter_FacebookLogin_JUnit(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}
		
		static WebDriver driver;
		@BeforeClass
		public static void openbrowser() {
			String url = "https://www.facebook.com/";
			driver = Driver_connection.getconnection(url);
		}
		
		@Test
		public void testlogin() {
			WebElement emailEle = driver.findElement(By.id("email"));
			emailEle.clear();
			emailEle.sendKeys(email);
			WebElement passele = driver.findElement(By.id("pass"));
			passele.clear();
			passele.sendKeys(password);
			
		}
		@Parameters
		public static List<Object[]> passData() {
			Object o[][]= new Object[4][2];
			
			o[0][0] = "invalidemail@gmail.com";
			o[0][1] = "invalidpass";
			
			o[1][0] = "invalidemail@gmail.com";
			o[1][1] = "validpass";
			
			o[2][0] = "valideemail@gmail.com";
			o[2][1] = "invalidpass";
			
			o[3][0] = "validemail@gmail.com";
			o[3][1] = "validpass";
			
			return Arrays.asList(o);
		}
	}