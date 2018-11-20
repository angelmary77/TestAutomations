package WDScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownAndMultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Dev\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String sBaseURL = "http://192.168.1.1/qubecentral/login.apx";
		driver.get(sBaseURL);
		
		String sTitleName = driver.getTitle();
		
		int iTitleLength = sTitleName.length();
		System.out.println("The page tile name is: " + sTitleName );
		System.out.println("Length of the Title Name: " + iTitleLength );
		
		String sCurrentURL = driver.getCurrentUrl();
		if(sBaseURL.equals(sCurrentURL)){
			System.out.println("URL verification passed");
		}else{
			System.out.println("The" + sBaseURL + "Does not match with " + sCurrentURL );
		}
		
		String sPageSource = driver.getPageSource();
		int iPageSourceLength = sPageSource.length();
		
		System.out.println("The length of the page source is: " + iPageSourceLength);
		
		driver.close();
		
	}

}
