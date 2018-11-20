import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

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
		
		driver.manage().window().maximize();
		driver.get("https://golfclubs.com/");
		String sLintext = driver.findElement(By.xpath("//span[@class='caret-icon']")).getAttribute("class");
		System.out.println(sLintext);
		String sCSSSelector = driver.findElement(By.cssSelector("span[class='caret-icon']")).getAttribute("class");
		System.out.println(sCSSSelector);
		driver.findElement(By.xpath("//span[@class='caret-icon']")).click();
		
		//span[@class='caret-icon']

	}

}