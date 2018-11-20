import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFields_Buttons {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Dev\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", "");
			
			}
	
		//TextFields
		//write, read, clear
		driver.manage().window().maximize();
		driver.get("https://golfclubs.com/");
		String sSearch= driver.findElement(By.xpath("//input[@id='s']")).getAttribute("name");
		System.out.println(sSearch);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("iphone");
		String sSearchInput= driver.findElement(By.xpath("//input[@id='s']")).getAttribute("value");
		System.out.println(sSearchInput);
		
		//buttons
		//click, read text
		String buttonS = driver.findElement(By.xpath("//input[@value='Subscribe']")).getAttribute("value");
		System.out.println(buttonS);
		
	}

}
