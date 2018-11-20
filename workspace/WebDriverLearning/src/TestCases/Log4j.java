package TestCases;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
 
import org.apache.log4j.xml.DOMConfigurator;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Log4j {
	private static final TimeUnit SECONDS = null;

	private static WebDriver driver;
	 
	private static Logger Log = Logger.getLogger(Log4j.class.getName());
 
	public static void main(String[] args) throws InterruptedException {
 
		DOMConfigurator.configure("log4j.xml");
 
		// Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        Log.info("New driver instantiated");
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
        Log.info("Implicit wait applied on the driver for 10 seconds");
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        Log.info("Web application launched");
 
        // Find the element that's ID attribute is 'account'(My Account)
 
        driver.findElement(By.id("account")).click();
 
        Log.info("Click action performed on My Account link");
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("log")).sendKeys("TestUser_Mary");
 
        Log.info("Username entered in the Username text box");
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("pwd")).sendKeys("Sammanasu!Mary1");
 
        Log.info("Password entered in the Password text box");
 
        // Now submit the form. WebDriver will find the form for us from the element
 
        driver.findElement(By.id("login")).click();
 
        Log.info("Click action performed on Submit button");

        // Print a Log In message to the screen
 
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
  
        WebElement myAccount = driver.findElement(By.xpath("//*/a[contains(text(), 'Howdy,')]/span[contains(text(),'TestUser_Mary')]"));
        
		Actions action = new Actions(driver);
		
		action.moveToElement(myAccount).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='wp-admin-bar-logout']/a"))).click().perform();
		
        Log.info("Click action performed on Log out link");
 
        // Close the driver
 
        driver.quit();
 
        Log.info("Browser closed");
 
	}
}
