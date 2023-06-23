package ListenerPractical;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBTitle implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		WebDriver driver = (WebDriver)result.getTestContext().getAttribute("myattr");
		TakesScreenshot ss = (TakesScreenshot)driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Dimple Prajapati\\Ss\\title.png");
        
        try {
        	FileUtils.copyFile(source, dest);
        	System.out.println("Screen shoot Taken");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
