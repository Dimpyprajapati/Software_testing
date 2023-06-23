package JUnit_Assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.Selenium_java.Driver_connection;

@RunWith(Parameterized.class)
public class Facebook_loginProcess_Junit {
	
	String email;
	String password;
	
	public Facebook_loginProcess_Junit(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Test 
	public void testlogin() {
		String url = "https://www.facebook.com/";
		WebDriver driver = Driver_connection.getconnection(url);
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	@Parameters
	public static List<Object[]> passData() {
		Object o[][]= new Object[1][2];
		
		o[0][0] = "selenium@gmail.com";
		o[0][1] = "selenium123";
		
		return Arrays.asList(o);
	}
}
