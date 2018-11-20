package WDScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelWaitCommands {
	public static WebDriver driver;
	public static void main(String[] args){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);
		driver.findElement(By.id("timingAlert")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either Alert is displayed or its timed out");
		myAlert.accept();
		System.out.println("Alert is Accepted");
		driver.close();
	}
	
}
