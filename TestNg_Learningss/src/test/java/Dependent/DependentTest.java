package Dependent;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DependentTest {
	@Test
	public void test1() {
		System.out.println("Test1 running");
		assertFalse(true);
	}

	@Test (dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Test2 running");
	}

}
