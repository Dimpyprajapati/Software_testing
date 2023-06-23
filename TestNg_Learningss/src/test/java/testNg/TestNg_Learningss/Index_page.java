package testNg.TestNg_Learningss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Index_page {
	
	@Test (priority = 2, groups = "Purchase")
	public void login( ) {
		System.out.println("Login method");
	}
	
	@Test (priority = 1, groups = "Smoke")
	public void Register( ) {
		System.out.println("Register method");
	}
	
	@Test (priority = 3)
	public void logout( ) {
		System.out.println("Logout method");
	}
	
//	@BeforeTest
	@BeforeMethod
	public void beforetest() {
		System.out.println("Method called before every test");
	}
	
//	@BeforeTest
	@BeforeMethod
	public void aftertest() {
		System.out.println("Method called after every test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Test method before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Test method after class");
	}
}
