package Selenium_Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.model.SelectorList;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternetHerokuapp_Website3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
      
     // Checkbox :- 
        
//       WebElement btn = driver.findElement(By.linkText("Checkboxes"));
//       btn.click();
//       WebElement Cbox1 = driver.findElement(By.xpath("//div[@id='content']/div/form/input[1]"));
//       Cbox1.click();
       
     // Drag&Drop :-
        
//       WebElement btn1 = driver.findElement(By.linkText("Drag and Drop"));
//       btn1.click();
//       
//       WebElement from = driver.findElement(By.id("column-a"));
//       WebElement to = driver.findElement(By.id("column-b"));
//       
//       Actions action = new Actions(driver);
//       action.clickAndHold(from).moveToElement(to).release().build().perform();
//       
     // DropDown :-
        
//       WebElement btn2 = driver.findElement(By.linkText("Dropdown"));
//       btn2.click();
//       
//       WebElement Dlist = driver.findElement(By.id("dropdown"));
//       Dlist.click();
//       Select dlist = new Select(Dlist);
//       dlist.selectByValue("2");
//       Dlist.click();
//       
     //  UploadFile :-
        
//        WebElement btn3 = driver.findElement(By.linkText("File Upload"));
//        btn3.click(); 
//        
//        WebElement Ufile = driver.findElement(By.id("file-upload"));
//        Ufile.sendKeys("C:\\Users\\Dimple Prajapati\\Desktop\\wallpaper.jpg");
        
     //  Multiple_windows :-
        
//        WebElement btn4 = driver.findElement(By.linkText("Multiple Windows"));
//        btn4.click(); 
//        
//        WebElement Mwindows = driver.findElement(By.linkText("Click Here"));
//        Mwindows.click();
//        
//        String mainwindow = driver.getWindowHandle();
//		  System.out.println(mainwindow);
//        
//        Set<String> allwindow = driver.getWindowHandles();
//		  for(String s: allwindow) {
//			if(!s.equals(Mwindows)) {
//				driver.switchTo().window(s);
//			}
//		  }
//		
//		  driver.close();
//		  driver.switchTo().window(mainwindow);
        
    //  Notification msg :-
        
//        WebElement btn5 = driver.findElement(By.linkText("Notification Messages"));
//        btn5.click();
//        String msg = driver.findElement(By.xpath("//div[@id='content']/div/p")).getText();
//        System.out.println(msg);
        
	
	//  Alerts :-
        
        WebElement btn6 = driver.findElement(By.linkText("JavaScript Alerts"));
        btn6.click(); 
        
        WebElement Abtn = driver.findElement(By.xpath("//div[@id='content']/div/ul/li[1]/button"));
        Abtn.click();
        System.out.println("Button Clicked");
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement Abtn1 = driver.findElement(By.xpath("//div[@id='content']/div/ul/li[2]/button"));
        Abtn1.click();
        Alert cancelAlert = driver.switchTo().alert();
        System.out.println(cancelAlert.getText());
        cancelAlert.dismiss();
        
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement Abtn2 = driver.findElement(By.xpath("//div[@id='content']/div/ul/li[3]/button"));
        Abtn2.click();
        Alert tagAlert = driver.switchTo().alert();
        System.out.println(tagAlert.getText());
        tagAlert.sendKeys("Automation testing user");
        tagAlert.accept();
        
	}

}
