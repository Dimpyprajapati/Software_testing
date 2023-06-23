package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoTestListener implements ITestListener {
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succesful");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test fail");
	}

}
