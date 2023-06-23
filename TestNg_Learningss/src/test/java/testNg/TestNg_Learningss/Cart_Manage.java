package testNg.TestNg_Learningss;

import org.testng.annotations.Test;

public class Cart_Manage {
	
	@Test (groups = {"Purchase","Smoke"})
	public void addtocart() {
		System.out.println("Product Added to cart");
	}
	
	@Test
	public void removefromcart() {
		System.out.println("Product remove to cart");
	}
	
	@Test
	public void editcart() {
		System.out.println("Product edit to cart");
	}

}
