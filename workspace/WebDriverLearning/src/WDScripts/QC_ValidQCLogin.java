package WDScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QC_ValidQCLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver","D:\\Dev\\geckodriver-v0.21.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				String sDomainURL = "http://192.168.1.1/qubecentral/";
				String sLoginPageURL = "login.aspx";
				String sURL = sDomainURL + sLoginPageURL;
				driver.get(sURL);
				
				String sTitleName = driver.getTitle();
				
				int iTitleLength = sTitleName.length();
				System.out.println("The page title name is: " + sTitleName );
				System.out.println("Length of the Title Name: " + iTitleLength );
				
				String sCurrentURL = driver.getCurrentUrl();
				if(sURL.equals(sCurrentURL)){
					System.out.println("URL verification passed");
				}else{
					System.out.println("The" + sURL + "Does not match with " + sCurrentURL );
				}
				
				String sPageSource = driver.getPageSource();
				int iPageSourceLength = sPageSource.length();
				
				System.out.println("The length of the page source is: " + iPageSourceLength);
				
				WebElement usrName = driver.findElement(By.id("ctl00_ContentPlaceHolder_Login1_UserName"));
				usrName.sendKeys("Mary");
				WebElement loginPWD = driver.findElement(By.id("ctl00_ContentPlaceHolder_Login1_Password"));
				loginPWD.sendKeys("Angel-123");
				String loginTagName = driver.findElement(By.id("ctl00_ContentPlaceHolder_Login1_Button1")).getTagName();
				System.out.println("The Login Button TagName is: " + loginTagName);
				WebElement clickLoginBtn = driver.findElement(By.id("ctl00_ContentPlaceHolder_Login1_Button1"));
				clickLoginBtn.click();
				
				driver.close();
				
			}

		}
