package testNg.TestNg_Learningss;

import org.testng.annotations.Test;

public class Payment {
	
	@Test (groups = "Purchase")
	public void crditCard() {
		System.out.println("Pay by credit card");
	}
	
	@Test (groups = "Smoke")
	public void debitCard() {
		System.out.println("Pay by dedit card");
	}

	@Test
	public void cod() {
		System.out.println("Pay by cod");
	}
}
