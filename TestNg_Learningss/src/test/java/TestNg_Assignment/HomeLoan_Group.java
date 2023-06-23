package TestNg_Assignment;

import org.testng.annotations.Test;

public class HomeLoan_Group {
	@Test 
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home Loan");
	}
	
	@Test (groups = "purchase")
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home Loan");
	}
	
	@Test
	public void APILoginHomeLoan() {
		System.out.println("API Login Home Loan");
	}

}
