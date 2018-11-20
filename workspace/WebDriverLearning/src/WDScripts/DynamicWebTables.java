package WDScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		String AppURL = "http://toolsqa.wpengine.com/automation-practice-table";
		driver.get(AppURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
