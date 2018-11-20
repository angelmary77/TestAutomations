package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebElement;

public class SWaitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","D:\\Dev\\geckodriver-v0.21.0-win64");
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("ismaary77@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Sammanasu1977");
		
		driver.findElement(By.id("loginbutton")).click();
		
		WebElement profile = driver.findElement(By.xpath("//*/span[text()='Sam']"));
		if(profile.equals("Sam")){
			System.out.println("FB is logged in successfully");
		}
		
		driver.findElement(By.id("logoutMenu")).click();
		
		driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']//span//span[@class='_54nh']")).click();
	}

}
