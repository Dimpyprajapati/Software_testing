package TestNg_Assignment;

import org.testng.annotations.Test;

public class CarLoan_Group {
	@Test
	public void WebLoginCarLoan() {
		System.out.println("Web Login Car Loan");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test (groups = "purchase")
	public void APILoginCarLoan() {
		System.out.println("API Login Car Loan");
	}
}
