package TestNg_Assignment;

import org.testng.annotations.Test;

public class PersonalLoan_Group {
	@Test (priority = 2,groups = "purchase")
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
	}
	
	@Test (priority = 1)
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");	
	}
	
	@Test (priority = 3)
	public void APILoginPersonalLoan() {
		System.out.println("API Login Personal Loan");
	}

}
