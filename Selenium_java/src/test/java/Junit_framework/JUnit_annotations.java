package Junit_framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_annotations {
	
	@BeforeClass
	public static void singlebefore() {
		System.out.println("Before test single time");
	}
	
	@Before
	public void beforetest() {
		System.out.println("Method running before test");
	}
	
	@Test
	public void test1() {
		System.out.println("Running test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Running test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Running test3");
	}
	
	@Test
	public void test4() {
		System.out.println("Running test4");
	}
	
	@After
	public void aftertest() {
		System.out.println("Method running after test");
	}
	
	@AfterClass
	public static void singleafter() {
		System.out.println("after test single time");
	}


}
